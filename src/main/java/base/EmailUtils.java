package base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeUtility;
import javax.mail.search.SubjectTerm;

import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * @Author: Robin Gupta Date: 29 Sep 2021
 * @Purpose: Utility for interacting with an Email application 📧
 */
public class EmailUtils {

	// Reference from https://angiejones.tech/test-automation-to-verify-email/

	private Folder folder;

	public enum EmailFolder {
		INBOX("INBOX"), TEST("TEST"), SPAM("SPAM");

		private String text;

		private EmailFolder(String text) {
			this.text = text;
		}

		public String getText() {
			return text;
		}
	}

	/**
	 * Connects to email server with credentials provided to read from a given
	 * folder of the email application
	 *
	 * @param username    Email username (e.g. janedoe@email.com)
	 * @param password    Email password
	 * @param server      Email server (e.g. smtp.email.com)
	 * @param emailFolder Folder in email application to interact with
	 */
	public EmailUtils() throws MessagingException {
		//
		// **************************DO NOT COMMIT USERID PASSWORD TO
		// BITBUCKET/Git/Github/Perforce************************************
		//
		// Credentials below are pulled from JENKINS credentials manager
		final String username = System.getenv("Username");
		final String password = System.getenv("Pswd");
		final String emailalias = username;

		String server = "smtp-mail.outlook.com";
		EmailFolder emailFolder = EmailFolder.INBOX;
		Properties props = System.getProperties();
		try {
			props.load(new FileInputStream(new File("src/main/resources/email.properties")));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}

		// Session session = Session.getInstance(props);
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(emailalias, password);// Specify the Username and the PassWord
			}
		});

		// session.setDebug(true); // Enable the debug mode

		// session.setDebug(true);
		// This flag Enables the debug mode .

		Store store = session.getStore("imaps");
		store.connect(server, emailalias, password);
		folder = store.getFolder(emailFolder.getText());
		System.out.println("Folder for reading email is " + folder.getFullName());

		folder.open(Folder.READ_WRITE);
	}

	// ************* GET EMAIL PROPERTIES *******************

	public static String getEmailAddressFromProperties() {
		return System.getProperty("email.address");
	}

	public static String getEmailUsernameFromProperties() {
		return System.getProperty("email.username");
	}

	public static String getEmailPasswordFromProperties() {
		return System.getProperty("email.password");
	}

	public static String getEmailProtocolFromProperties() {
		return System.getProperty("email.protocol");
	}

	public static int getEmailPortFromProperties() {
		return Integer.parseInt(System.getProperty("email.port"));
	}

	public static String getEmailServerFromProperties() {
		return System.getProperty("email.server");
	}

	// ************* EMAIL ACTIONS *******************

	public void openEmail(Message message) throws Exception {
		message.getContent();
	}

	public int getNumberOfMessages() throws MessagingException {
		return folder.getMessageCount();
	}

	public int getNumberOfUnreadMessages() throws MessagingException {
		return folder.getUnreadMessageCount();
	}

	/**
	 * Gets a message by its position in the folder. The earliest message is indexed
	 * at 1.
	 */
	public Message getMessageByIndex(int index) throws MessagingException {
		return folder.getMessage(index);
	}

	public Message getLatestMessage() throws MessagingException {
		return getMessageByIndex(getNumberOfMessages());
	}

	/**
	 * Gets all messages within the folder
	 */
	public Message[] getAllMessages() throws MessagingException {
		return folder.getMessages();
	}

	/**
	 * @param maxToGet maximum number of messages to get, starting from the latest.
	 *                 For example, enter 100 to get the last 100 messages received.
	 */
	public Message[] getMessages(int maxToGet) throws MessagingException {
		Map<String, Integer> indices = getStartAndEndIndices(maxToGet);

		System.out.println("Start index for getMessages method is " + indices.get("startIndex"));
		System.out.println("End index for getMessages method is " + indices.get("endIndex"));

		return folder.getMessages(indices.get("startIndex"), indices.get("endIndex"));
	}

	/**
	 * Searches for messages with a specific subject
	 *
	 * @param subject     Subject to search messages for
	 * @param unreadOnly  Indicate whether to only return matched messages that are
	 *                    unread
	 * @param maxToSearch maximum number of messages to search, starting from the
	 *                    latest. For example, enter 100 to search through the last
	 *                    100 messages.
	 */
	public Message[] getMessagesBySubject(String subject, boolean unreadOnly, int maxToSearch) throws Exception {
		Map<String, Integer> indices = getStartAndEndIndices(maxToSearch);

		Message messages[] = folder.search(new SubjectTerm(subject),
				folder.getMessages(indices.get("startIndex"), indices.get("endIndex")));

		if (unreadOnly) {
			List<Message> unreadMessages = new ArrayList<Message>();
			for (Message message : messages) {
				if (isMessageUnread(message)) {
					unreadMessages.add(message);
				}
			}
			messages = unreadMessages.toArray(new Message[] {});
		}

		return messages;
	}

	/**
	 * Searches for messages with a specific subject
	 *
	 * @param subject     Subject to search messages for
	 * @param maxToSearch maximum number of messages to search, starting from the
	 *                    latest. For example, enter 100 to search through the last
	 *                    100 messages.
	 */
	public Message[] getMessagesBySubject(String subject, int maxToSearch) throws Exception {
		Map<String, Integer> indices = getStartAndEndIndices(maxToSearch);

		Message messages[] = folder.search(new SubjectTerm(subject),
				folder.getMessages(indices.get("startIndex"), indices.get("endIndex")));
		return messages;
	}

	/**
	 * Returns HTML of the email's content
	 */
	public String getMessageContent(Message message) throws Exception {
		/*
		 * StringBuilder builder = new StringBuilder(); BufferedReader reader = new
		 * BufferedReader(new InputStreamReader(message.getInputStream())); String line;
		 * while ((line = reader.readLine()) != null) { builder.append(line); } return
		 * builder.toString();
		 */
//Updated as per https://stackoverflow.com/a/63271188/3077225
		String body = IOUtils.toString(MimeUtility.decode(message.getInputStream(), "quoted-printable"), "UTF-8");

		return body;
	}

	/**
	 * Returns all urls from an email message with the linkText specified
	 */

	public String getUrlsFromMessage(Message message, String linkText) throws Exception {
		Document doc = Jsoup.parse(getMessageContent(message));
		String allmatches;

		Element link = doc.select("a").get(0);
		allmatches = link.attr("href");
		return allmatches;

	}

	public String getFirstUrlFromMessage(Message message, String linkText) throws Exception {
		Document doc = Jsoup.parse(getMessageContent(message));
		String allmatches;

		Element link = doc.select("a").get(1);
		allmatches = link.attr("href");
		return allmatches;

	}

	private Map<String, Integer> getStartAndEndIndices(int max) throws MessagingException {
		int endIndex = getNumberOfMessages();
		int startIndex = endIndex - max;

		// In event that maxToGet is greater than number of messages that exist
		if (startIndex < 1) {
			startIndex = 1;
		}

		Map<String, Integer> indices = new HashMap<String, Integer>();
		indices.put("startIndex", startIndex);
		indices.put("endIndex", endIndex);

		return indices;
	}

	/**
	 * Gets text from the end of a line. In this example, the subject of the email
	 * is 'Authorization Code' And the line to get the text from begins with
	 * 'Authorization code:' Change these items to whatever you need for your email.
	 * This is only an example.
	 */
	public String getAuthorizationCode() throws Exception {
		Message email = getMessagesBySubject("Authorization Code", true, 5)[0];
		BufferedReader reader = new BufferedReader(new InputStreamReader(email.getInputStream()));

		String line;
		String prefix = "Authorization code:";

		while ((line = reader.readLine()) != null) {
			if (line.startsWith(prefix)) {
				return line.substring(line.indexOf(":") + 1);
			}
		}
		return null;
	}

	/**
	 * Gets one line of text In this example, the subject of the email is
	 * 'Authorization Code' And the line preceding the code begins with
	 * 'Authorization code:' Change these items to whatever you need for your email.
	 * This is only an example.
	 */
	public String getVerificationCode() throws Exception {
		Message email = getMessagesBySubject("Authorization Code", true, 5)[0];
		BufferedReader reader = new BufferedReader(new InputStreamReader(email.getInputStream()));

		String line;
		while ((line = reader.readLine()) != null) {
			if (line.startsWith("Authorization code:")) {
				return reader.readLine();
			}
		}
		return null;
	}

	// ************* BOOLEAN METHODS *******************

	/**
	 * Searches an email message for a specific string
	 */
	public boolean isTextInMessage(Message message, String text) throws Exception {
		String content = getMessageContent(message);

		// Some Strings within the email have whitespace and some have break coding.
		// Need to be the same.
		content = content.replace("&nbsp;", " ");
		return content.contains(text);
	}

	public boolean isMessageInFolder(String subject, boolean unreadOnly) throws Exception {
		int messagesFound = getMessagesBySubject(subject, unreadOnly, getNumberOfMessages()).length;
		return messagesFound > 0;
	}

	public boolean isMessageUnread(Message message) throws Exception {
		return !message.isSet(Flags.Flag.SEEN);
	}
}
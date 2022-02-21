
⚡Automation for Salesforce is tough (no , seriously). And every platform release brings the lightning and thunder for UI Automation tests (Winter21 caused even our tests to shiver). So we thought, what if we could find a solution to this madness and create a simple (but robust) framework for Salesforce automation tests.
And solve the problem of flaky tests, while accelerating the development of automation tests. 

Presenting (drum roll 🥁) TestZeus -> An open source automation framework built specifically for Salesforce. 
So what ? Well, this framework has boiler plate code to get you started with test automation for your Salesforce org. 
And just to name a few features : 
* a.Advance utilities like Autolocators 🧙‍♂️ (https://github.com/TestZeus/TestZeus/blob/main/README.md#autolocator-strategy-)
* b.API integrations for REST APIs 🔌
* c.Intelligent Waiting mechanism for Salesforce pages ⌚
* d.Contextual actions for Salesforce UI elements🏹
* e.Basic integrations like Email , Selenium, TESTNG, MAVEN and page objects.✔

The core of the framework works on top of Salesforce's UI API to achieve UI automation.  Dont know what is UI API? 
No worries at all , here is a resource to get you going : https://developer.salesforce.com/docs/atlas.en-us.uiapi.meta/uiapi/ui_api_get_started.htm
 
 And here is a nice diagram from our friends at Salesforce: 
 
![uiAPiimage](https://user-images.githubusercontent.com/7482112/152789742-b0bedc53-7d6e-4565-872e-77150766b43f.png)


## AutoLocator Strategy 🤖:   
This is where the magic happens. We parse the UI API and process the jsonresponse for labels, datatypes and sections to create the actions and locators for the UI elements on the fly. 
Ask me how? See this now : 
![AutoLocators drawio](https://user-images.githubusercontent.com/7482112/152765014-d55d9556-91cb-4b11-a3ab-d9675a5db7f6.png)


## High Level Framework diagram 🏛:
Here is a high level diagram for the framework. The tests can be run from maven or TestNG. 



![TestZeusArchitecture drawio](https://user-images.githubusercontent.com/7482112/153765424-1a863503-c2ec-483c-acec-300668df227e.png)

Podcast around TestZeus : https://youtu.be/iQk0cZuR-ko


## Pre-requisites 🔗:
  * Technical requirements : JAVA, Maven, TestNG, ChromeDriver on the local. 
 * And Non-technical requirements : A beverage of your choice (coffee/tea) and some good music to automate the toughest of test cases. 
  
## Instructions to run🏃‍♂️:
   - Option 1 - Both the UI and API test can be run as standalone TESTNG tests
    OR
   - Option 2- Perform a maven build with (clean install test) goals on the pom.xml

Note: The demo test cases under src\test\java\com\AT\testscripts require credentials from config.json file for authentication and authorization, so dont forget to put in the credentials before trying to run the tests .



## Creating UI Test cases ✒:
As easy as 1-2-3:
 1. Add the Page object class for which the flow has to be modeled
 2. The class variable for the same needs to be added to the BaseTest class for instantiation
 3. Create the actual test class with references to the web elements and corresponding actions from the page object class 


Each test class is extended from BaseTest, thereby inheriting the wrapped methods for @BeforeClass and @BeforeSuite.

BaseTest class also triggers the below 2 things:

 - Page Object Model: The page objects are instantiated at run time via [Reflection]([https://www.oracle.com/technical-resources/articles/java/javareflection.html](https://www.oracle.com/technical-resources/articles/java/javareflection.html))
 - Data setup and post execution clean up of webdriver

Wrapper methods for abstracting the webdriver internals are written in the **PageBase** class.
Methods to interact with UI API and create locators/interactions are setup in the **SFPageBase** class.

  
## Debug tests 🐜:
  Detailed option: Run as -Dtest=SmokeTest -Dmaven.surefire.debug test
  And then: 
  Debug config->set up 5005 port and then continue debugging

Quick Option: As always, adding break points and debug as TestNG test

## Video Demo
Under 5 minute video to show you the highlights of the framework and a demo of the execution :


https://user-images.githubusercontent.com/7482112/152846537-db5ee79d-ce29-436f-b57f-2c4e9405b275.mp4



## Why is the name TestZeus?
Zeus is the God of lightning and thunder and we want this framework to be the same with Lightning platform. 
(plus we got the domain name for a cheap price 🤗)

## Summary 🙏
- Stop writing flaky locators and cryptic xpaths for Webelements on the Salesforce UI. We  source the locator values for your scripts from the Salesforce UI API , so that you can focus more on building tests and less on maintenance
- The world of testing for Salesforce can be fast-paced and scary. That's why we are together in this mission and need your help to spread the word, try the framework or contribute to our codebase. And we have a long road ahead of us, so lets join forces to automate Salesforce

## Support ☎
You can find a happy and helping community of Test Automation/QA folks at the below link: 

https://trailhead.salesforce.com/en/trailblazer-community/groups/0F93A000000DQPdSAO?sort=LAST_MODIFIED_DATE_DESC&tab=discussion#

And if you would like to technically contribute/raise an issue, then feel free to open a ticket on this Github Repo.

Note : We are in no way directly or indirectly associated with Salesforce (yet). 

Made with ♥ in India.



![testzeusanimated](https://user-images.githubusercontent.com/7482112/152791284-53556ac2-ccd4-419d-a8c7-1e8036aafea8.gif)


<a href="https://www.buymeacoffee.com/robin" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/default-orange.png" alt="Buy Me A Coffee" height="20" width="87"></a>

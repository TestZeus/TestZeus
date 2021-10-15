# TestZeus ⚡
World's first Open source Ui automation framework built specifically for Salesforce

## High Level Framework diagram 🏛:


![TestZeusArchitecture](https://user-images.githubusercontent.com/7482112/137503566-2fae7c6f-e4e1-4f31-b18d-426e2c91d578.jpg)


## Pre-requisites 🔗:
  JAVA, Maven, TestNG, ChromeDriver on the local
  
 ## Instructions to run🏃‍♂️:
    Option 1 - Both the UI and API test can be run as standalone TESTNG tests
    OR
    Option 2- Perform a maven build with (clean install test) goals on the pom.xml
   
 ## PowerLocator Strategy 🤖:   
![PowerLocators](https://user-images.githubusercontent.com/7482112/135152007-1a950dd6-2368-4138-a527-f40d698ce7b5.jpg)


  

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

  
## Debug tests 🐜:
  Detailed option: Run as -Dtest=SmokeTest -Dmaven.surefire.debug test
  And then: 
  Debug config->set up 5005 port and then continue debugging

Quick Option: As always, adding break points and debug as TestNG test

## Coding Standards 👨‍💻:
Coding Standards for Components: It is recommended to write components name by its purpose. This approach improves the readability and maintainability of code.
Coding Standards for Classes: Usually class name should be noun starting with uppercase letter. If it contains multiple word than every inner word should start with uppercase.
Eg: String, StringBuffer, Dog

Coding Standards for Interface: Usually interface name should be adjective starting with uppercase letter. If it contains multiple word than every inner word should start with uppercase.
Eg: Runnable, Serializable, Comparable

Coding Standards for Methods: Usually method name should either be verb or verb noun combination starting with lower letter. If it contains multiple word than every inner word should start with uppercase.
Eg: print(), sleep(), setSalary()

Coding Standards for Variables: Usually variable name should be noun starting with lowercase letter. If it contains multiple word than every inner word should start with uppercase.
Eg: name, age. mobileNumber

Coding Standards for Constants: Usually constant name should be noun. It should contain only uppercase If it contains multiple word than words are separated with ( _ ) underscore symbol. Usually we declare constants with public static and final modifiers.

Java Bean Coding Standards: A Java Bean is a simple java class with private properties and public getter and setter methods
Getter Methods:
It should be public method
Method name should be prefixed with “get”
It should not take any argument
Setter Methods:
It should be public method
Return Type should be void
Method name should be prefixed with “set”
It should take some argument
public class StudentBean{
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}
}

Note: For boolean properties getter method can be prefixed with “get” or “is”

Coding convention for Listners:
To register a Listner method name should prefixed with add
Eg: public void addMyAccountListner( MyActionListner);
To unregister a Listner method name should prefixed with remove
Eg: public void removeMyAccountListner( MyActionListner);

Restrict the usage of **Thread.sleep()** as it adds non-deterministic nature to the flow. All of these methods, should be replaced by **explicitWaits**

Test specific test data should be setup on the Test Class and generic data should be configured in the config.json file.

Complete Java Style Guide can be found here: https://google.github.io/styleguide/javaguide.html

Made with ♥ in India.

![testzeus (1)](https://user-images.githubusercontent.com/7482112/135205529-420c503f-ad4e-4a42-81b8-5604a7514add.jpg)


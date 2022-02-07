# ⚡ Open source UI automation framework built specifically for Salesforce [(with Autolocators) 🧙‍♂️] (https://github.com/TestZeus/TestZeus/blob/main/README.md#autolocator-strategy-)

## High Level Framework diagram 🏛:


![TestZeusArchitecture drawio](https://user-images.githubusercontent.com/7482112/152764945-5db3052b-3125-4b23-b2ee-1bab49dbc7b6.png)




## Pre-requisites 🔗:
  JAVA, Maven, TestNG, ChromeDriver on the local
  
 ## Instructions to run🏃‍♂️:
    Option 1 - Both the UI and API test can be run as standalone TESTNG tests
    OR
    Option 2- Perform a maven build with (clean install test) goals on the pom.xml
   
 ## AutoLocator Strategy 🤖:   

![AutoLocators drawio](https://user-images.githubusercontent.com/7482112/152765014-d55d9556-91cb-4b11-a3ab-d9675a5db7f6.png)

  

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


Made with ♥ in India.

![testzeus (1)](https://user-images.githubusercontent.com/7482112/135205529-420c503f-ad4e-4a42-81b8-5604a7514add.jpg)

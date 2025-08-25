Feature: Login functionality 

Background:

Given setup the entries in database
When launch the site from config variables
And hit the homepage url of the site

  Scenario: Admin page login
    Given User is on landing Page
    When user login to application with "adminuser" and "password1" 
    #give the actual usernmae and password
    Then Home on land page
    And should see the cards displaying
 
 
 #Reusable advantae of cucmber - reusable of steps   
 #Generic method
 Scenario: customer page login
    Given User is on landing Page
    When user login to application with "usercred" and "userPassword"
    Then Home on land page
    And should see the cards displaying
    
    #for parameterized method
Scenario Outline: Different user login

 Given User is on landing Page
    When user login to application with "<usercred>" and "<userPassword>"
    Then Home on land page
    And should see the cards displaying
    
    Examples:
    |usercred|userPassword |
   |Anu | pass22|
    |Mahi | Pass23 |
    
    #Regex pattern
    @Regression
    Scenario: customer page login
    Given User is on landing Page
    When user login to the application with "avm" and 123
    Then Home on land page
    And should see the cards displaying
    
    
    ###
    @smokeTest @Regression
     Scenario: customer page login multtiple input
    Given User is on landing Page
    When user signup into application
    |Mona|
    |CV|
    |abc@gmail.com|
    |234556789|
    Then Home on land page
    And should see the cards displaying
    

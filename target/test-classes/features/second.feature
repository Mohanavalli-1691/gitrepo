Feature: Login functionality 

Background:


When launch the site from config variables
And hit the homepage url of the site
@Regression @Mortage
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
    @Regression @NetBanking
    Scenario: customer page login
    Given User is on landing Page
    When user login to the application with "avm" and 123
    Then Home on land page
    And should see the cards displaying
    
    
    
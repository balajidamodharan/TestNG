
@tag
Feature: User wants to test the login functionality
  

  @tag1
  Scenario: User login the facebook page
    Given User launch the facebook application
    When User enter the username 
   |username|password|
   |balaji|bala|
   |bala|bd|
   |greens|tech|
    And User enter the password
    |username|password|
    |kvani|kv|
    |greens|technology|
    |sruthi|kalai|
    And User click the loginbutton
    Then User navigate to the current Url
    And User close the browser

  
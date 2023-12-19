Feature: user should be able to verify

  #4. verifyErrorMessageWithInvalidCredentials()
    #Enter username <username>
    #Enter password <password>
    #Click on Login Button
    #Verify Error message <errorMessage>

  @Mahak @regression
  Scenario Outline: User should be able to see error message when logging in using invalid credentials
    Given User is on login page
    When User enter Username "<username>"
    And  User enter Password "<password>"
    And  User clicks on login button
    Then User verifies error Text "<errorMessage>"

    Examples:
      | username          | password | errorMessage        |
      |                   |          | Required            |
      | test123@gmail.com |          | Required            |
      |                   | test123  | Required            |
      | test123@gmail.com | test123  | Invalid credentials |
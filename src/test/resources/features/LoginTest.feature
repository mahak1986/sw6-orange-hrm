Feature:Add User Test feature
  As a User, I should be able to check Login Test features

  Background: User is on Login Page
    When      User enters Username "Admin"
    And       User enters password "admin123"
    Then      User clicks on login button

    #2. logintest.feature
    #Inside logintest.feature create following scenarios
    #1. verifyUserShouldLoginSuccessFully()
    #Enter username
    #Enter password
    #Click on Login Button
    #Verify "Dashboard" text

  @Mahak @smoke @sanity @regression
  Scenario: User should be able to login successfully
    And User verifies "Dashboard" text


    #3. verifyUserShouldLogOutSuccessFully()
    #Login To The application
    #Click on User Profile logo
    #Mouse hover on "Logout" and click
    #Verify the text "Login Panel" is displayed

  @Mahak @regression
  Scenario: User should be able to logout successfully
    And     User clicks on profile logo
    Then    User mouse hover on logout and click
    And     User verifies "Login" text is displayed







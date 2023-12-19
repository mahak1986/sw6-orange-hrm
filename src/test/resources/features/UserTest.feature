Feature:Add User Test feature
  As a User, I should be able to check Add User Test features

  Background: User is on Login Page
    When      User enters Username "Admin"
    And       User enters password "admin123"
    Then      User clicks on login button
    #.usertest.feature
    #Inside usertest.feature create following scenarios
    #1.adminShouldAddUserSuccessFully().
    #Login to Application
    #click On "Admin" Tab
    #Verify "System Users" Text
    #click On "Add" button
    #Verify "Add User" Text
    #Select User Role "Admin"
    #enter Employee Name "Ananya Dash"
    #enter Username
    #Select status "Disable"
    #enter psaaword
    #enter Confirm Password
    #click On "Save" Button
    #verify message "Successfully Saved"
  @Mahak @smoke @sanity @regression
  Scenario: Admin should add user successfully
    When User navigates to add user page
    Then User clicks on Admin tab
    And  User verifies "System Users" Text
    And  User clicks on add button
    Then User verify Text "Add User"
    Then User Select User Role "Admin"
    And  User enters employee name "Lisa  Andrews"
    And  User enters Username "username"
    And  User selects status "Disabled"
    And  User enters password
    And  User enters confirm password
    Then User clicks on save button

    #2. searchTheUserCreatedAndVerifyIt().
    #Login to Application
    #click On "Admin" Tab
    #Verify "System Users" Text
    #Enter Username
    #Click on "Search" Button

  @Mahak @smoke @regression
    Scenario: Search the user created
    When User clicks on Admin tab
    And  User verifies "System Users" Text
    And  User enters username "Admin"
    Then User clicks on search button

    #3. verifyThatAdminShouldDeleteTheUserSuccessFully().
    #Login to Application
    #click On "Admin" Tab
    #Verify "System Users" Text
    #Enter Username
    #Select User Role
    #Select Status
    #Click on "Search" Button
    #Verify the User should be in Result list.
    #Click on Check box
    #Click on Delete Button
    #Popup will display
    #Click on Ok Button on Popup
    #verify message "Successfully Deleted"

  @Mahak @regression
    Scenario: Admin should be able to delete the user successfully
    When User clicks on Admin tab
    And  User verifies "System Users" Text
    And  User clicks on add button
    Then User verify Text "Add User"
    Then User Select User Role "Admin"
    And  User enters employee name "Lisa  Andrews"
    And  User enters password
    And  User enters confirm password
    Then User clicks on save button
    And  User enters username "Admin"
    Then User clicks on search button
    Then User clicks on delete button
    And User clicks on yes pop up delete button






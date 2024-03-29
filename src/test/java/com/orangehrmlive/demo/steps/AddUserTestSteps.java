package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddUserTestSteps {
    @When("User enters Username {string}")
    public void userEntersUsername(String arg0) {
        new LoginPage().enterUserName("Admin");
    }

    @And("User enters password {string}")
    public void userEntersPassword(String arg0) {
        new LoginPage().enterPassword("admin123");
    }

    @Then("User clicks on login button")
    public void userClicksOnLoginButton() {
        new LoginPage().ClickOnLoginButton();
    }

    @When("User navigates to add user page")
    public void userNavigatesToAddUserPage() {
        System.out.println("User navigates to Add user page");
    }

    @Then("User clicks on Admin tab")
    public void userClicksOnAdminTab() {
        new HomePage().clickOnAdminLink();
    }

    @And("User verifies {string} Text")
    public void userVerifiesText(String arg0) {
        String expected = "System Users";
        String actual = new ViewSystemUsersPage().verifySystemUsersText();
        Assert.assertEquals(actual, expected, "Error Message");
    }

    @And("User clicks on add button")
    public void userClicksOnAddButton() {
        new ViewSystemUsersPage().clickOnAddButton();

    }
    @Then("User verify Text {string}")
    public void userVerifyText(String arg0) {
        String expected = "Add User";
        String actual = new AddUserPage().verifyAddUserText();
        Assert.assertEquals(actual,expected,"No add user text found");

    }
    @Then("User Select User Role {string}")
    public void userSelectUserRole(String arg0) {
        new AddUserPage().mouseHoverOnUserRole();
        new AddUserPage().selectOnUserRoleDropDown();
    }


    @And("User enters employee name {string}")
    public void userEntersEmployeeName(String name) throws InterruptedException {
       new AddUserPage().addEmployeeName("Lisa  Andrews");
        Thread.sleep(2000);
        new AddUserPage().employeeName();

    }

    @And("User enters Username")
    public void userEntersUsername() {
        new AddUserPage().enterUsername("TestUser1");
    }

    @And("User selects status {string}")
    public void userSelectsStatus(String arg0) throws InterruptedException {
        new AddUserPage().dropDownSelectStatus();
        Thread.sleep(2000);
        new AddUserPage().statusDropdownOnAddUserPage();
    }

    @And("User enters password")
    public void userEntersPassword() {
        new AddUserPage().enterPassword("Lisa123");
    }

    @And("User enters confirm password")
    public void userEntersConfirmPassword() {
        new AddUserPage().confirmPassword("Lisa123");
    }

    @Then("User clicks on save button")
    public void userClicksOnSaveButton() {
        new AddUserPage().clickOnSaveButton();
    }

    @And("User enters username {string}")
    public void userEntersusername(String arg0) {
        new ViewSystemUsersPage().enterUsername("TestUser1");
    }

    @Then("User clicks on search button")
    public void userClicksOnSearchButton() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }


    @Then("User clicks on delete button")
    public void userClicksOnDeleteButton() {
        new ViewSystemUsersPage().clickOnDeleteButton();
    }

    @And("User clicks on yes pop up delete button")
    public void userClicksOnYesPopUpDeleteButton() {
        new ViewSystemUsersPage().clickOnYesDeleteButton();
    }
}





package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginTestSteps {
    @And("User verifies {string} text")
    public void userVerifiesText(String arg0) {
        String expected = "Dashboard";
        String actual = new DashboardPage().verifyDashboardText();
        Assert.assertEquals(actual,expected,"Dashboard text not displayed");
    }

    @And("Verify logo is displayed")
    public void verifyLogoIsDisplayed() {
        new LoginPage().getLogoElement();
    }

    @And("User clicks on profile logo")
    public void userClicksOnProfileLogo() {
        new HomePage().clickOnUserProfileLogo();
    }

    @Then("User mouse hover on logout and click")
    public void userMouseHoverOnLogoutAndClick() {
        new LoginPage().mouseHoverAndClickOnLogout();
    }

    @And("User verifies {string} text is displayed")
    public void userVerifiesTextIsDisplayed(String arg0) {
        String expected = "Login";
        String actual = new LoginPage().verifyLoginPanel();
        Assert.assertEquals(actual,expected,"Login is not displayed");

    }

    @When("User enter Username {string}")
    public void userEnterUsername(String username) {
        new LoginPage().enterUserName(username);

    }

    @And("User enter Password {string}")
    public void userEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }


    @Then("User verifies error Text {string}")
    public void userVerifiesErrorText(String arg0) {
        String expected = "Required";
        String actual = new LoginPage().requiredErrorMessage();
        Assert.assertEquals(actual,expected,"Required not displayed");
        String expected1 = "Invalid credentials";
        String actual1 = new LoginPage().invalidCredentialsMessage();
        Assert.assertEquals(actual,expected,"Invalid credentials not displayed");

    }

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("User is on login page");
    }
}

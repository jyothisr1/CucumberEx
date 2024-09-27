package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

    LoginPage loginPage;
    @Given("user opens website")
    public void user_opens_website() {
        loginPage=new LoginPage();
        loginPage.openWebsite();
    }

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {

    }

    @When("user login with valid credentials")
    public void user_login_with_valid_credentials() {

    }

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {

    }

    @And("click on logout link")
    public void clickOnLogoutLink() {

    }

    @When("user click on user icon")
    public void userClickOnUserIcon() {
    }

    @Then("verify invalid login error message is displayed")
    public void verifyInvalidLoginErrorMessageIsDisplayed() {
        
    }

    @When("user login with username {string} and password {string}")
    public void userLoginWithUsernameAndPassword(String arg0, String arg1) {
        
    }

    @When("user click on admin")
    public void userClickOnAdmin() {
        
    }

    @Then("verify user is on admin page")
    public void verifyUserIsOnAdminPage() {
    }

    @Then("verify date entry with date displayed")
    public void verifyDateEntryWithDateDisplayed() {
        
    }

    @Then("verify user is on homepage")
    public void verifyUserIsOnHomepage() {
        
    }

    @And("click on my leave")
    public void clickOnMyLeave() {
        
    }

    @Then("validate the list of users are greater than or equal one")
    public void validateTheListOfUsersAreGreaterThanOrEqualOne() {
        
    }

    @And("click on search button")
    public void clickOnSearchButton() {
        
    }

    @And("select user role as admin")
    public void selectUserRoleAsAdmin() {
        
    }

    @When("user click on leave menu")
    public void userClickOnLeaveMenu() {
        
    }

    @Then("verify user is on leave page")
    public void verifyUserIsOnLeavePage() {
        
    }

    @When("click on apply button")
    public void clickOnApplyButton() {
        
    }

    @Then("leave application form is displayed")
    public void leaveApplicationFormIsDisplayed() {
        
    }

    @And("select random leave type")
    public void selectRandomLeaveType() {
        
    }

    @And("enter leave date")
    public void enterLeaveDate() {
        
    }

    @And("select partial days to all days")
    public void selectPartialDaysToAllDays() {
        
    }

    @And("duration half day morning")
    public void durationHalfDayMorning() {
        
    }

    @Then("verify the success message is displayed")
    public void verifyTheSuccessMessageIsDisplayed() {
    }
}

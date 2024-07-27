package stepDefinitions;

import com.microsoft.playwright.Playwright;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import utils.PlaywrightManager;
import utils.PlaywrightManager;
import com.microsoft.playwright.*;

public class StepDefinitions {
    Page page = PlaywrightManager.getPage();
    LoginSteps loginSteps = new LoginSteps();

    @Given("User is on Login Page")
    public void userIsOnLoginPage() {
        loginSteps.user_is_on_login_page();
    }

    @When("User enters valid {string} and {string}")
    public void userEntersValidCredentials(String email, String password) {
        loginSteps.user_enters_valid_and(email, password);
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        loginSteps.user_clicks_on_login_button();
    }

    @Then("User is redirected to the Home Page")
    public void userIsRedirectedToHomePage() {
        loginSteps.user_is_redirected_to_the_home_page();
    }
}

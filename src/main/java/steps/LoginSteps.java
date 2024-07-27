package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    
    WebDriver driver;
    
    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srian\\Downloads\\latestchromedriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://pluralsight.com/login");
    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("Username"));
        WebElement passwordField = driver.findElement(By.id("Password"));
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
    }

    @Then("User is redirected to the Home Page")
    public void user_is_redirected_to_the_home_page() {
        String expectedUrl = "https://www.pluralsight.com/";
        String actualUrl = driver.getCurrentUrl();
        assert(expectedUrl.equals(actualUrl));
        driver.quit();
    }
}

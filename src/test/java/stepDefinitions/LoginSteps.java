package stepDefinitions;


import org.openqa.selenium.WebDriver;
import DriverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginSteps {
	WebDriver driver = DriverFactory.getDriver();
	LoginPage loginPage;
	
	@Given("user is on login page")
	public void user_in_loginPage() {
		driver.get("https://demo.automationtesting.in/Index.html");
		loginPage = new LoginPage(driver);
	}
	@Then("Enter emailID for sign in {string}")
	public void enter_enterEmailIdForSignIn(String emailIdVal) {
		loginPage.enterEmailIdForSignIn(emailIdVal);
	}
	@Then("Enter username {string}")
	public void enter_userName(String username) {
		loginPage.enterUserName(username);
	}
	@Then("Enter password {string}")
	public void enter_password(String password) {
		loginPage.enterPassword(password);
	}
	@Then("user clicks login button")
	public void click_login_butten() {
		loginPage.clickLogin();
	}
	@Then("user clicks signIn next button")
	public void click_signin_next_butten() {
		loginPage.clickSignUp();
	}
	@Then("user should be redirected to home page")
	public void user_should_be_redirected_to_home_page() {
        System.out.println("Login successful");
        //driver.quit();
    }	
	
	
}

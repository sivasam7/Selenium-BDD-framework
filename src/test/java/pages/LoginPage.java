package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By emailIdForSignIn = By.xpath("//input[@type = 'text' and @placeholder='Email id for Sign Up']");
	By userNameFld = By.xpath("//input[@type = 'text' and @placeholder='E mail']");
	By passWordFld = By.xpath("//input[@type='password' and @placeholder ='Password']");
	By lodinBtun = By.id("enterbtn");
	By signUpBtn = By.xpath("//img[@id='enterimg']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void enterEmailIdForSignIn(String emailIdVal) {
		driver.findElement(emailIdForSignIn).sendKeys(emailIdVal);
	}
	public void enterUserName(String userNameVal) {
		driver.findElement(userNameFld).sendKeys(userNameVal);
	}
	
	public void enterPassword(String passwordVal) {
		driver.findElement(passWordFld).sendKeys(passwordVal);
	}
	
	public void clickLogin() {
		driver.findElement(lodinBtun).click();
	}
	
	public void clickSignUp() {
		driver.findElement(signUpBtn).click();
	}
	
	
}

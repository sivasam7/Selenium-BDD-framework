package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register{
	WebDriver driver;
	Register(WebDriver driver){
		this.driver = driver;
	}
	
	//Register page webelements xpaths
	private By firstNameFld = By.xpath("//input[@type='text' and @placeholder='First Name']");
	private By lastNameFld = By.xpath("//input[@type ='text' and @placeholder ='Last Name']");
	private By addressFld = By.xpath("//div[textarea[@class = 'form-control ng-pristine ng-valid ng-touched' and @ng-model = 'Adress']]");
	private By emailAddFld = By.xpath("//input[contains(@type,'email')]");
	private By phoneNumFld = By.xpath("//input[contains(@type,'tel') and @ng-model = 'Phone']");
	private By genderRadio(String gender) {
		return By.xpath(String.format("//input[@type='radio'and @value = '%s']",gender));
	}
	private By hobbySelect(String hobby) {
		return By.xpath(String.format("//input[@type = 'checkbox' and @value ='%s']", hobby));
	}
	private By languagesFld(String language) {
		return By.xpath("//ul[contains(@class,'ui-autocomplete')]//a[normalize-space()='" + language + "']");
	}
	
	
	
	//Register page fields
	public void firstName(String firstName) {
		driver.findElement(firstNameFld).sendKeys(firstName);
	}
	
	public void lastName(String lastName) {
		driver.findElement(lastNameFld).sendKeys(lastName);
	}
	
	public void address(String addressVal) {
		driver.findElement(addressFld).sendKeys(addressVal);
	}
	
	public void emailAddress(String emailAddVal) {
		driver.findElement(emailAddFld).sendKeys(emailAddVal);
	}
	
	public void phoneNumber(String phoneNumVal) {
		driver.findElement(phoneNumFld).sendKeys(phoneNumVal);
	}
	
	public void gender(String genderVal) {
		driver.findElement(genderRadio(genderVal)).click();
	}
	
	public void hobbies(String hobbyVal) {
		driver.findElement(hobbySelect(hobbyVal)).click();

	}
	
	public void languages(String languageVal) {
		driver.findElement(languagesFld(languageVal)).click();
		
	}
}
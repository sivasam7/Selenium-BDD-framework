package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register{
	WebDriver driver;
	
	By firstNameFld = By.xpath("//input[@type='text' and @placeholder='First Name']");
	By secondNameFld = By.xpath("//input[@type ='text' and @placeholder ='Last Name']");
	By addressFld = By.xpath("//div[textarea[@class = 'form-control ng-pristine ng-valid ng-touched' and @ng-model = 'Adress']]");
	By emailAddFld = By.xpath("//input[contains(@type,'email')]");
	By phoneNumFld = By.xpath("//input[contains(@type,'tel') and @ng-model = 'Phone']");
	By maleRadioButten = By.xpath("//input[@type='radio'and @value = 'Male']");
	By femaleRadioButten = By.xpath("//input[@type='radio'and @value = 'FeMale']");
	
	Register(WebDriver driver){
		this.driver = driver;
	}
	
	public void firstName(String firstName) {
		driver.findElement(firstNameFld).sendKeys(firstName);
	}
	
	public void secondName(String secondName) {
		driver.findElement(secondNameFld).sendKeys(secondName);
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
		if(genderVal.equalsIgnoreCase("Male")) {
			driver.findElement(maleRadioButten).click();
		}else if(genderVal.equalsIgnoreCase("Female")){
			driver.findElement(femaleRadioButten).click();
		}
	}
}
package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Common.CommonFunctions;

public class Register{
	private WebDriver driver;
	private CommonFunctions commonFun;
	
	public Register(WebDriver driver){
		this.driver = driver;
		this.commonFun = new CommonFunctions(driver);
	}
	
	//Register page webelements xpaths
	private By firstNameFld = By.xpath("//input[@type='text' and @placeholder='First Name']");
	private By lastNameFld = By.xpath("//input[@type ='text' and @placeholder ='Last Name']");
	private By addressFld = By.xpath("//textarea[@ng-model = 'Adress']");
	private By emailAddFld = By.xpath("//input[contains(@type,'email')]");
	private By phoneNumFld = By.xpath("//input[contains(@type,'tel') and @ng-model = 'Phone']");
	private By genderRadio(String gender) {
		return By.xpath(String.format("//input[@type='radio'and @value = '%s']",gender));
	}	
	private By hobbySelect(String hobby) {
		return By.xpath(String.format("//input[@type = 'checkbox' and @value ='%s']", hobby));
	}
	private By languagesFld(String language) {
		return By.xpath("//ul[contains(@class,'ui-autocomplete')]//a[normalize-space()='"+language+"']");
	}
	private By skillsSelectFld = By.xpath("//select[@id='Skills']");
	private By countryBtn = By.xpath("//span[@class = 'select2-selection__arrow' and @role ='presentation']");
	private By countryFld = By.xpath("//input[@class ='select2-search__field' and @type='search']");
	
	private By yearFld = By.xpath("//select[@type='text' and @id = 'yearbox']");
	private By monthFld = By.xpath("//select[@type='text' and contains(@placeholder, 'Month')]");
	private By dayFld = By.xpath("//select[@type='text' and contains(@placeholder, 'Day')]");
	private By passwardFld = By.xpath("//input[@id='firstpassword']");
	private By confirmPasswardFld = By.xpath("//input[@id='secondpassword']");
	
	
	
	
	
	
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
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(languagesFld(languageVal)));
		driver.findElement(languagesFld(languageVal)).click();	
	}
	
	public void skills(String skillsVal) {
		WebElement skillDropDown = driver.findElement(skillsSelectFld);
		Select select = new Select(skillDropDown);
		select.selectByValue(skillsVal);
	}
	
	public void selectCountry(String countryVal) {
		driver.findElement(countryBtn).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement selectCountryVal = wait.until(ExpectedConditions.visibilityOfElementLocated(countryFld));
		selectCountryVal.sendKeys(countryVal);
		selectCountryVal.sendKeys(Keys.ENTER);
	}
	public void selectYear(String yearVal) {
		commonFun.selectByValue(yearFld, yearVal);
	}
	
	public void selectMonth(String monthVal) {
		commonFun.selectByValue(monthFld, monthVal);
	}
	
	public void selectDay(String dayVal) {
		commonFun.selectByValue(dayFld, dayVal);
	}
	
	public void passward(String passVal) {
		driver.findElement(passwardFld).sendKeys(passVal);
	}
	
	public void confirmPassward(String confrimpassVal) {
		driver.findElement(confirmPasswardFld).sendKeys(confrimpassVal);
	}
}
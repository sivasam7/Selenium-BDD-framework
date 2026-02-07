package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import Common.CommonFunctions;

public class AlertsPage{
	private WebDriver driver;
	private Alert alert;
	//private CommonFunctions commonFun; 
	
	public AlertsPage(WebDriver driver){
		this.driver = driver;
		//this.commonFun = new CommonFunctions(driver);
	}
	
	By alertButton = By.xpath("//button[@onclick='alertbox()']");
	By alertWithOkAndCancelButtonTab = By.xpath("//a[normalize-space()='Alert with OK & Cancel']");
	By alertWithOkAndCancelButton = By.xpath("//button[normalize-space()='click the button to display a confirm box']");
	By alertWithTextButtontab = By.xpath("//a[normalize-space()= 'Alert with Textbox']");
	By alertWithTextFieldButton = By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']");
	By alertWithOkAndCancelButtonText = By.xpath("//p[@id=\"demo\"]/preceding-sibling::button[normalize-space() = 'click the button to display a confirm box']");
	By alertWithTextFieldButtonText = By.xpath("//p[@id=\"demo1\"]/preceding-sibling::button[normalize-space() = 'click the button to demonstrate the prompt box']");
	
	public void clickAlertButton() {
		driver.findElement(alertButton).click();
	}
	
	public void alertWithOkay() {
		alert = driver.switchTo().alert();
		String alertMessage1 = alert.getText();
		alert.accept();
		System.out.println(alertMessage1);
	}
	
	public void navigateToAlertWithOkAndCancelButton() {
		driver.findElement(alertWithOkAndCancelButtonTab).click();
	}
	
	public void clickAlertWithOkAndCancelButton() {
		driver.findElement(alertWithOkAndCancelButton).click();
	}
	
	public void alertWithOkayAndCancel() {
		alert = driver.switchTo().alert();
		String alertMessage2 = alert.getText();
		alert.dismiss();
		System.out.println(alertMessage2);
		String alertText1 = driver.findElement(alertWithTextFieldButtonText).getText();
		System.out.println(alertText1);
	}
	
	public void navigateToAlertWithTextButton() {
		driver.findElement(alertWithTextButtontab).click();
	}
	
	public void clickAlertWithTextField() {
		driver.findElement(alertWithTextFieldButton).click();
	}
	
	public void alertWithTextHande(String alertText) {
		alert = driver.switchTo().alert();
		String alertMessage3 = alert.getText();
		alert.sendKeys(alertText);
		alert.accept();
		System.out.println(alertMessage3);
		String alertText2 = driver.findElement(alertWithTextFieldButtonText).getText();
		System.out.println(alertText2);

	}
	
	
}
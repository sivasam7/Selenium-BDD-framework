package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import Common.CommonFunctions;

public class AlertsPage{
	private WebDriver driver;
	//private CommonFunctions commonFun; 
	
	public AlertsPage(WebDriver driver){
		this.driver = driver;
		//this.commonFun = new CommonFunctions(driver);
	}
	
	By alertButton = By.xpath("//button[@onclick='alertbox()']");
	
	public void clickAlertButton() {
		driver.findElement(alertButton).click();
	}
	
	public void alertWithOkay() {
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		alert.accept();
		System.out.println(alertMessage);
	}
	
	
}
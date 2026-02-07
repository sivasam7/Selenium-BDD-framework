package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigations{
	private WebDriver driver;
	
	public Navigations(WebDriver driver) {
		this.driver = driver;
	}
	
	By registerPagNav = By.xpath("");
	By switchToPage = By.xpath("//a[@href ='SwitchTo.html' and text() = 'SwitchTo']");
	By switchToAlertsPage = By.xpath("//a[@href ='Alerts.html' and text() = 'Alerts']");
	
	
	public void navigateToAlertPage() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(switchToPage)).perform();
		driver.findElement(switchToAlertsPage).click();
	}
	
}
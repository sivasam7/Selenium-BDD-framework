package stepDefinitions;

import org.openqa.selenium.WebDriver;

import DriverManager.DriverFactory;
import Navigation.Navigations;
import io.cucumber.java.en.Then;

public class NavigationSteps{
	
	WebDriver driver = DriverFactory.getDriver();
	Navigations navigations = new Navigations(driver);
	
	@Then("Navigate to Alerts page")
	public void navigate_to_alerts_page() {
		navigations.navigateToAlertPage();
	}
	
}
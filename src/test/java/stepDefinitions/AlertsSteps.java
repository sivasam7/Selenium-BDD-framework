package stepDefinitions;

import org.openqa.selenium.WebDriver;

import DriverManager.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AlertsPage;

public class AlertsSteps{
	WebDriver driver = DriverFactory.getDriver();
	AlertsPage alertPage = new AlertsPage(driver);
	
	@And("Click alert Button")
	public void click_alert_button() {
		alertPage.clickAlertButton();
	}
	
	@Then("Accept the alert and Get Text")
	public void handle_alert() {
		alertPage.alertWithOkay();
	}
}
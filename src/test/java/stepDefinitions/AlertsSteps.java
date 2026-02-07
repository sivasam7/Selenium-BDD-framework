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
	
	@And("Navigate to alert with ok & cancel Button tab")
	public void navigate_to_alert_with_OkandCancel_button_field() {
		alertPage.navigateToAlertWithOkAndCancelButton();
	}
	
	@And("Click dismiss alert Button")
	public void click_dismiss_alert_button() {
		alertPage.clickAlertWithOkAndCancelButton();
	}
	
	@And("Handle the dismiss button")
	public void handle_dismiss_alert_button() {
		alertPage.alertWithOkayAndCancel();
	}
	
	@And("Navigate to alert with text Button tab")
	public void navigate_to_alert_with_text_button_field() {
		alertPage.navigateToAlertWithTextButton();
	}
	
	@And("click text alert button")
	public void click_text_alert_button() {
		alertPage.clickAlertWithTextField();
	}
	
	@And("Handle the text alert by sending {string}")
	public void handle_text_alert_button(String textVal) {
		alertPage.alertWithTextHande(textVal);
	}
	
	
}
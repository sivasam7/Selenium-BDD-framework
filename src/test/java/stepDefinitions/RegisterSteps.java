package stepDefinitions;

import org.openqa.selenium.WebDriver;

import DriverManager.DriverFactory;
import io.cucumber.java.en.Then;
import pages.Register;

public class RegisterSteps{
	WebDriver driver = DriverFactory.getDriver();
	Register registerpage = new Register(driver);
	
	@Then("Enter first name {string}")
	public void enter_firstName(String firstNameVal) {
		registerpage.firstName(firstNameVal);
	}
	
	@Then("Enter last name {string}")
	public void enter_lastName(String lastNameVal) {
		registerpage.lastName(lastNameVal);
	}
	@Then("Enter Address {string}")
	public void enter_Address(String addressVal) {
		registerpage.address(addressVal);
	}
	
	@Then("Enter email Address {string}")
	public void enter_emailAddress(String emailAddressVal) {
		registerpage.emailAddress(emailAddressVal);
	}
	
	@Then("Enter phone Number {string}")
	public void enter_phoneNum(String phoneNumVal) {
		registerpage.phoneNumber(phoneNumVal);
	}
	
	@Then("Select gender {string}")
	public void select_gender(String genderVal) {
		registerpage.gender(genderVal);
	}
	
	@Then("Select Hobby {string}")
	public void select_hobby(String hobbyVal) {
		registerpage.hobbies(hobbyVal);
	}
	
	@Then("Select Language {string}")
	public void select_Language(String languageVal) {
		registerpage.languages(languageVal);
	}
	
	@Then("Select Skill {string}")
	public void select_skill(String skillsVal) {
		registerpage.skills(skillsVal);
	}
	
	@Then("Select country {string}")
	public void select_country(String countryVal) {
		registerpage.selectCountry(countryVal);
	}
	
	@Then("Select year {string}")
	public void select_year(String yearVal) {
		registerpage.selectYear(yearVal);
	}
	
	@Then("Select month {string}")
	public void select_month(String monthVal) {
		registerpage.selectMonth(monthVal);
	}
	
	@Then("Select day {string}")
	public void select_day(String dayVal) {
		registerpage.selectDay(dayVal);
	}
	
	@Then("Enter register page password {string}")
	public void enter_password(String passVal) {
		registerpage.passward(passVal);
	}
	
	@Then("Enter confirm password {string}")
	public void enter_confirm_password(String conPassVal) {
		registerpage.confirmPassward(conPassVal);
	}
	
}
package Common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
	protected WebDriver driver;
    protected WebDriverWait wait;
	
	public CommonFunctions(WebDriver driver) {
		this.driver = driver;	
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void selectByValue(By locator, String value) {
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
        Select select = new Select(element);
        select.selectByValue(value);
    }
}

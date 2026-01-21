import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoProject {
	 public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();

	        try {
	            driver.get("https://www.leafground.com/input.xhtml");
	            WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
	            searchBox.sendKeys("Hi there");
	            Thread.sleep(4000);  // Sleep for 3 seconds
	            System.out.println("Page Title: " + driver.getTitle());
	            
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
}


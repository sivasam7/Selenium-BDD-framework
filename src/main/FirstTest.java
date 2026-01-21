import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {
	 public static void main(String[] args) {
	        // Set the path to your ChromeDriver executable
	     //   System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");

	        // Initialize the ChromeDriver (this will open a new Chrome browser)
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Open Google homepage
	            driver.get("https://www.google.com");

	            // Find the search input field by its name attribute ("q" is the name of Google's search box)
	            WebElement searchBox = driver.findElement(By.name("q"));

	            // Type the search query in the search box
	            searchBox.sendKeys("https://www.selenium.dev/downloads");

	            // Submit the search (this simulates pressing the "Enter" key)
	            searchBox.submit();

	            // Wait for a few seconds to let the results load (optional)
	            Thread.sleep(3000);  // Sleep for 3 seconds

	            // Optionally, print the title of the page to verify the search worked
	            System.out.println("Page Title: " + driver.getTitle());
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
}


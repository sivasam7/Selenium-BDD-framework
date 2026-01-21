import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {	
			//@Test
			public static void loginTest_TC001() {
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.automationtesting.in/Register.html");
				driver.manage().window().maximize();
				String path = "TestData/DemoProject/TestData.xlsx";
			    ExcelUtils.setExcelFile(path, "LoginData");

			    String firstName = ExcelUtils.getData("TC001", "firstName");
			    String lastName = ExcelUtils.getData("TC001", "lastname");
			    String address  = ExcelUtils.getData("TC001", "Address");
			    String email = ExcelUtils.getData("TC001", "Password");
			    String phoneNo = ExcelUtils.getData("TC001", "Phone No");
			    String gender = ExcelUtils.getData("TC001", "Gender");

			    driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(firstName);
				driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(lastName);
				driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);
				driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys(email);
				driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys(phoneNo);
				if(gender.equals("Male")) {
					driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
				}else if(gender.equals("Female")){		
					driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
				}
			    try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			    driver.quit();
			}

	public static void main(String[] args) throws InterruptedException {
		loginTest_TC001();
	}
		
}


	
/*//		
//		String firstName = ExcelUtils.getCellData(path, "LoginData", 1, 0);
//		String lastName  = ExcelUtils.getCellData(path, "LoginData", 1, 1);
//		String address = ExcelUtils.getCellData(path, "LoginData", 1, 2);
//		String email = ExcelUtils.getCellData(path, "LoginData", 1, 3);
//		String phoneNo = ExcelUtils.getCellData(path, "LoginData", 1, 4);
//		String gender = ExcelUtils.getCellData(path, "LoginData", 1, 5);
//		
//		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(firstName);
//		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(lastName);
//		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);
//		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys(email);
//		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys(phoneNo);
//		if(gender.equals("Male")) {
//			driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
//		}else if(gender.equals("Female")){		
//			driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
//		}
//		Thread.sleep(10000);
//		driver.quit();
//	}
 */
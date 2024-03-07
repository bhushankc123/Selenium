package tfhg;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Vtiger {

	
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//WebDriver driver=WebDriverManager.edgedriver().create();
		
		//Launch the browser
		driver.get("https://crmaccess.vtiger.com/log-in/");
		Thread.sleep(1000);
		
		//login to app
		driver.findElement(By.name("username")).sendKeys("admin");
	
		driver.findElement(By.name("password")).sendKeys("manager");	
		driver.findElement(By.name("password")).sendKeys("manager");	
	}

}

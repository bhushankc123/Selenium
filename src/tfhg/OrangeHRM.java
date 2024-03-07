package tfhg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();

		//WebDriver driver=WebDriverManager.edgedriver().create();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		
		//maximize screen
		driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	
	//driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
	//span[text()='Recruitment']
	}

}

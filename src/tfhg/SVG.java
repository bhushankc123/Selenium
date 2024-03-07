package tfhg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(2000);
		WebElement data = driver.findElement(By.xpath("//*[name()='svg' and @class='gb_Ue']"));
		data.click();*/
	}

}
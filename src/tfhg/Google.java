package tfhg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Google {

	public static void main(String[] args) throws Throwable {	
		WebDriver driver=new ChromeDriver();
		
		//WebDriver driver=WebDriverManager.edgedriver().create();

	driver.get("https://www.flipkart.com/");

	driver.manage().window().maximize();

	}

}

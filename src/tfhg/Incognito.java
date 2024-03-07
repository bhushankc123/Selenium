package tfhg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Incognito {

	public static void main(String[] args) {
	String key="webdriver.chrome driver";
		String value="C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(key, value);
	//	driver.manage().window().maximize();
		
	ChromeOptions option = new ChromeOptions();
	option.addArguments("incognito");

	WebDriver driver=new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.yatra.com");
		
	/*	EdgeOptions option=new EdgeOptions();
		option.addArguments("Inprivate");

		WebDriver driver=new EdgeDriver(option);
		driver.manage().window().maximize();*/

	}

}

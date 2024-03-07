package tfhg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//(https://username:password@URL);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}

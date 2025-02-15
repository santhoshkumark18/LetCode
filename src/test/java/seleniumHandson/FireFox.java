package seleniumHandson;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFox {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in");
		driver.quit();

	}

}

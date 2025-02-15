package seleniumHandson;

import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InternetExplorer {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		InternetExplorerDriver driver = new InternetExplorerDriver();

		driver.get("https://gethub.com");
		driver.quit();
	}

}

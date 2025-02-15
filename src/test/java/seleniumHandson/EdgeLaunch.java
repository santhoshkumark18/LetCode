package seleniumHandson;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeLaunch {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();

		EdgeDriver driver = new EdgeDriver();

		driver.get("https://letcode.in");
		driver.quit();

	}

}

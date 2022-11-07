package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;

	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/balajivalveriveeraperumal/Downloads/chromedriver");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");

		option.setCapability(ChromeOptions.CAPABILITY, option);

		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}

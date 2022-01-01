package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class PageObjectTest {
	WebDriver driver;

	public void SetupDriver() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8090/jpetstore");
	}

	public void cleanUp() {
		driver.manage().deleteAllCookies();
	}

	public void teardown() {
		driver.quit();
	}

}

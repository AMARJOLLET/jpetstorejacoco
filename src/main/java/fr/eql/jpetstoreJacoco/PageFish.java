package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFish {
	@FindBy(xpath = "//a[contains(@href, 'FI-SW-01')]")
	WebElement Angelfish;
	@FindBy(xpath = "//a[contains(@href, 'FI-SW-02')]")
	WebElement Tiger_Shark;
	@FindBy(xpath = "//a[contains(@href, 'FI-FW-01')]")
	WebElement Koi;
	@FindBy(xpath = "//a[contains(@href, 'FI-FW-02')]")
	WebElement Goldfish;
	
	
	public Tiger_Shark clickTiger_Shark (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'FI-SW-02')]")));
		Tiger_Shark.click();		
		return PageFactory.initElements(driver, Tiger_Shark.class);
	}
	
	
	
}

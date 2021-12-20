package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rattlesnake {
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-11')]")
	WebElement Venomless_Rattlesnake;
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-11')]")
	WebElement Rattlesnake;
	
	
	public ShopVenomless_Rattlesnake clickVenomless_Rattlesnake (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'workingItemId=EST-11')]")));
		Venomless_Rattlesnake.click();		
		return PageFactory.initElements(driver, ShopVenomless_Rattlesnake.class);
	}
	
	
}

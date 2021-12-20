package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_Parrot {
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-18')]")
	WebElement addAmazon_Parrot;
	
	
	public ShopAmazon_Parrot clickAmazon_Parrot (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'workingItemId=EST-18')]")));
		addAmazon_Parrot.click();		
		return PageFactory.initElements(driver, ShopAmazon_Parrot.class);
	}
	
}

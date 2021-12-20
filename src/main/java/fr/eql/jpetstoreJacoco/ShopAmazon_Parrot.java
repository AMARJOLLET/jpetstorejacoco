package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopAmazon_Parrot {
	@FindBy(xpath = "//a[contains(@href,'removeItemFromCart')]")
	WebElement removeAmazon_Parrot;
	@FindBy(xpath = "//input[@name='EST-18']")
	WebElement addAmazon_Parrot;
	@FindBy(xpath = "//a[contains(@href, 'newOrderForm')]")
	WebElement confirmAmazon_Parrot;
	
	
	
	public Cards clickCards (WebDriver driver) {
		int number_add = 2; 
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='EST-18']")));
		addAmazon_Parrot.click();
		addAmazon_Parrot.clear();
		addAmazon_Parrot.sendKeys(String.valueOf(number_add));
		confirmAmazon_Parrot.click();		
		
		return PageFactory.initElements(driver, Cards.class);
	}
}

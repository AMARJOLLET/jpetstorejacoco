package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopVenomless_Rattlesnake {
	@FindBy(xpath = "//a[contains(@href,'removeItemFromCart')]")
	WebElement removeVenomless_Rattlesnake;
	@FindBy(xpath = "//input[@name='EST-11']")
	WebElement addVenomless_Rattlesnake;
	@FindBy(xpath = "//a[contains(@href, 'newOrderForm')]")
	WebElement confirmVenomless_Rattlesnake;
	
	
	
	public Cards clickCards (WebDriver driver) {
		int number_add = 2; 
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='EST-11']")));
		addVenomless_Rattlesnake.click();
		addVenomless_Rattlesnake.clear();
		addVenomless_Rattlesnake.sendKeys(String.valueOf(number_add));
		confirmVenomless_Rattlesnake.click();		
		
		return PageFactory.initElements(driver, Cards.class);
	}
}

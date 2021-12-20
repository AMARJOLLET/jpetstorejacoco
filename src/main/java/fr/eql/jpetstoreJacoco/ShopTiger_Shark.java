package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopTiger_Shark {
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-3')]")
	WebElement removeTiger_Shark;
	@FindBy(xpath = "//input[@name='EST-3']")
	WebElement addTiger_Shark;
	@FindBy(xpath = "//a[contains(@href, 'newOrderForm')]")
	WebElement confirmTiger_Shark;
	
	
	
	public Cards clickCards (WebDriver driver) {
		int number_add = 2; 
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='EST-3']")));
		addTiger_Shark.click();
		addTiger_Shark.clear();
		addTiger_Shark.sendKeys(String.valueOf(number_add));
		confirmTiger_Shark.click();		
		
		return PageFactory.initElements(driver, Cards.class);
	}
}

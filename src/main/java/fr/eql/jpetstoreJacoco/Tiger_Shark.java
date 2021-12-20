package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tiger_Shark {
	@FindBy(xpath = "//a[contains(@href,'workingItemId=EST-3')]")
	WebElement addTiger_Shark;
	
	
	public ShopTiger_Shark clickTiger_Shark (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'workingItemId=EST-3')]")));
		addTiger_Shark.click();		
		return PageFactory.initElements(driver, ShopTiger_Shark.class);
	}
	
}


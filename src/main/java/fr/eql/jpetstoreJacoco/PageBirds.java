package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBirds {
	@FindBy(xpath = "//a[contains(@href, 'productId=AV-CB-01')]")
	WebElement Amazon_Parrot;
	
	
	public Amazon_Parrot clickAmazon_Parrot (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'productId=AV-CB-01')]")));
		Amazon_Parrot.click();		
		return PageFactory.initElements(driver, Amazon_Parrot.class);
	}
	
	
}

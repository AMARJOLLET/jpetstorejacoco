package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageReptile {
	@FindBy(xpath = "//a[contains(@href,'RP-SN-01')]")
	WebElement Rattlesnake;
	
	
	public Rattlesnake clickRattlesnake (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'RP-SN-01')]")));
		Rattlesnake.click();		
		return PageFactory.initElements(driver, Rattlesnake.class);
	}
	
	
}

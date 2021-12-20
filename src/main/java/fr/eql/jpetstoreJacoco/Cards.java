package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cards {
	@FindBy(xpath = "//input[@name='newOrder']")
	WebElement continuecards;

	
	
	public CardsConfirm clickCardsConfirm (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='newOrder']")));
		continuecards.click();
		
		return PageFactory.initElements(driver, CardsConfirm.class);
	}
}
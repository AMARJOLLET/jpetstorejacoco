package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CardsConfirm {
	@FindBy(xpath = "//a[contains(text(),'Return to Main Menu')]")
	WebElement Return_to_Main_Menu;

	
	
	public PageAccueil clickReturn_to_Main_Menu (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Return to Main Menu')]")));
		Return_to_Main_Menu.click();
		
		return PageFactory.initElements(driver, PageAccueil.class);
	}
}

package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageWelcome {
	@FindBy(xpath = "//a[.='Enter the Store']")
	WebElement Enter_the_Store;


	public PageAccueil clickEnter (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[.='Enter the Store']")));
		Enter_the_Store.click();
		return PageFactory.initElements(driver, PageAccueil.class);
	}
}


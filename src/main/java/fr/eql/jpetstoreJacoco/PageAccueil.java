package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAccueil extends AbstractBandeauPersistant {
	public PageAccueil(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(@href,'signon')]")
	WebElement Sign_in;
	@FindBy(xpath = "//a[contains(@href,'signoff')]")
	WebElement Sign_out;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=REPTILES')]")
	WebElement Reptile;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=FISH')]")
	WebElement Fish;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=BIRDS')]")
	WebElement Birds;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=DOGS')]")
	WebElement Dogs;
	
	// Webelement
	public PageProductReptile clickReptile() {
		waitElementsXpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=REPTILES')]");
		Reptile.click();
		return new PageProductReptile(driver);
	}

	public PageProductFish clickFish() {
		waitElementsXpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=FISH')]");
		Fish.click();
		return new PageProductFish(driver);
	}

	public PageProductBirds clickBirds() {
		waitElementsXpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=BIRDS')]");
		Birds.click();
		return new PageProductBirds(driver);
	}
	public PageProductDogs clickDogs() {
		waitElementsXpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=DOGS')]");
		Dogs.click();
		return new PageProductDogs(driver);
	}
	
}

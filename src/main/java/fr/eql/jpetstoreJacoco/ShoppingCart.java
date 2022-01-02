package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends AbstractBandeauPersistant {
	public ShoppingCart(WebDriver driver) {
		super(driver);
	}
	// AddCart
	@FindBy(xpath = "//input[@name='EST-18']")
	WebElement addAmazonParrot;
	@FindBy(xpath = "//input[@name='EST-3']")
	WebElement addTigerShark;
	@FindBy(xpath = "//input[@name='EST-11']")
	WebElement addVenomlessRattlesnake;
	@FindBy(xpath = "//input[@name='EST-6']")
	WebElement addMaleAdultBulldog;
	
	// Recup du prix
	@FindBy(xpath = "//input[@name='EST-18']/following::td[2]")
	WebElement priceAmazonParrot;
	@FindBy(xpath = "//input[@name='EST-3']/following::td[2]")
	WebElement priceTigerShark;
	@FindBy(xpath = "//input[@name='EST-11']/following::td[2]")
	WebElement priceVenomlessRattlesnake;
	@FindBy(xpath = "//input[@name='EST-6']/following::td[2]")
	WebElement priceMaleAdultBulldog;
	@FindBy(xpath ="//td[@colspan='7']")
	WebElement Subtotal;

	@FindBy(xpath = "//input[@value='Update Cart']")
	WebElement updateCart_button;

	
	@FindBy(xpath = "//a[contains(@href, 'newOrderForm')]")
	WebElement confirmOrder;
	@FindBy(xpath ="//a[text()='Return to Main Menu']")
	WebElement ReturnPageActuel;
	
	// BIRDS
	public void addAmazonParrot(int number_add) {
		waitElementsXpath("//h2[text()='Shopping Cart']");
		addAmazonParrot.click();
		addAmazonParrot.clear();
		addAmazonParrot.sendKeys(String.valueOf(number_add));
		updateCart_button.click();	
	}
	
	// FISH
	public void addTigerShark(int number_add) {
		waitElementsXpath("//h2[text()='Shopping Cart']");
		addTigerShark.click();
		addTigerShark.clear();
		addTigerShark.sendKeys(String.valueOf(number_add));
		updateCart_button.click();	
	}
	
	// SNAKE
	public void addVenomlessRattlesnake(int number_add) {
		waitElementsXpath("//h2[text()='Shopping Cart']");
		addVenomlessRattlesnake.click();
		addVenomlessRattlesnake.clear();
		addVenomlessRattlesnake.sendKeys(String.valueOf(number_add));
		updateCart_button.click();		
	}
		
	// DOGS
	public void addMaleAdultBulldog(int number_add) {
		waitElementsXpath("//h2[text()='Shopping Cart']");
		addMaleAdultBulldog.click();
		addMaleAdultBulldog.clear();
		addMaleAdultBulldog.sendKeys(String.valueOf(number_add));
		updateCart_button.click();
	}
		
	// RETURN PAGEACCUEIL
	public PageAccueil ReturnToMenu () {
		ReturnPageActuel.click();
		return new PageAccueil(driver);
	}
	
	// VALIDE PANIER
	public PageOrderNew confirmOrder() {
		confirmOrder.click();
		return new PageOrderNew(driver);
	}	
	
	// Assertion prix => Recup price
	public double pricetodoubleProduct(String PriceString) {
		String price = PriceString.replaceAll("\\D+", "");
		int pricelength = price.length();
		price = price.substring(0,price.length()-2)+"."+price.substring(pricelength-2,pricelength);
		double PriceDouble = Double.parseDouble(price);
		return PriceDouble;
	}

}

package fr.eql.jpetstoreJacoco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class PageAccueil {
	@FindBy(xpath = "//a[.='Sign In']")
	WebElement Sign_in;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=REPTILES')]")
	WebElement Reptile;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=FISH')]")
	WebElement Fish;
	@FindBy(xpath = "//div[@id='SidebarContent']/a[contains(@href,'categoryId=BIRDS')]")
	WebElement Birds;
	
	
	public PageSign_In clickSign_up (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Sign In']")));
		Sign_in.click();		
		return PageFactory.initElements(driver, PageSign_In.class);
	}
	public PageReptile clickReptile (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=REPTILES')]")));
		Reptile.click();
		return PageFactory.initElements(driver, PageReptile.class);
	}
	public PageFish clickFish (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=FISH')]")));
		Fish.click();
		return PageFactory.initElements(driver, PageFish.class);
	}
	public PageBirds clickBirds (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 1);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='SidebarContent']/a[contains(@href,'categoryId=BIRDS')]")));
		Birds.click();
		return PageFactory.initElements(driver, PageBirds.class);
	}
	
}

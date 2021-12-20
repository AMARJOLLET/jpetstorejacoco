package fr.eql.jpetstoreJacoco;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public  class TestJacoco {
	WebDriver driver;
	Logger LOGGER = LoggerFactory.getLogger(TestJacoco.class);
	
	@Before
	public void SetupDriver() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/jpetstore");

	}
	
	
	@Test
	public  void navigateJpetstore() {
		PageWelcome pageWelcome = PageFactory.initElements(driver,PageWelcome.class);
		PageAccueil pageAccueil = pageWelcome.clickEnter(driver);
		
		LOGGER.info("INITIALISATION");
		// SIGN UP
		PageSign_In pageSign_In = pageAccueil.clickSign_up(driver);
		pageSign_In.clickSign_In(driver,"ACID","ACID");
		LOGGER.info("SIGN UP ok");

		// BIRDS
		PageBirds pageBirds = pageAccueil.clickBirds(driver);
		Amazon_Parrot amazon_Parrot = pageBirds.clickAmazon_Parrot(driver);
		ShopAmazon_Parrot shopAmazon_Parrot = amazon_Parrot.clickAmazon_Parrot(driver);
		Cards cards = shopAmazon_Parrot.clickCards(driver);
		CardsConfirm cardsConfirm = cards.clickCardsConfirm(driver);
		cardsConfirm.clickReturn_to_Main_Menu(driver);	
		LOGGER.info("BIRDS ok");

		// REPTILE
		PageReptile pageReptile = pageAccueil.clickReptile(driver);
		Rattlesnake rattlesnake = pageReptile.clickRattlesnake(driver);
		ShopVenomless_Rattlesnake shopVenomless_Rattlesnake = rattlesnake.clickVenomless_Rattlesnake(driver);
		shopVenomless_Rattlesnake.clickCards(driver);
		cards.clickCardsConfirm(driver);
		cardsConfirm.clickReturn_to_Main_Menu(driver);		
		
		LOGGER.info("REPTILE ok");

		// FISH
		PageFish pageFish = pageAccueil.clickFish(driver);
		Tiger_Shark tiger_Shark = pageFish.clickTiger_Shark(driver);
		ShopTiger_Shark shopTiger_Shark = tiger_Shark.clickTiger_Shark(driver);
		shopTiger_Shark.clickCards(driver);
		cards.clickCardsConfirm(driver);
		cardsConfirm.clickReturn_to_Main_Menu(driver);
		
		LOGGER.info("FISH ok");

		
		}
	@After
	public void teardown() {
		driver.quit();

	}
}
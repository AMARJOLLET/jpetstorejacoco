package fr.eql.jpetstoreJacoco;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJacoco extends PageObjectTest {
	Logger LOGGER = LoggerFactory.getLogger(TestJacoco.class);

	@Before
	public void SetupDriver() {
		super.SetupDriver();
	}

	@Test
	public void navigateJpetstore() {
		int number_add = 3;
		String username = "ACID";
		String password = "ACID";

		// Page Accueil
		PageWelcome pageWelcome = new PageWelcome(driver);
		PageAccueil pageAccueil = pageWelcome.clickEnter();

		LOGGER.info("***** INITIALISATION *****") ;
		// SIGN UP
		PageSignIn pageSign_In = pageAccueil.clickSign_up();
		pageSign_In.field(username, password);
		pageSign_In.SignIn();

		assertTrue(pageAccueil.SignOutDisplay());

		LOGGER.info("***** SIGN UP DONE *****");

	 	// BIRDS
		PageProductBirds pageBirds = pageAccueil.clickBirds();
		PageItemAmazonParrot amazon_Parrot = pageBirds.clickAmazonParrot();
		ShoppingCart shoppingCart = amazon_Parrot.addCartAdultMaleAmazonParrot();
		shoppingCart.addAmazonParrot(number_add);
		shoppingCart.ReturnToMenu();

		LOGGER.info("***** BIRDS DONE *****");

		// REPTILE
		PageProductReptile pageReptile = pageAccueil.clickReptile();
		PageItemRattlesnake rattlesnake = pageReptile.clickRattlesnake();
		rattlesnake.addCartVenomless_Rattlesnake();
		shoppingCart.addVenomlessRattlesnake(number_add);
		shoppingCart.ReturnToMenu();
		LOGGER.info("***** REPTILE DONE *****");

	 	// Dogs
		PageProductDogs pageDogs = pageAccueil.clickDogs();
		PageItemBulldog bulldogs = pageDogs.clickBulldog();
		bulldogs.addCartMaleAdultBulldog();
		shoppingCart.addMaleAdultBulldog(number_add);
		shoppingCart.ReturnToMenu();
		LOGGER.info("***** DOGS DONE *****");

		//  FISH
		PageProductFish pageFish = pageAccueil.clickFish();
		PageItemTigerShark tiger_Shark = pageFish.clickTiger_Shark();
		tiger_Shark.addCartTiger_Shark();
		shoppingCart.addTigerShark(number_add);
		LOGGER.info("***** FISH DONE *****");

		//  Assertion price
		Double priceAmazonParrotActual = Double.parseDouble(shoppingCart.priceBirds());
		Double priceBulldogActual = Double.parseDouble(shoppingCart.priceDogs());
		Double priceRattlesnakeActual = Double.parseDouble(shoppingCart.priceSnake());
		Double priceTigerSharkActual = Double.parseDouble(shoppingCart.priceFish());
		Double priceSubtotalActual = Double.parseDouble(shoppingCart.subtotal());

		Double priceAmazonParrotExpected = 193.50 * number_add;
		Double priceBulldogExpected = 18.50 * number_add;
		Double priceRattlesnakeExpected = 18.50 * number_add;
		Double priceTigerSharkExpected = 18.50 * number_add;
		Double priceSubtotalExpected = priceAmazonParrotExpected + priceBulldogExpected + priceRattlesnakeExpected
				+ priceTigerSharkExpected;

		assertEquals("Prix Amazon Parrot différent", priceAmazonParrotExpected, priceAmazonParrotActual, 0);
		assertEquals("Prix Bulldog différent", priceBulldogExpected, priceBulldogActual, 0);
		assertEquals("Prix RattleSnake différent", priceRattlesnakeExpected, priceRattlesnakeActual, 0);
		assertEquals("Prix TigerShark différent", priceTigerSharkExpected, priceTigerSharkActual, 0);
		assertEquals("Subtotal différent", priceSubtotalExpected, priceSubtotalActual, 0);

		// Confirm order
		PageOrderNew pageOrderNew = shoppingCart.confirmOrder();
		PageOrderConfirm pageOrderConfirm = pageOrderNew.clickCardsConfirm();
		PageOrderRecap pageOrderRecap = pageOrderConfirm.confirm_buttonclick();
		pageOrderRecap.ReturnToMainMenu();
		pageAccueil.clickSign_out();

		assertTrue(pageAccueil.SignInDisplay());
		LOGGER.info("***** Confirm order DONE *****");

	}

	@After
	public void Close() {
		super.cleanUp();
		super.teardown();
	}
}
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

		LOGGER.info("***** INITIALISATION *****");
		// SIGN UP
		PageSignIn pageSign_In = pageAccueil.SignIn();
		pageSign_In.field(username, password);
		pageSign_In.clickRegister();

		assertTrue(pageAccueil.SignOutDisplay());

		LOGGER.info("***** SIGN UP DONE *****");

		// BIRDS
		PageProductBirds pageBirds = pageAccueil.clickBirds();
		PageItemAmazonParrot amazonParrot = pageBirds.clickAmazonParrot();
		String priceAmazonParrot = amazonParrot.priceAdultMaleAmazonParrot.getText();
		ShoppingCart shoppingCart = amazonParrot.addCartAdultMaleAmazonParrot();
		shoppingCart.addAmazonParrot(number_add);
		shoppingCart.ReturnToMenu();

		LOGGER.info("***** BIRDS DONE *****");

		// REPTILE
		PageProductReptile pageReptile = pageAccueil.clickReptile();
		PageItemRattlesnake rattlesnake = pageReptile.clickRattlesnake();
		String priceVenomlessRattlesnake = rattlesnake.priceVenomlessRattlesnake.getText();
		rattlesnake.addCartVenomlessRattlesnake();
		shoppingCart.addVenomlessRattlesnake(number_add);
		shoppingCart.ReturnToMenu();
		LOGGER.info("***** REPTILE DONE *****");

		// Dogs
		PageProductDogs pageDogs = pageAccueil.clickDogs();
		PageItemBulldog bulldogs = pageDogs.clickBulldog();
		String priceMaleAdultBulldog = bulldogs.priceMaleAdultBulldog.getText();
		bulldogs.addCartMaleAdultBulldog();
		shoppingCart.addMaleAdultBulldog(number_add);
		shoppingCart.ReturnToMenu();
		LOGGER.info("***** DOGS DONE *****");

		// FISH
		PageProductFish pageFish = pageAccueil.clickFish();
		PageItemTigerShark tigerShark = pageFish.clickTigerShark();
		String priceTigerShark = tigerShark.priceTigerShark.getText();
		tigerShark.addCartTigerShark();

		shoppingCart.addTigerShark(number_add);
		LOGGER.info("***** FISH DONE *****");

		// Assertion price
		Double priceAmazonParrotExpected = shoppingCart.pricetodoubleProduct(priceAmazonParrot) * number_add;
		Double priceBulldogExpected = shoppingCart.pricetodoubleProduct(priceMaleAdultBulldog) * number_add;
		Double priceRattlesnakeExpected = shoppingCart.pricetodoubleProduct(priceVenomlessRattlesnake) * number_add;
		Double priceTigerSharkExpected = shoppingCart.pricetodoubleProduct(priceTigerShark) * number_add;
		Double priceSubtotalExpected = priceAmazonParrotExpected + priceBulldogExpected + priceRattlesnakeExpected
				+ priceTigerSharkExpected;

		assertEquals("Prix Amazon Parrot différent", priceAmazonParrotExpected,
				shoppingCart.pricetodoubleProduct(shoppingCart.priceAmazonParrot.getText()), 0);
		assertEquals("Prix Bulldog différent", priceBulldogExpected,
				shoppingCart.pricetodoubleProduct(shoppingCart.priceMaleAdultBulldog.getText()), 0);
		assertEquals("Prix RattleSnake différent", priceRattlesnakeExpected,
				shoppingCart.pricetodoubleProduct(shoppingCart.priceVenomlessRattlesnake.getText()), 0);
		assertEquals("Prix TigerShark différent", priceTigerSharkExpected,
				shoppingCart.pricetodoubleProduct(shoppingCart.priceTigerShark.getText()), 0);
		assertEquals("Subtotal différent", priceSubtotalExpected,
				shoppingCart.pricetodoubleProduct(shoppingCart.Subtotal.getText()), 0);

		// Confirm order
		PageOrderNew pageOrderNew = shoppingCart.confirmOrder();
		PageOrderConfirm pageOrderConfirm = pageOrderNew.clickCardsConfirm();
		PageOrderRecap pageOrderRecap = pageOrderConfirm.confirm_buttonclick();
		pageOrderRecap.ReturnToMainMenu();
		pageAccueil.SignOut();

		assertTrue(pageAccueil.SignInDisplay());
		LOGGER.info("***** Confirm order DONE *****");

	}

	@After
	public void Close() {
		super.cleanUp();
		super.teardown();
	}
}
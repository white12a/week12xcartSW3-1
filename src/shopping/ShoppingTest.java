package shopping;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.Random;

public class ShoppingTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        // 1.2 Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[2]"));
        //1.3 Verify the text “Bestsellers”
        verifyText("Bestsellers", By.id("page-title"), "Verify Best Seller text");
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mouseHoverToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[4]/a"));
        Thread.sleep(2000);
        //mouseHoverAndClick(By.xpath("//ul[@class='products-grid grid-list']/li[5]"),By.xpath("//ul[@class='products-grid grid-list']/li[5]/div/div[2]/div[4]/div/button"));
        mouseHoverToElement(By.xpath("//ul[@class='products-grid grid-list']/li[5]"));
        mouseHoverAndClick(By.xpath("//ul[@class='products-grid grid-list']/li[5]/div/div[2]/div[4]/div/button"));
        Thread.sleep(2000);
        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        verifyText("Product has been added to your cart",By.xpath("//li[@class='info']"),"Verify Product has been added to cart");
        //1.7 Click on X sign to close the message
        clickOnElement(By.xpath("//a[@title='Close']"));
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        clickOnElement(By.xpath("//div[@id='header']/div[4]"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));
        Thread.sleep(2000);
        //1.9 Verify the text “Your shopping cart - 1 item”
        verifyText("Your shopping cart - 1 item",By.id("page-title"),"Verify text your shopping cart");
        //1.10 Verify the Subtotal $9.99
        verifyText("$9.99",By.xpath("//ul[@class='sums']/li/span"),"Verify subtotal");
        //1.11 Verify the total $15.66
        verifyText("$15.66",By.xpath("//ul[@class='totals']/li[4]/span"),"verify total");
        //1.12 Click on “Go to checkout” button
        clickOnElement(By.xpath("//li[@class='button main-button']/button"));
        //1.13 Verify the text “Log in to your account”
        verifyText("Log in to your account",By.xpath("//h3[contains(text(),'Log in to your account')]"),"verify log in your account text");
        Thread.sleep(2000);
        //1.14 Enter Email address
        WebElement emailField = driver.findElement(By.id("email"));// email field locator
        //emailField.click();// click email field
        Random randomGenerator = new Random();// random generator class
        int randomInt = randomGenerator.nextInt(1000);
        emailField.sendKeys("username" + randomInt + "@gmail.com");// creating random email generator
        //1.15 Click on “Continue” Button
        clickOnElement(By.xpath("//td[@class='buttons-row']/button"));
        //1.16 Verify the text “Secure Checkout”
        verifyText("Secure Checkout",By.xpath("//div[@class='checkout-block']/h1"),"Verify secure text");
        //1.17 Fill all the mandatory fields
        sendTextToElement(By.id("shippingaddress-firstname"),"nik");
        sendTextToElement(By.id("shippingaddress-lastname"),"pak");
        sendTextToElement(By.id("shippingaddress-street"),"angel street");
        sendTextToElement(By.id("shippingaddress-custom-state"),"florida");
        Thread.sleep(2000);
        //1.18 Check the check box “Create an account for later use
        clickOnElement(By.id("create_profile"));
        //1.19 Enter the password
        sendTextToElement(By.id("password"),"123456");
        Thread.sleep(2000);
        //1.20 Select the Delivery Method to “Local Shipping
        waitUnitVisibilityOfElementLocated(By.xpath("//input[@id='method128']"),8);
        clickOnElement(By.xpath("//ul[@class='shipping-rates']/li[2]/div/label/input"));
        //1.21 Select Payment Method “COD
        Thread.sleep(2000);
        clickOnElement(By.id("pmethod6"));
        //1.22 Verify the total $16.67
        verifyText("$16.67",By.xpath("//div[@class='total clearfix']/span/span"),"verify total");
       Thread.sleep(2000);
        //1.23 Click on “Place Order” Button
        clickOnElement(By.xpath("//div[@class='button-row']/button"));
        //1.24 Verify the text “Thank you for your order”
        verifyText("Thank you for your order",By.id("page-title"),"verify Thank you for your order text");
    }
    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        // 1.2 Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[2]"));
        //1.3 Verify the text “Bestsellers”
        verifyText("Bestsellers", By.id("page-title"), "Verify Best Seller text");
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mouseHoverToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[4]/a"));
        Thread.sleep(2000);
        //mouseHoverAndClick(By.xpath("//ul[@class='products-grid grid-list']/li[5]"),By.xpath("//ul[@class='products-grid grid-list']/li[5]/div/div[2]/div[4]/div/button"));
        mouseHoverToElement(By.xpath("//ul[@class='products-grid grid-list']/li[5]"));
        mouseHoverAndClick(By.xpath("//ul[@class='products-grid grid-list']/li[5]/div/div[2]/div[4]/div/button"));
        Thread.sleep(2000);
        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        verifyText("Product has been added to your cart",By.xpath("//li[@class='info']"),"Verify Product has been added to cart");
        //1.7 Click on X sign to close the message
        clickOnElement(By.xpath("//a[@title='Close']"));
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        clickOnElement(By.xpath("//div[@id='header']/div[4]"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));
        //1.9 Verify the text “Your shopping cart - 1 item”
        verifyText("Your shopping cart - 1 item",By.id("page-title"),"Verify text your shopping cart");
       Thread.sleep(2000);
        //1.10 Click on “Empty your cart” link
        clickOnElement(By.xpath("//div[@class='cart-buttons']/form/a"));
        //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        Thread.sleep(2000);
        String actualText=getTextFromAlert();
        String expectedText="Are you sure you want to clear your cart?";
        Assert.assertEquals(expectedText,actualText);
        //1.12 Click “Ok” on alert
        acceptAlert();
        //1.15 Verify the text “Your cart is empty”
        Thread.sleep(2000);
        verifyText("Your cart is empty",By.xpath("//div[@class='list-container']/h1"),"Your cart is empty text");
    }

    @After
    public void tearDown() {
       // closeBrowser();
    }
}

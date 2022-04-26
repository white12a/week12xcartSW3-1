package hompage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        // 1.1 Click on the “Shipping” link
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[3]/a"));
        // 1.2 Verify the text “Shipping”
        verifyText("Shipping", By.xpath("//div[@class='list-container']/h1"), "Verify shipping text");
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        //2.1 Click on the “New!” link
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[4]/a"));
        //2.2 Verify the text “New arrivals”
        verifyText("New arrivals", By.xpath("//div[@class='list-container']/h1"), "New arrivals text");
    }
    @Test
    public void  verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        //3.1 Click on the “Coming soon” link
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[5]/a"));
        //3.2 Verify the text “Coming soon”
        verifyText("Coming soon", By.xpath("//div[@class='list-container']/h1"), "Coming soon text");
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
       // 4.1 Click on the “Contact us” link
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[6]/a"));
       // 4.2 Verify the text “Contact us”
        verifyText("Contact us", By.xpath("//div[@class='list-container']/h1"), "Contact us text");

    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}

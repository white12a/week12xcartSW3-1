package hotdeals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class HotDealTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        //1.2 Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[1]"));
        //1.3 Verify the text “Sale”
        verifyText("Sale", By.id("page-title"), "Verify sale text");
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mouseHoverToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[5]/a"));
        Thread.sleep(2000);
        //1.5 Verify that the product arrange alphabetically
        verifyText("Name A - Z", By.xpath("//span[@class='sort-by-value']"), "Verify product arrange alphabetically");
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        //2.2 Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[1]"));
        //2.3 Verify the text “Sale”
        verifyText("Sale", By.id("page-title"), "Verify sale text");
        //2.4 Mouse hover on “Sort By” and select “Price Low-High”
        mouseHoverToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[3]/a"));
        Thread.sleep(2000);
        //2.5 Verify that the product’s price arrange Low to High
        verifyText("Price Low - High", By.xpath("//span[@class='sort-by-value']"), "Verify product price low to high");
    }

    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        //3.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        //3.2 Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[1]"));
        //3.3 Verify the text “Sale”
        verifyText("Sale", By.id("page-title"), "Verify sale text");
        //3.4 Mouse hover on “Sort By” and select “Rates”
        mouseHoverToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[7]/a"));
        Thread.sleep(2000);
       // 3.5 Verify that the product’s arrange Rates
        verifyText("Rates", By.xpath("//span[@class='sort-by-value']"), "Verify product arranged in Rates");
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
       // 1.2 Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[2]"));
        //1.3 Verify the text “Bestsellers”
        verifyText("Bestsellers", By.id("page-title"), "Verify Best Seller text");
        //1.4 Mouse hover on “Sort By” and select “Name Z-A”
        mouseHoverToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[5]/a"));
        Thread.sleep(2000);
        //1.5 Verify that the product arrange by Z to A
        verifyText("Name Z - A", By.xpath("//span[@class='sort-by-value']"), "Verify product ordered in Name Z - A");
    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        //2.2 Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[2]"));
        //2.3 Verify the text “Bestsellers”
        verifyText("Bestsellers", By.id("page-title"), "Verify Best Seller text");
        //2.4 Mouse hover on “Sort By” and select “Price High-Low”
        mouseHoverToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[3]/a"));
        Thread.sleep(2000);
        //2.5 Verify that the product’s price arrange High to Low
        verifyText("Price High - Low", By.xpath("//span[@class='sort-by-value']"), "Verify product ordered in Price High - Low");
    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        //3.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        //3.2 Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("//li[@class='leaf has-sub']/ul/li[2]"));
        //3.3 Verify the text “Bestsellers”
        verifyText("Bestsellers", By.id("page-title"), "Verify Best Seller text");
        //3.4 Mouse hover on “Sort By” and select “Rates”
        mouseHoverToElement(By.xpath("//div[@class='sort-box']/div"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[6]/a"));
        Thread.sleep(2000);
        //3.5 Verify that the product’s arrange Rates
        verifyText("Rates", By.xpath("//span[@class='sort-by-value']"), "Verify product ordered in Rates ");

    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}

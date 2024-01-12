import BaseTest.BaseClass;
import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.LaptopPage;
import PageObjects.ProductPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

// Test class for Flipkart product which is unavailable in the product page
public class FlipKartProductUnavailableTest extends BaseClass {

    // Method to be executed before each test method to initialize the browser and navigate to the home page
    @BeforeMethod
    public void initializeBrowserAndNavigateToHomePage() throws Exception {
        lauchBrowser();
        HomePage homePage = new HomePage();
        homePage.homePageMethod();
    }

    // Test method to fetch the cheapest product(In range of 0 - 20000) which leads to an empty page
    @Test
    public void testFetchRangeProduct() throws InterruptedException {
        // In this test, we are fetching the cheapest product to test if it leads to an empty page
        ProductPage productPage = new ProductPage();
        productPage.ProductPageMethodToFetchRangeProduct();
    }

    // Method to be executed after each test method to verify product details in the cart
    @AfterMethod
    public void verifyProductInCart() throws IOException, InterruptedException {
        try {
            LaptopPage laptopPage = new LaptopPage();
            laptopPage.laptopPageMethod();
            CartPage cartPage = new CartPage();
            cartPage.cartPageMethod();
        }
        // If an exception occurs, take a screenshot and handle the exception
        catch (Exception e) {
            // Format the date and time to create a unique screenshot file name
            Date currentdate = new Date();
            String screenShotFileName = currentdate.toString().replace(" ","-").replace(":","-");
            System.out.println("Generated screenshot file name: " + screenShotFileName);
            Thread.sleep(2000);

            // Capture a screenshot of the current state of the WebDriver (assumed to be a WebDriver instance)
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile,new File("./ScreenShots/"+screenShotFileName+".png"));
            System.out.println("Successfully taken screenshot");
        }
    }
}
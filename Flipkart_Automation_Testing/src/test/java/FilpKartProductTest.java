import BaseTest.BaseClass;
import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.LaptopPage;
import PageObjects.ProductPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Test class for Flipkart product delivery scenario
public class FilpKartProductTest extends BaseClass {

    // Method to be executed before each test method to initialize the browser and navigate to the home page
    @BeforeMethod
    public void initializeBrowserAndNavigateToHomePage() throws Exception {
        lauchBrowser();
        HomePage homePage = new HomePage();
        homePage.homePageMethod();
    }
    // Test method to fetch the third item in the product delivery scenario
    @Test(priority = 0)
    public void testFetchThirdItem() throws InterruptedException {
        ProductPage productPage = new ProductPage();
        productPage.productPageMethodToFetchThirdItem();
    }

    // Test method to fetch the low price product in the product delivery scenario
    @Test(priority = 1)
    public void testFetchLowPriceProduct() throws InterruptedException {
        ProductPage productPage = new ProductPage();
        productPage.ProductPageMethodToFetchLowPriceProduct();
    }

    // Test method to fetch the high price product in the product delivery scenario
    @Test(priority = 2)
    public void testFetchHighPriceProduct() throws InterruptedException {
        ProductPage productPage = new ProductPage();
        productPage.ProductPageMethodToFetchHighPriceProduct();
    }

    // Method to be executed after each test method to verify product details in the cart
    @AfterMethod
    public void verifyProductInCart() throws InterruptedException {
        // Instantiate LaptopPage and CartPage objects
        LaptopPage laptopPage = new LaptopPage();
        CartPage cartPage = new CartPage();

        // Navigate to the LaptopPage and CartPage
        laptopPage.laptopPageMethod();
        cartPage.cartPageMethod();

        // Verify product details in the cart
        Assert.assertEquals(LaptopPage.productName, CartPage.cartName, "MISMATCH: Product Name in LaptopPage and CartPage does not match");
        Assert.assertEquals(LaptopPage.productPrice, CartPage.cartPrice, "MISMATCH: Product Price in LaptopPage and CartPage does not match");
        Assert.assertEquals(LaptopPage.productRating, CartPage.cartRating, "MISMATCH: Product Rating in LaptopPage and CartPage does not match");

        // Print verification success message
        System.out.println("Verification Successful: The correct item was added to the cart");
    }
}
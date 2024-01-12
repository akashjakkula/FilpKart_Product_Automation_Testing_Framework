package PageObjects;

import BaseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Page Object class representing the elements and methods on the Cart page
public class CartPage extends BaseClass {

    // Web elements on the LaptopPage identified by their XPath
    @FindBy(xpath = "//*[@class='_2Kn22P gBNbID']")
    WebElement cartProductLink;
    @FindBy(xpath = "//*[@class='B_NuCI']")
    WebElement cartProductName;
    @FindBy(xpath = "//*[@class='_30jeq3 _16Jk6d']")
    WebElement cartProductPrice;
    @FindBy(xpath = "//*[@class='_3LWZlK']")
    WebElement cartProductRating;
    @FindBy(xpath = "//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
    WebElement placeOrderButton;

    //Declaring and initializing Static variables to store cart details
    public static String cartName = " ";
    public static String cartPrice = " ";
    public static String cartRating = " ";

    // Constructor initializing the elements using PageFactory
    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    // Method to perform actions on the Cart page
    public void cartPageMethod() throws InterruptedException {
        // Switching to the default content of the page
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        cartProductLink.click();
        Thread.sleep(3000);

        try {
            // Retrieving the product details in the cart
            cartName = cartProductName.getText();
            cartPrice = cartProductPrice.getText();
            cartRating = cartProductRating.getText();

            // Navigating back to the previous page
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            placeOrderButton.click();

            // Displaying the product details in the cart
            System.out.println("Product details in the cart:");
            System.out.println("Product name in cart= " + cartName);
            System.out.println("Product price in cart= " + cartPrice);
            System.out.println("Product rating in cart= " + cartRating);
            System.out.println();
        }
        catch (Exception e) {
            // Handling the exception if the product details in the cart page is not displayed correctly
            System.out.println("The product details in the cart page were not displayed correctly");
        }
    }
}

package PageObjects;

import BaseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

// Page Object class representing the elements and methods on the LaptopPage
public class LaptopPage extends BaseClass {

    // Web elements on the LaptopPage identified by their XPath
    @FindBy(xpath = "//*[@class='B_NuCI']")
    WebElement productNameElement;
    @FindBy(xpath = "//*[@class='_30jeq3 _16Jk6d']")
    WebElement productPriceElement;
    @FindBy(xpath = "//*[@class='_3LWZlK']")
    WebElement productRatingElement;
    @FindBy(xpath = "//*[@class='_2KpZ6l _2U9uOA _3v1-ww']")
    WebElement addToCartButton;
    @FindBy(xpath = "//*[@href='/viewcart?exploreMode=true&preference=FLIPKART']")
    WebElement cartLink;

    // Constructor to initialize the elements using PageFactory
    public LaptopPage() {
        PageFactory.initElements(driver, this);
    }

    //Declaring and initializing Static variables to store product details
    public static String productName = " ";
    public static String productPrice = " ";
    public static String productRating = " ";

    // Method to perform actions on the LaptopPage
    public void laptopPageMethod() throws InterruptedException {
        // Switching to the new tab opened after clicking on a laptop product
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        try {
            // Retrieving product details from the page
            productName = productNameElement.getText();
            productPrice = productPriceElement.getText();
            productRating = productRatingElement.getText();

            addToCartButton.click();
            Thread.sleep(5000);
            cartLink.click();

            // Displaying product details in the console
            System.out.println("Product details:");
            System.out.println("Product name = " + productName);
            System.out.println("Product price = " + productPrice);
            System.out.println("Product rating = " + productRating);
            System.out.println();
        }
        catch (Exception e) {
            // Handling the exception if the product details page is not displayed correctly
            System.out.println("The product details page was not displayed correctly");
        }
    }
}
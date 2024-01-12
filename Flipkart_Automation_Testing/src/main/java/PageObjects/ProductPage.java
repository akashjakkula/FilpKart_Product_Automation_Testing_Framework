package PageObjects;

import BaseTest.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

// Page Object class representing the elements and methods on the Product Page
public class ProductPage extends BaseClass {

    // Web elements on the LaptopPage identified by their XPath
    @FindBy(xpath = "//*[text()='Core i7']")
    WebElement coreI7Filter;
    @FindBy(xpath = "(//div[@class='_4rR01T'])[3]")
    WebElement thirdProduct;
    @FindBy(xpath = "//*[text()='Price -- Low to High']")
    WebElement priceLowToHigh;
    @FindBy(xpath = "(//*[@class='_2kHMtA'])[1]")
    WebElement firstProductLowToHigh;
    @FindBy(xpath = "//*[text()='Price -- High to Low']")
    WebElement priceHighToLow;
    @FindBy(xpath = "(//*[@class='_4rR01T'])[1]")
    WebElement firstProductHighToLow;
    @FindBy(xpath = "(//*[@class='_2YxCDZ'])[1]")
    WebElement minimumPrice;
    @FindBy(xpath = "(//*[@class='_2YxCDZ'])[2]")
    WebElement maximumPrice;

    // Constructor to initialize elements using PageFactory
    public ProductPage(){
        PageFactory.initElements(driver,this);
    }

    // Method to perform actions on the product page for test case 1(To Fetch Third Item)
    public void productPageMethodToFetchThirdItem() throws InterruptedException {
        coreI7Filter.click();
        Thread.sleep(1000);

        // Scrolling to a specific position on the page using JavascriptExecutor
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollTo(0,400)");
        Thread.sleep(2000);

        thirdProduct.click();
    }

    // Method to perform actions on the product page for test case 2(To Fetch Low Price Product)
    public void ProductPageMethodToFetchLowPriceProduct() throws InterruptedException {
        coreI7Filter.click();
        Thread.sleep(1000);
        priceLowToHigh.click();
        Thread.sleep(3000);
        firstProductLowToHigh.click();
    }

    //Method to perform actions on the product page for test case 3(To Fetch High Price Product)
    public void ProductPageMethodToFetchHighPriceProduct() throws InterruptedException {
        coreI7Filter.click();
        Thread.sleep(1000);
        priceHighToLow.click();
        Thread.sleep(3000);
        firstProductHighToLow.click();
    }
    //Method to perform actions on the product page for test case 4(To Fetch Range Product)
    public void ProductPageMethodToFetchRangeProduct() throws InterruptedException {
        coreI7Filter.click();
        Thread.sleep(2000);
        Select select = new Select(minimumPrice);
        select.selectByIndex(0);
        Thread.sleep(5000);
        Select select1 = new Select(maximumPrice);
        select1.selectByIndex(0);
    }
}
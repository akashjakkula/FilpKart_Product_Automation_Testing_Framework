package PageObjects;

import BaseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Page Object class representing the elements and methods on the Home Page
public class HomePage extends BaseClass {

    // Web elements on the LaptopPage identified by their XPath
    @FindBy(xpath = "//input[@placeholder='Search for Products, Brands and More']")
    WebElement searchInput;
    @FindBy(xpath = "//button[@aria-label='Search for Products, Brands and More']")
    WebElement searchIcon;

    // Constructor initializing elements using PageFactory
    public HomePage(){ PageFactory.initElements(driver, this); }

    // Method representing actions to be performed on the home page
    public void homePageMethod(){
        searchInput.sendKeys(searchItem);
        searchIcon.click();
    }
}

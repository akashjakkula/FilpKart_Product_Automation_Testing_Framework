package BaseTest;

import Utilities.ReadPropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

// BaseClass containing common functionalities for browser setup
public class BaseClass {
    // Static variables shared across test classes
    public static WebDriver driver;
    public static String searchItem;

    // Method to launch the browser and navigate to the specified URL
    public static void lauchBrowser() throws Exception {
        // Reading browser, URL, and search item properties from the configuration file
        String browser = ReadPropertyFile.getPropertyFile("browser");
        String url = ReadPropertyFile.getPropertyFile("url");
        searchItem = ReadPropertyFile.getPropertyFile("searchitem");

        // Setting up WebDriver based on the specified browser
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else{
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }

        // Maximizing the browser window, navigating to the specified URL
        driver.manage().window().maximize();
        driver.get(url);
    }
}

# Flipkart UI Automation Framework
This project is designed to evaluate design and coding skills in creating a robust UI automation solution using Java and Selenium. The framework is tailored to meet the specified requirements and follows best practices for clean and efficient automation.

## URL : https://www.flipkart.com/

## Problem Statement Scenario

#### Open the Website:

- Open the URL: https://www.flipkart.com/

#### Search and Select a Product:
- Search for "laptops" using the search bar.
- Filter the search results by selecting "Intel Core i7" processor type.
- Click on the third item from the search results.

#### Product Details Verification:
- Verify the product details page is displayed correctly.
- Capture and log the product name, price, and ratings.

#### Add to Cart:
- Click on "Add to Cart" and ensure the item is added successfully.

#### Checkout Process:
- Navigate to the cart and proceed to checkout.

#### Final Verification:
- Verify the correct item is added to the cart before checkout.


## Overview
This repository contains an automated testing framework designed for an e-commerce platform using Java and Selenium. The framework aims to provide a scalable, maintainable, and platform-independent solution for testing product search, selection, and checkout processes.

## Prerequisites
Before running the tests, ensure you have the following installed:
- Java Development Kit (JDK)
- Maven
- Selenium
- TestNG
- Chrome Browser

## Requirements
- Programming Language: Java
- Automation Tool: Selenium
- Browser Compatibility: Chrome
- Platform Independence: Windows, macOS, Linux
- Framework Structure: Page Object Model (POM), Singleton Pattern
- Test Execution: TestNG with parallel test support
- Configuration: Configurable parameters via properties file
- Logging: Include appropriate logging to capture events and errors

## To Start Execution:
### SETUP
- Clone the repository: 
`git clone https://github.com/akashjakkula/FilpKart_Product_Automation_Testing_Framework.git`
- Navigate to the project directory: `cd FilpKart-Product-Automation`
- Install dependencies: `mvn clean install`
## Framework Overview
### BaseTest Package
- BaseClass: Manages core setup for launching the browser, Singleton pattern implementation.
### PageObjects Package
- HomePage: Represents the Flipkart home page with methods for interacting with it.
- ProductPage: Manages the product search and selection process.
- LaptopPage: Handles interactions on the laptop details page, captures details, and adds to the cart.
- CartPage: Manages interactions within the cart, including verifying the added product and initiating the checkout process.
### Utilities Package
- ReadPropertyFile: Reads configuration properties from the config.properties file.
### Resources 
- Contains the Configuration Properties.
### EcommerceTests
- ProductSearchAndCheckoutTest: Test case implementing the product search, selection, and checkout process.
- pom.xml: Configuration information related to the project's build process, dependencies, plugins, and other settings.
### Screenshots 
Captures the screenshots in case of failures.
## Dependencies 
 - Selenium WebDriver (4.14.0): Selenium is a powerful tool for controlling web browsers through programs and performing browser automation.
- Log4j (1.2.17): Log4j is a logging library for Java.
- JUnit (4.13.2): JUnit is a simple framework to write repeatable tests.
- WebdriverManager (5.6.2): WebDriverManager is a library that helps automate the management of the binary drivers required by Selenium WebDriver.
- TestNG (7.8.0): TestNG is a testing framework inspired by JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use.
- Apache POI (4.1.2): Apache POI is a set of Java APIs to manipulate various file formats based on Microsoft Office standards.

## Working process
### Test Case 1: Flipkart Product Delivery Scenario
#### BeforeMethod: initializeBrowserAndNavigateToHomePage()
- The browser is initialized using the lauchBrowser() method from BaseClass.
- The HomePage is instantiated, and the homePageMethod() is called to navigate to the Flipkart home page.
#### Test Method: testFetchThirdItem()
- An instance of ProductPage is created.
- productPageMethodToFetchThirdItem() is called to fetch details of the third item.
- The method interacts with the product page, fetching relevant details like product name, price, and rating.
#### Test Method: testFetchLowPriceProduct()
- Another instance of ProductPage is created.
- ProductPageMethodToFetchLowPriceProduct() is called to fetch details of the low price product.
- Similar interactions with the product page to gather product details.
#### Test Method: testFetchHighPriceProduct()
- Yet another instance of ProductPage is created.
- ProductPageMethodToFetchHighPriceProduct() is called to fetch details of the high price product.
- Similar interactions with the product page to gather product details.

#### AfterMethod: verifyProductInCart()
- Instances of LaptopPage and CartPage are created.
- laptopPageMethod() is called to navigate to the laptop page.
- cartPageMethod() is called to navigate to the cart page.
- Product details from LaptopPage and CartPage are compared using assertions.
- Success message printed if the verification is successful.

### Test Case 2: Flipkart Product Unavailable Test
#### BeforeMethod: initializeBrowserAndNavigateToHomePage()
- Similar to Test Case 1, the browser is initialized, and the home page is navigated to before each test method.

#### Test Method: testFetchRangeProduct()
- An instance of ProductPage is created.
- ProductPageMethodToFetchRangeProduct() is called to fetch details of the cheapest product in the specified price range.
- The method interacts with the product page, fetching relevant details.
#### AfterMethod: verifyProductInCart() with Exception Handling
- An instance of LaptopPage is created.
- laptopPageMethod() is called to navigate to the laptop page.
- An instance of CartPage is created, and cartPageMethod() is called to navigate to the cart page.
- Exception handling is implemented; if an exception occurs during the verification, a screenshot is taken.
- The screenshot is saved with a unique filename based on the current date and time.

### General Notes:
- Both test cases share a common setup: initializing the browser and navigating to the home page.
- Test methods interact with different pages (e.g., ProductPage, LaptopPage, CartPage) to perform specific actions and fetch details.
- Assertions are used to validate the correctness of fetched product details.
- Screenshots are taken and saved in case of an exception, providing a visual record of issues.
- Annotations (@BeforeMethod and @AfterMethod) help in setting up and tearing down the test environment before and after each test method.

## Conclusion:
This automation framework provides a robust solution for testing the e-commerce platform, ensuring clean code, readability, and maintainability. The framework is designed to be platform-independent, supporting local and distributed testing using Selenium Grid. Follow the provided instructions in the README file to set up and execute the tests seamlessly.

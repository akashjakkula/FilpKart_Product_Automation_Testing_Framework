# Flipkart UI Automation Framework
This project is designed to evaluate your design and coding skills in creating a robust UI automation solution using Java and Selenium. The framework is tailored to meet the specified requirements and follows best practices for clean and efficient automation.

Problem Statement
Scenario
Open the Website:

Open the URL: https://www.flipkart.com/
Search and Select a Product:

Search for "laptops" using the search bar.
Filter the search results by selecting "Intel Core i7" processor type.
Click on the third item from the search results.
Product Details Verification:

Verify the product details page is displayed correctly.
Capture and log the product name, price, and ratings.
Add to Cart:

Click on "Add to Cart" and ensure the item is added successfully.
Checkout Process:

Navigate to the cart and proceed to checkout.
Final Verification:

Verify the correct item is added to the cart before checkout.
Requirements
Programming Language: Java
Automation Tool: Selenium
Browser Compatibility: Chrome
Platform Independence: Windows, macOS, Linux
Framework Structure: Page Object Model (POM), Singleton Pattern
Test Execution: TestNG with parallel test support
Configuration: Configurable parameters via properties file
Logging: Include appropriate logging to capture events and errors
Framework Overview
BaseTest Package
BaseClass: Manages core setup for launching the browser, Singleton pattern implementation.
PageObjects Package
HomePage: Represents the Flipkart home page with methods for interacting with it.
ProductPage: Manages the product search and selection process.
LaptopPage: Handles interactions on the laptop details page, captures details, and adds to the cart.
CartPage: Manages interactions within the cart, including verifying the added product and initiating the checkout process.
Utilities Package
ReadPropertyFile: Reads configuration properties from the config.properties file.
Execution Instructions
Clone the repository to your local machine.
Configure the config.properties file in the src/main/resources/ConfigFiles/ directory with the appropriate values for browser, url, and searchitem.
Run the FlipkartProductDelivery class as a TestNG test.
View the test results and logs for verification.
Additional Notes
Ensure that the required dependencies are resolved using a build tool like Maven or Gradle.
Utilize the provided helper methods for page interactions (click, send keys, etc.).
The framework is designed to support local test runs and Selenium Grid for distributed testing.
Follow good design principles, and maintain clear and readable code with comments where necessary.
Test cases can run seamlessly in parallel using TestNG XML configuration.

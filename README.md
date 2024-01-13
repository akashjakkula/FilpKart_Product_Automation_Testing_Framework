
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
## DEPENDENCIES:
 - Selenium WebDriver (4.14.0): Selenium is a powerful tool for controlling web browsers through programs and performing browser automation.
- Log4j (1.2.17): Log4j is a logging library for Java.
- JUnit (4.13.2): JUnit is a simple framework to write repeatable tests.
- WebdriverManager (5.6.2): WebDriverManager is a library that helps automate the management of the binary drivers required by Selenium WebDriver.
- TestNG (7.8.0): TestNG is a testing framework inspired by JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use.
- Apache POI (4.1.2): Apache POI is a set of Java APIs to manipulate various file formats based on Microsoft Office standards.

## Conclusion:
This automation framework provides a robust solution for testing the e-commerce platform, ensuring clean code, readability, and maintainability. The framework is designed to be platform-independent, supporting local and distributed testing using Selenium Grid. Follow the provided instructions in the README file to set up and execute the tests seamlessly.

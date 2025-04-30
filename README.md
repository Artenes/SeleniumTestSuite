# Selenium UI Automation Test Suite

This project demonstrates a comprehensive Selenium-based test automation suite written in Java using JUnit 5 and the Page Object Model (POM) design pattern. It is designed as a portfolio project to showcase testing best practices and covers multiple real-world scenarios using [The Internet Herokuapp](https://the-internet.herokuapp.com/).

## 🧪 Tested Features

- ✅ Login functionality (valid and invalid credentials)
- ☑️ Checkbox interactions
- 🔽 Dropdown menu selection
- 📁 File upload feature
- ⚠️ JavaScript alert handling (alerts, confirms)
- 🔄 Dynamic content (checkbox disappearance, input enable/disable)

## 🛠 Tech Stack

- Java 17+
- Selenium 4
- JUnit 5
- Maven
- Chrome WebDriver

## 📁 Project Structure

````
SeleniumTestSuite/
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── pages/
    │           ├── BasePage.java
    │           ├── LoginPage.java
    │           ├── CheckboxesPage.java
    │           ├── DropdownPage.java
    │           ├── FileUploadPage.java
    │           ├── JavaScriptAlertsPage.java
    │           └── DynamicControlsPage.java
    └── test/
        └── java/
            └── tests/
                ├── LoginTest.java
                ├── CheckboxesTest.java
                ├── DropdownTest.java
                ├── FileUploadTest.java
                ├── JavaScriptAlertsTest.java
                └── DynamicControlsTest.java

````

## 🚀 Getting Started

**Prerequisites**

- Java JDK 17 or higher installed
- Maven installed
- Chrome browser installed
- ChromeDriver installed and properly set in your system path

## Setup

1. Clone the repository:

````
git clone https://github.com/Artenes/SeleniumTestSuite.git
````

2. Navigate to the project directory:

````
cd SeleniumTestSuite
````

3. Install dependencies:

````
mvn clean install
````

Run the test suite:

````
mvn test
````

## 📸 Sample Outputs

- Test execution will open Chrome in headless mode and perform operations like login, checkbox selection, file uploads, and alert handling.
- Success and failure results will be reported in the console by Maven's Surefire plugin.

## 📈 Future Improvements

- Add a reporting tool like Allure or ExtentReports for detailed HTML reports
- Integrate with CI/CD pipelines (GitHub Actions, Jenkins)
- Add parallel cross-browser testing (using WebDriverManager / Selenium Grid)
- Add retry logic for flaky tests

## 📄 License

This project is licensed under the MIT License.

## 👤 Author
Artenes Junior Gomes Nogueira

- GitHub: https://github.com/Artenes
- LinkedIn: https://linkedin.com/in/artenes
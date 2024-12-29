# Playwright Test Automation for Demoblaze
This project automates the test scenarios for "https://www.demoblaze.com/" using **Playwright** with **Java**.

## Test Scenarios
1. User can register with valid data.
2. User can log in with valid credentials.
3. User can log out.
4. User can successfully create an order for an Apple monitor 24.

## Project Structure
. ├── src/ │ └── test/ │ └── java/ │ ├── com/ │ └── demoblaze/ │ ├── pages/ # Page Object Model classes │ ├── tests/ # Test cases │ └── utils/ # BaseTest class for setup ├── pom.xml # Maven dependencies └── README.md


## Running the Tests
To run the tests, use the following command:
mvn test

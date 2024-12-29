package com.demoblaze.tests;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTest {
    static Playwright playwright;
    static Browser browser;
    static BrowserContext context;
    static Page page;

    @BeforeAll
    public static void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
    }

    @Test
    public void testLogin() throws InterruptedException {
        HomePage homePage = new HomePage(page);
        LoginPage loginPage = new LoginPage(page);

        homePage.navigateToHome();
        homePage.clickLoginButton();
        loginPage.login("validUser", "validPassword");

        assertTrue(page.locator("a#logout2").isVisible());
    }

    @AfterAll
    public static void teardown() {
        browser.close();
        playwright.close();
    }
}

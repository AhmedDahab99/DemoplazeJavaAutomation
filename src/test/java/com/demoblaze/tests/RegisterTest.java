package com.demoblaze.tests;
import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.RegisterPage;
import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertTrue;

public class RegisterTest {
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
    public void testRegister() {
        HomePage homePage = new HomePage(page);
        RegisterPage registerPage = new RegisterPage(page);

        homePage.navigateToHome();
        homePage.clickRegisterButton();
        registerPage.register("newUser", "newPassword");

        assertTrue(page.locator("a#login2").isVisible());
    }

    @AfterAll
    public static void teardown() {
        browser.close();
        playwright.close();
    }
}

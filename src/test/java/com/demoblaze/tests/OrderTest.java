package com.demoblaze.tests;

import com.demoblaze.pages.HomePage;
import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
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
    public void testCreateOrder() {
        HomePage homePage = new HomePage(page);

        homePage.navigateToHome();
        assertTrue(page.locator("h2:has-text('Thank you for your purchase!')").isVisible());
    }

    @AfterAll
    public static void teardown() {
        browser.close();
        playwright.close();
    }
}

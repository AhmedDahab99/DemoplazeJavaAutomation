package com.demoblaze.utils;

import com.microsoft.playwright.*;
import org.testng.annotations.*;

public class BaseTest {
    protected Browser browser;
    protected Page page;

    @BeforeClass
    public void setup() {
        Playwright playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)); // Set headless to false to see the browser
        page = browser.newPage();
    }

    @AfterClass
    public void teardown() {
        page.close();
        browser.close();
    }
}
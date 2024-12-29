package com.demoblaze.pages;

import com.microsoft.playwright.Page;

public class HomePage {
    private final Page page;

    public HomePage(Page page) {
        this.page = page;
    }

    public void navigateToHome() {
        page.navigate("https://www.demoblaze.com/");
    }

    public void clickLoginButton() {
        page.locator("a#login2").click();
    }

    public void clickRegisterButton() {
        page.locator("a#signin2").click();
    }
}

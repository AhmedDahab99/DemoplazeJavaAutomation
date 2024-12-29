package com.demoblaze.pages;

import com.microsoft.playwright.Page;

public class RegisterPage {
    private final Page page;

    public RegisterPage(Page page) {
        this.page = page;
    }

    public void register(String username, String password) {
        page.locator("input#sign-username").fill(username);
        page.locator("input#sign-password").fill(password);
        page.locator("button#signInModal > .btn-primary").click();
    }
}

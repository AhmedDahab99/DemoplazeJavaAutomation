package com.demoblaze.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

public class LoginPage {
    private final Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void login(String username, String password) {
        page.locator("input#loginusername").fill(username);
        page.locator("input#loginpassword").fill(password);
        Locator loginButton = page.locator("button#logInModal > .btn-primary");
        loginButton.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE).setTimeout(60000));
        loginButton.click();

    }
}

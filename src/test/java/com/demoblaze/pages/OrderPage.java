package com.demoblaze.pages;

import com.microsoft.playwright.*;

public class OrderPage {
    private final Page page;

    public OrderPage(Page page) {
        this.page = page;
    }

    private Locator placeOrderButton() {
        return page.locator("button:has-text('Place Order')");
    }

    private Locator purchaseButton() {
        return page.locator("button:has-text('Purchase')");
    }

    public void placeOrder() {
        placeOrderButton().click();
    }

    public void purchase() {
        purchaseButton().click();
    }
}
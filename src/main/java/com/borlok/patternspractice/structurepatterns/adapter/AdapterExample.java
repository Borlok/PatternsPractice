package com.borlok.patternspractice.structurepatterns.adapter;

public class AdapterExample {
    public AdapterExample() {
        OnlineShop shopping = new OnlineShoppingByManAdapter();
        shopping.buy();
        shopping.order();
        shopping.search();
    }
}

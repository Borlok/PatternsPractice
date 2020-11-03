package com.borlok.patternspractice.structurepatterns.adapter;

public class OnlineShoppingByManAdapter extends Man implements OnlineShop{
    @Override
    public void buy() {
        buyAnyStuff();
    }

    @Override
    public void order() {
        orderSomeStuff();
    }

    @Override
    public void search() {
        searchAnyStaff();
    }
}

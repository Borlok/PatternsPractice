package com.borlok.patternspractice.behaviorpatterns.combinator;

public class CombinatorExample {
    Customer customer = new Customer(
            "Yurii",
            "yurii@mail.com",
            "+0123321123"
    );

    public CombinatorExample () {
        CustomerValidator.Validation validation = CustomerValidator.isEmailValid().and(CustomerValidator.isNumberValid()).apply(customer);
        System.out.println(validation);
    }
}

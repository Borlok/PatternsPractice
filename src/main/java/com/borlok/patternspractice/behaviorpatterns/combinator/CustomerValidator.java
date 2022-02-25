package com.borlok.patternspractice.behaviorpatterns.combinator;

import java.util.function.Function;
import static com.borlok.patternspractice.behaviorpatterns.combinator.CustomerValidator.*;
import static com.borlok.patternspractice.behaviorpatterns.combinator.CustomerValidator.Validation.*;

public interface CustomerValidator extends Function<Customer, Validation> {

    static CustomerValidator isEmailValid () {
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerValidator isNumberValid () {
        return customer -> customer.getNumber().contains("+0") ? SUCCESS : NUMBER_NOT_VALID;
    }

    default CustomerValidator and(CustomerValidator other) {
        return customer -> {
            Validation validation = this.apply(customer);
            return validation.equals(SUCCESS) ? other.apply(customer) : validation;
        };
    }

    enum Validation {
        SUCCESS,
        EMAIL_NOT_VALID,
        NUMBER_NOT_VALID
    }
}

package com.hanifiamdev.lombok;

import org.junit.jupiter.api.Test;


class CustomerTest {

    @Test
    void testCustomer() {

        var customer = new Customer();
        customer.setId("100");
        customer.setName("Hanif");

        System.out.println(customer.getId());
        System.out.println(customer.getName());

    }

}
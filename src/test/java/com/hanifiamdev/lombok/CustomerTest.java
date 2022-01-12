package com.hanifiamdev.lombok;

import org.junit.jupiter.api.Assertions;
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

    @Test
    void testCustomerConstructor() {

        var customer = new Customer("ID", "NAME");
        Assertions.assertEquals("ID", customer.getId());
        Assertions.assertEquals("NAME", customer.getName());

    }

}
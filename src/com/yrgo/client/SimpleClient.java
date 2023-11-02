package com.yrgo.client;

import com.yrgo.domain.Customer;
import com.yrgo.services.customers.CustomerManagementService;
import com.yrgo.services.customers.CustomerNotFoundException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yrgo.services.customers.CustomerManagementMockImpl;


public class SimpleClient {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("file:src/application.xml");

        CustomerManagementService customerManagementService = container.getBean(CustomerManagementService.class);

        var listOfCustomers = customerManagementService.getAllCustomers();
        for (Customer customer : listOfCustomers) {
            System.out.println(customer);
        }
    }
}

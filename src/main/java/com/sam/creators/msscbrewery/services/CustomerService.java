package com.sam.creators.msscbrewery.services;

import com.sam.creators.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * @version 1.0.0 10/08/2019
 * @author sangeles
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}

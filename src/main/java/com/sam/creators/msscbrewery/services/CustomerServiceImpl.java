package com.sam.creators.msscbrewery.services;

import com.sam.creators.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @version 1.0.0 10/08/2019
 * @author sangeles
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Nadja Marcelo")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //TO-DO
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting the beer with the ID: " + customerId);
    }
}

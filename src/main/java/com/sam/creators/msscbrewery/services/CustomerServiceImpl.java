package com.sam.creators.msscbrewery.services;

import com.sam.creators.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @version 1.0.0 10/08/2019
 * @author sangeles
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Nadja Marcelo")
                .build();
    }
}

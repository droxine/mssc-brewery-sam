package com.sam.creators.msscbrewery.services;

import com.sam.creators.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * @version 1.0.0 10/08/2019
 * @author sangeles
 */
public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}

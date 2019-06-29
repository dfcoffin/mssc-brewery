package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by Donald F. Coffin on 06/29/2019 at 12:56
 */
public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}


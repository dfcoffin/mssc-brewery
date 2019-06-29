package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by Donald F. Coffin on 06/29/2019 at 16:25
 */
public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}

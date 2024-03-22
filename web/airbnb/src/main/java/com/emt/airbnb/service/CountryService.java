package com.emt.airbnb.service;

import com.emt.airbnb.domain.dto.CountryDTO;
import com.emt.airbnb.domain.entity.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {
    List<Country> getAllCountries();
    Country findCountryById(long id);
    Country createCountry(CountryDTO countryDTO);
    Country updateCountry(Country countryDTO);
    boolean deleteCountry(long id);
}

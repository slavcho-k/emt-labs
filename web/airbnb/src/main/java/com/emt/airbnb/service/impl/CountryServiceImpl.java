package com.emt.airbnb.service.impl;


import com.emt.airbnb.domain.dto.CountryDTO;
import com.emt.airbnb.domain.entity.Country;
import com.emt.airbnb.repository.CountryRepository;
import com.emt.airbnb.service.CountryService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll().stream().toList();
    }

    @Override
    public Country findCountryById(long id) {
        return countryRepository.findById(id).orElseThrow();
    }

    @Override
    public Country createCountry(CountryDTO countryDTO) {
        val country = new Country(countryDTO.getName(), countryDTO.getContinent());
        return countryRepository.save(country);
    }

    @Override
    public Country updateCountry(Country newCountry) {
        val country = countryRepository.findById(newCountry.getId()).orElseThrow();
        country.setContinent(country.getContinent());
        country.setName(newCountry.getName());
        country.setContinent(newCountry.getContinent());
        countryRepository.save(country);
        return country;
    }

    @Override
    public boolean deleteCountry(long id) {
        val country = countryRepository.findById(id).orElseThrow();
        countryRepository.delete(country);
        return true;
    }
}

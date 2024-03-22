package com.emt.airbnb.api;

import com.emt.airbnb.domain.dto.CountryDTO;
import com.emt.airbnb.domain.entity.Country;
import com.emt.airbnb.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/country")
public class CountryController {
    private final CountryService countryService;

    @GetMapping("/all")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("get/{id}")
    public Country getCountryById(@PathVariable long id) {
        return countryService.findCountryById(id);
    }

    @PostMapping("/add")
    public Country addCountry(@RequestBody CountryDTO countryDTO) {
        return countryService.createCountry(countryDTO);
    }

    @PostMapping("/update")
    public Country updateCountry(@RequestBody Country country) {
        return countryService.updateCountry(country);
    }

    @DeleteMapping("delete/{id}")
    public boolean deleteCountry(@PathVariable long id) {
        return countryService.deleteCountry(id);
    }
}

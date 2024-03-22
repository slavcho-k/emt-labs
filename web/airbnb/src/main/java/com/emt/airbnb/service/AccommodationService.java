package com.emt.airbnb.service;

import com.emt.airbnb.domain.dto.AccommodationDTO;
import com.emt.airbnb.domain.dto.CountryDTO;
import com.emt.airbnb.domain.entity.Accommodation;
import com.emt.airbnb.domain.entity.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccommodationService {
    List<Accommodation> getAllAccommodations();
    Accommodation findAccommodationById(long id);
    Accommodation createAccommodation(AccommodationDTO accommodationDTO);
    Accommodation updateAccommodation(Accommodation accommodation);
    boolean deleteAccommodation(long id);
    boolean makeReservation(long id);
}

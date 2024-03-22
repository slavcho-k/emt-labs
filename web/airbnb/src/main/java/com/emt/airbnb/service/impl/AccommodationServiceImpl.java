package com.emt.airbnb.service.impl;

import com.emt.airbnb.domain.dto.AccommodationDTO;
import com.emt.airbnb.domain.entity.Accommodation;
import com.emt.airbnb.repository.AccommodationRepository;
import com.emt.airbnb.service.AccommodationService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccommodationServiceImpl implements AccommodationService {
    private final AccommodationRepository accommodationRepository;

    @Override
    public List<Accommodation> getAllAccommodations() {
        return accommodationRepository.findAll();
    }

    @Override
    public Accommodation findAccommodationById(long id) {
        return accommodationRepository.findById(id).orElseThrow();
    }

    @Override
    public Accommodation createAccommodation(AccommodationDTO accommodationDTO) {
        val accommodation = new Accommodation(accommodationDTO);
        return accommodationRepository.save(accommodation);
    }

    @Override
    public Accommodation updateAccommodation(Accommodation accommodation) {
        val toUpdate = accommodationRepository.findById(accommodation.getId()).orElseThrow();
        toUpdate.setName(accommodation.getName());
        toUpdate.setAccommodationType(accommodation.getAccommodationType());
        toUpdate.setHost(accommodation.getHost());
        toUpdate.setNumRooms(accommodation.getNumRooms());
        return accommodationRepository.save(toUpdate);
    }

    @Override
    public boolean deleteAccommodation(long id) {
        val accommodation = accommodationRepository.findById(id).orElseThrow();
        accommodationRepository.delete(accommodation);
        return true;
    }

    @Override
    public boolean makeReservation(long id) {
        val accommodation = accommodationRepository.findById(id).orElseThrow();
        accommodation.setAvailable(false);
        accommodationRepository.save(accommodation);
        return true;
    }
}

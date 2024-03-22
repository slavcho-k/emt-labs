package com.emt.airbnb.api;

import com.emt.airbnb.domain.dto.AccommodationDTO;
import com.emt.airbnb.domain.entity.Accommodation;
import com.emt.airbnb.service.AccommodationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accommodation")
public class AccommodationController {
    private final AccommodationService accommodationService;

    @GetMapping("/all")
    public List<Accommodation> getAllAccommodations() {
        return accommodationService.getAllAccommodations();
    }

    @PostMapping("/add")
    public Accommodation addAccommodation(@RequestBody AccommodationDTO accommodationDTO) {
        return accommodationService.createAccommodation(accommodationDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteAccommodation(@PathVariable long id) {
        return accommodationService.deleteAccommodation(id);
    }

    @PostMapping("/update")
    public Accommodation updateAccommodation(@RequestBody Accommodation accommodation) {
        return accommodationService.updateAccommodation(accommodation);
    }

    @GetMapping("/make-reserved/{id}")
    public boolean makeReservation(@PathVariable long id) {
        return accommodationService.makeReservation(id);
    }
}

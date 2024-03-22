package com.emt.airbnb.domain.entity;

import com.emt.airbnb.domain.dto.AccommodationDTO;
import com.emt.airbnb.domain.enums.AccommodationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private AccommodationType accommodationType;
    @ManyToOne
    private Host host;
    private int numRooms;
    private boolean isAvailable;

    public Accommodation(AccommodationDTO accommodationDTO) {
        this.name = accommodationDTO.getName();
        this.accommodationType = accommodationDTO.getAccommodationType();
        this.host = accommodationDTO.getHost();
        this.numRooms = accommodationDTO.getNumRooms();
        this.isAvailable = true;
    }
}

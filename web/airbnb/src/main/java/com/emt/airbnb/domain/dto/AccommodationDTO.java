package com.emt.airbnb.domain.dto;

import com.emt.airbnb.domain.entity.Host;
import com.emt.airbnb.domain.enums.AccommodationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccommodationDTO {
    private String name;
    private AccommodationType accommodationType;
    private Host host;
    private int numRooms;
}

package com.emt.airbnb.domain.dto;

import com.emt.airbnb.domain.entity.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HostDTO {
    String name;
    String surname;
    Country country;
}

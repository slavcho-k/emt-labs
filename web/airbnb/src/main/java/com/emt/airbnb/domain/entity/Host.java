package com.emt.airbnb.domain.entity;

import com.emt.airbnb.domain.dto.HostDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Host {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;
    @ManyToOne
    private Country country;

    public Host(HostDTO host) {
        this.name = host.getName();
        this.surname = host.getSurname();
        this.country = host.getCountry();
    }
}

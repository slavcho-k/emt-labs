package com.emt.airbnb.service;

import com.emt.airbnb.domain.dto.CountryDTO;
import com.emt.airbnb.domain.dto.HostDTO;
import com.emt.airbnb.domain.entity.Country;
import com.emt.airbnb.domain.entity.Host;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HostService {
    List<Host> getAllHosts();
    Host findHostById(long id);
    Host createHost(HostDTO hostDTO);
    Host updateHost(Host hostDTO);
    boolean deleteHost(long id);
}

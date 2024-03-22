package com.emt.airbnb.service.impl;

import com.emt.airbnb.domain.dto.HostDTO;
import com.emt.airbnb.domain.entity.Host;
import com.emt.airbnb.repository.HostRepository;
import com.emt.airbnb.service.HostService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HostServiceImpl implements HostService {
    private final HostRepository hostRepository;

    @Override
    public List<Host> getAllHosts() {
        return hostRepository.findAll();
    }

    @Override
    public Host findHostById(long id) {
        return hostRepository.findById(id).orElseThrow();
    }

    @Override
    public Host createHost(HostDTO hostDTO) {
        val host = new Host(hostDTO);
        return hostRepository.save(host);
    }

    @Override
    public Host updateHost(Host hostDTO) {
        val host = hostRepository.findById(hostDTO.getId()).orElseThrow();
        host.setName(hostDTO.getName());
        host.setSurname(hostDTO.getSurname());
        host.setCountry(host.getCountry());
        return hostRepository.save(host);
    }

    @Override
    public boolean deleteHost(long id) {
        val host = hostRepository.findById(id).orElseThrow();
        hostRepository.delete(host);
        return true;
    }
}

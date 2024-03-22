package com.emt.airbnb.api;

import com.emt.airbnb.domain.dto.HostDTO;
import com.emt.airbnb.domain.entity.Host;
import com.emt.airbnb.service.HostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/host")
public class HostController {
    private final HostService hostService;

    @GetMapping("/all")
    public List<Host> getAllCountries() {
        return hostService.getAllHosts();
    }

    @GetMapping("get/{id}")
    public Host getHostById(@PathVariable long id) {
        return hostService.findHostById(id);
    }

    @PostMapping("/add")
    public Host addHost(@RequestBody HostDTO hostDTO) {
        return hostService.createHost(hostDTO);
    }

    @PostMapping("/update")
    public Host updateHost(@RequestBody Host host) {
        return hostService.updateHost(host);
    }

    @DeleteMapping("delete/{id}")
    public boolean deleteHost(@PathVariable long id) {
        return hostService.deleteHost(id);
    }
}

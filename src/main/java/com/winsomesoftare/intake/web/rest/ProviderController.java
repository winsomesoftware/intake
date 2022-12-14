package com.winsomesoftare.intake.web.rest;

import com.winsomesoftare.intake.domain.Provider;
import com.winsomesoftare.intake.model.ProviderDto;
import com.winsomesoftare.intake.service.ProviderService;
import com.winsomesoftare.intake.web.mapper.ProviderMapper;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/provider")
@Slf4j
public class ProviderController {

    private final ProviderService providerService;
    private final ProviderMapper providerMapper;

    public ProviderController(ProviderService providerService, ProviderMapper providerMapper) {

        this.providerService = providerService;
        this.providerMapper = providerMapper;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ProviderDto> getAllProviders() {

         List<Provider> providerDomain = providerService.getAllProviders();

         return providerMapper.map(providerDomain);

    }

    @GetMapping("/{providerid}")
    @ResponseStatus(HttpStatus.OK)
    public ProviderDto getProvider(@PathVariable("providerid") Long providerId) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @PutMapping("/{providerid}")
    @ResponseStatus(HttpStatus.OK)
    public ProviderDto updateProvider(@PathParam("providerid") Long providerId, @RequestBody ProviderDto providerDto) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ProviderDto addProvider(@RequestBody ProviderDto providerDto) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @DeleteMapping("/{providerid}")
    @ResponseStatus(HttpStatus.OK)
    public void remove(@PathVariable("providerid") Long providerId) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

}

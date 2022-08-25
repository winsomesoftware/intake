package com.winsomesoftare.intake.service;


import com.winsomesoftare.intake.domain.Provider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ProviderService {

    public List<Provider> getAllProviders() {

        Provider provider = new Provider();
        provider.setId(1L);
        provider.setName("Great West Rehab");
        provider.setNpi(23345232L);

        List<Provider> providers = new ArrayList<>();
        providers.add(provider);

        return providers;
    }
}

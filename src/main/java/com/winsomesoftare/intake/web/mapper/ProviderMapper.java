package com.winsomesoftare.intake.web.mapper;

import com.winsomesoftare.intake.domain.Provider;
import com.winsomesoftare.intake.model.ProviderDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProviderMapper {

    List<ProviderDto> map(List<Provider> providers);

    ProviderDto providerToProviderDto(Provider provider);
}

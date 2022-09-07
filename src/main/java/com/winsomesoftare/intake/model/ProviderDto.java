package com.winsomesoftare.intake.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ProviderDto implements Serializable {

    Long id;

    Long npi;

    String name;
}

package com.winsomesoftare.intake.web.rest;

import com.winsomesoftare.intake.BaseControllerUnitTest;
import com.winsomesoftare.intake.ControllerUnitTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
@ControllerUnitTest
public class ProviderControllerTest extends BaseControllerUnitTest {

    static final String GET_ALL_PROVIDERS_API = "/api/provider";
    @Test
    public void testGetAllProviders() throws Exception {
        String json = mockMvc.perform(get(GET_ALL_PROVIDERS_API))
                .andExpect(status().is2xxSuccessful())
                .andReturn()
                .getResponse()
                .getContentAsString();

        assertTrue(json.contains("npi"));
        assertTrue(json.contains("id"));
        assertTrue(json.contains("name"));
    }
}

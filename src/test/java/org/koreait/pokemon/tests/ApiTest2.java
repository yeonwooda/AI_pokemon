package org.koreait.pokemon.tests;

import org.junit.jupiter.api.Test;
import org.koreait.pokemon.api.services.ApiUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApiTest2 {
    @Autowired
    private ApiUpdateService service;

    @Test
    void updateTest1() {
        service.update(3);
        service.update(4);
    }
}

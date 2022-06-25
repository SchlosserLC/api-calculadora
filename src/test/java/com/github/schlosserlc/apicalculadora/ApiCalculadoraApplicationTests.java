package com.github.schlosserlc.apicalculadora;

import com.github.schlosserlc.apicalculadora.service.SomaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiCalculadoraApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertEquals(10, SomaService.somaValores(5, 5));
	}

}

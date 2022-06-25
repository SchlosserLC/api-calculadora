package com.github.schlosserlc.apicalculadora;

import com.github.schlosserlc.apicalculadora.dto.Entrada;
import com.github.schlosserlc.apicalculadora.service.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ApiCalculadoraApplicationTests {

	@Test
	void contextLoads() {
		//teste somar 2
		Assertions.assertEquals(10, Service.somaValores(5, 5));

		//teste somar todos
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(5);
		numeros.add(5);
		numeros.add(2);
		numeros.add(3);
		Assertions.assertEquals(15,
				Service.somaTudo(Entrada.builder()
						.numeros(numeros)
						.build()));

		Assertions.assertEquals(125, Service.multiplica(5, 5, 5));
	}

}

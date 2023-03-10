package com.apicalloguedes.futboldatosapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class FutbolDatosApiApplicationTests {

	@Test
	void contextLoads() {

		FutbolDatosApiApplication.main(new String[]{});
		assertTrue(true);

	}

}

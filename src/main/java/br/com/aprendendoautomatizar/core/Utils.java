package br.com.aprendendoautomatizar.core;

import java.util.Random;

public class Utils {

	private String endereco;

	public String enderecos() {

		Random random = new Random();

		String[] enderecos = { "Alameda Araguaia", "Alameda Tambore", "Rua de Jesus", "Rua Juscelino Kubitschek",
				"Alameda Paulista" };

		for (int i = 0; i < 1; i++) {
			endereco = enderecos[random.nextInt(enderecos.length)];
		}

		return endereco;
	}

	private String cep;

	public String ceps() {

		Random random = new Random();

		String[] ceps = { "02557", "02730", "02002", "01534" };

		for (int i = 0; i < 1; i++) {
			cep = ceps[random.nextInt(ceps.length)];
		}
		
		return cep;
	}
}

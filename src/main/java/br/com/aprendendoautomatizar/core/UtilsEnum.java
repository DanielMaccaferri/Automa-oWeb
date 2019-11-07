package br.com.aprendendoautomatizar.core;

public class UtilsEnum {

	enum Endereco {
		RUA1, RUA2, RUA3
	}
	
	private String endereco;

	public static void main(String[] args) {
		Endereco minhaVariavel = Endereco.RUA1;
		System.out.println(minhaVariavel);
	}

}

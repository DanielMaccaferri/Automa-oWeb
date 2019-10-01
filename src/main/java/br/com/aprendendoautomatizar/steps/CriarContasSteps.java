package br.com.aprendendoautomatizar.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import static br.com.aprendendoautomatizar.core.Driver.getDriver;

public class CriarContasSteps {
	
	String url = "http://automationpractice.com/index.php";
	
	@Dado("^que o usuario preenche os dados$")
	public void que_o_usuario_preenche_os_dados() throws Throwable {
		getDriver().get(url);
		System.out.println(getDriver().getTitle());
	  
	}

	@Quando("^os dados estão corretos$")
	public void os_dados_estão_corretos() throws Throwable {
		
	}
	   

	@Entao("^o usuario e cadastrado com sucesso$")
	public void o_usuario_e_cadastrado_com_sucesso() throws Throwable {
	 
	}



}

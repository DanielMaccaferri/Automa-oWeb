package br.com.aprendendoautomatizar.steps;

import static br.com.aprendendoautomatizar.core.Driver.getDriver;

import br.com.aprendendoautomatizar.funcionalidade.AuthenticationFuncionalidade;
import br.com.aprendendoautomatizar.funcionalidade.CatalogoProdutoFuncionalidade;
import br.com.aprendendoautomatizar.funcionalidade.CreateAnAccountFuncionalidade;
import br.com.aprendendoautomatizar.funcionalidade.HomeFuncionalidade;
import br.com.aprendendoautomatizar.funcionalidade.ProductAddToCartFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CriarContasSteps {
	
	String url = "http://automationpractice.com/index.php";
	HomeFuncionalidade home = new HomeFuncionalidade();
	AuthenticationFuncionalidade authentication = new AuthenticationFuncionalidade();
	CreateAnAccountFuncionalidade create= new CreateAnAccountFuncionalidade();
	CatalogoProdutoFuncionalidade catalogo = new CatalogoProdutoFuncionalidade();
	ProductAddToCartFuncionalidade product = new ProductAddToCartFuncionalidade();
			
			
	@Dado("^que o usuario preenche os dados$")
	public void que_o_usuario_preenche_os_dados() throws Throwable {
		getDriver().get(url);
		
		home.clicarBotaoSignIn();
		authentication.preencherCampoEmailAdress();
		authentication.clicarBotaoCreateAccount();		
		create.clicarBotaoGender();
		create.escreverCampoFirstName();
		create.escreverCampoLastName();
		create.escreverCampoPassword();
		create.selecionarCampoDate();
		create.selecionarCampoMonth();
		create.selecionarCampoYear();
		create.selecionarCampoAddress();
		create.selecionarCampoCity();
		create.selecionarCampoState();
		create.selecionarCampoCountry();
		create.selecionarCampoPhone();
		create.selecionarCampoMyAddress();
		create.selecionarCampoZipCode();
		create.selecionarCampoRegister();
		create.selecionarCampoWomen();
		catalogo.clicarBotaoBlouse();
		product.selecionaCampoCor();
		product.selecionaCampoSize();
		product.selecionarCampoQuantidade();
		product.selecionaBotaoAddToCart();
		product.selecionaBotaoProceed();
		
	}

	@Quando("^os dados estão corretos$")
	public void os_dados_estão_corretos() throws Throwable {
		
	}
	   

	@Entao("^o usuario e cadastrado com sucesso$")
	public void o_usuario_e_cadastrado_com_sucesso() throws Throwable {
	 
	}



}

package br.com.aprendendoautomatizar.funcionalidade;
import br.com.aprendendoutomatizar.pages.CatalogoProdutoPage;

public class CatalogoProdutoFuncionalidade {

	private CatalogoProdutoPage account;
	
	

	public CatalogoProdutoFuncionalidade(){
		account = new CatalogoProdutoPage();
	}
	public void clicarBotaoBlouse(){
		account.getBotaoBlouse().click();
	
		
	}

}

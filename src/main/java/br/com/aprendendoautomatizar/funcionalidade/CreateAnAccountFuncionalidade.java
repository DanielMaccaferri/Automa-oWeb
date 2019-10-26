package br.com.aprendendoautomatizar.funcionalidade;

import com.github.javafaker.Faker;

import br.com.aprendendoutomatizar.pages.CreateAnAccountPage;

public class CreateAnAccountFuncionalidade {

	private CreateAnAccountPage account;
	Faker faker = new Faker();

	public CreateAnAccountFuncionalidade() {

		account = new CreateAnAccountPage();
	}

	public void clicarBotaoGender() {
		account.getBotaoGender().click();
	}
	
	public void escreverCampoFirstName(){
		account.getCampoFirstName().sendKeys(faker.name().firstName());
	}
	
	public void escreverCampoLastName(){
		account.getCampoLastName().sendKeys(faker.name().lastName());
	}
	
	public void escreverCampoPassword(){
		account.getCampoPassword().sendKeys(faker.internet().password());
	}
	
	public void selecionarCampoDate(){
		account.getCampoDate().click();
		account.selecionaCampo(account.getCampoDate(), 1);
		
	}
	

}

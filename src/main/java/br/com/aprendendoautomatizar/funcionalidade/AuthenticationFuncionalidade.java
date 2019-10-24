package br.com.aprendendoautomatizar.funcionalidade;

import com.github.javafaker.Faker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

import br.com.aprendendoautomatizar.core.BasePage;
import br.com.aprendendoautomatizar.core.Driver;
import br.com.aprendendoutomatizar.pages.AuthenticationPage;

public class AuthenticationFuncionalidade {
	
	private AuthenticationPage authentication;
	Faker faker = new Faker();
	
	public AuthenticationFuncionalidade() {
		authentication = new AuthenticationPage();
	}
	
	public void preencherCampoEmailAdress() {
		authentication.getCaixaDeTextoEmailAdress().sendKeys(faker.internet().emailAddress());
	}
	
	public void clicarBotaoCreateAccount(){
		authentication.getBotaoCreateAnAccount().click();
	}
}



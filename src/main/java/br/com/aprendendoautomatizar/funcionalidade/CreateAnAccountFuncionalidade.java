package br.com.aprendendoautomatizar.funcionalidade;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import br.com.aprendendoautomatizar.core.Utils;
import br.com.aprendendoutomatizar.pages.CreateAnAccountPage;

public class CreateAnAccountFuncionalidade {

	private CreateAnAccountPage account;
	Faker faker = new Faker();
	private Utils utils = new Utils();

	public CreateAnAccountFuncionalidade() {
		account = new CreateAnAccountPage();
	}

	public void clicarBotaoGender() {
		account.getBotaoGender().click();
	}
	
	public void escreverCampoFirstName() {
		account.getCampoFirstName().sendKeys(faker.name().firstName());
		System.out.println(" Nome: " + faker.name().firstName());
	}

	public void escreverCampoLastName() {
		account.getCampoLastName().sendKeys(faker.name().lastName());
		System.out.println("Sobrenome: " + faker.name().lastName());
	}

	public void escreverCampoPassword() {
		account.getCampoPassword().sendKeys(faker.internet().password());
		System.out.println("Senha: " + faker.internet().password());
	}

	public void selecionarCampoDate() {
		account.selecionaCampo(By.id("days"), 3);

	}

	public void selecionarCampoMonth() {
		account.selecionaCampo(By.id("months"), 3);
	}

	public void selecionarCampoYear() {
		account.selecionaCampo(By.id("years"), 15);
	}

	public void selecionarCampoAddress() {
		account.getCampoAddress().sendKeys(utils.enderecos());
	}

	public void selecionarCampoCity() {
		account.getCampoCity().sendKeys(faker.address().city());
	}

	public void selecionarCampoState() {
		account.selecionaCampo(By.id("id_state"), 5);
	}

	public void selecionarCampoZipCode() {
		account.getCampoZipCode().sendKeys(utils.ceps());
	}

	public void selecionarCampoCountry() {
		account.selecionaCampo(By.id("id_country"), 1);
	}

	public void selecionarCampoPhone() {
		account.getCampoPhone().sendKeys(faker.phoneNumber().cellPhone());
	}

	public void selecionarCampoMyAddress() {
		account.getCampoMyAddress().sendKeys(faker.address().streetAddress());
	}

	public void selecionarCampoRegister() {
		account.getCampoRegister().click();
	}

	public void selecionarCampoWomen() {
		account.getCampoWomen().click();
	}
}

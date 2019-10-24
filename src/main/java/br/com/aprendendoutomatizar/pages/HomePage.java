package br.com.aprendendoutomatizar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.aprendendoautomatizar.core.BasePage;
import br.com.aprendendoautomatizar.core.Driver;

public class HomePage extends BasePage {

	@FindBy(xpath = "//div[@class=\"header_user_info\"]")
	WebElement botaoSigIn;

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	public WebElement getBotaoSignIn() {
		return botaoSigIn;
	}

	public void setBotaoSigIn(WebElement botaoSigIn) {
		this.botaoSigIn = botaoSigIn;
	}

}

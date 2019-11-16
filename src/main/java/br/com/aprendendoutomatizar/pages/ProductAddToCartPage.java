package br.com.aprendendoutomatizar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.aprendendoautomatizar.core.BasePage;
import br.com.aprendendoautomatizar.core.Driver;

public class ProductAddToCartPage extends BasePage {

	public ProductAddToCartPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "quantity_wanted")
	WebElement campoQuantidade;

	@FindBy(id = "group_1")
	WebElement campoSize;

	@FindBy(id = "color_8")
	WebElement campoCor;

	@FindBy(xpath = "//button[@class='exclusive']")
	WebElement botaoAddToCart;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span > i")
	WebElement botaoProceed;

	public WebElement getCampoQuantidade() {
		return campoQuantidade;
	}

	public WebElement getBotaoProceed() {
		return botaoProceed;
	}

	public void setBotaoProceed(WebElement botaoProceed) {
		this.botaoProceed = botaoProceed;
	}

	public void setCampoQuantidade(WebElement campoQuantidade) {
		this.campoQuantidade = campoQuantidade;
	}

	public WebElement getCampoSize() {
		return campoSize;
	}

	public void setCampoSize(WebElement campoSize) {
		this.campoSize = campoSize;
	}

	public WebElement getCampoCor() {
		return campoCor;
	}

	public void setCampoCor(WebElement campoCor) {
		this.campoCor = campoCor;
	}

	public WebElement getBotaoAddToCart() {
		return botaoAddToCart;
	}

	public void setBotaoAddToCart(WebElement botaoAddToCart) {
		this.botaoAddToCart = botaoAddToCart;
	}

}

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
	
	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	WebElement botaoProceedFinal;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	WebElement botaoProceedFinalAddress;
	
	@FindBy(id = "cgv")
	WebElement checkBoxIAgree;
	
	public WebElement getBotaoConfirmOrder() {
		return botaoConfirmOrder;
	}

	public void setBotaoConfirmOrder(WebElement botaoConfirmOrder) {
		this.botaoConfirmOrder = botaoConfirmOrder;
	}

	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	WebElement botaoProceedFinalAgree;

	@FindBy(xpath = "//a[@class='bankwire']")
	WebElement botaoPayment;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	WebElement botaoConfirmOrder;
	
	public WebElement getBotaoPayment() {
		return botaoPayment;
	}

	public void setBotaoPayment(WebElement botaoPayment) {
		this.botaoPayment = botaoPayment;
	}


	public WebElement getBotaoProceedFinalAgree() {
		return botaoProceedFinalAgree;
	}

	public void setBotaoProceedFinalAgree(WebElement botaoProceedFinalAgree) {
		this.botaoProceedFinalAgree = botaoProceedFinalAgree;
	}

	public WebElement getCheckBoxIAgree() {
		return checkBoxIAgree;
	}

	public void setCheckBoxIAgree(WebElement checkBoxIAgree) {
		this.checkBoxIAgree = checkBoxIAgree;
	}

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
	public WebElement getBotaoProceedFinalAddress() {
		return botaoProceedFinalAddress;
	}

	public void setBotaoProceedFinalAddress(WebElement botaoProceedFinalAddress) {
		this.botaoProceedFinalAddress = botaoProceedFinalAddress;
	}

	public WebElement getBotaoProceedFinal() {
		return botaoProceedFinal;
	}

	public void setBotaoProceedFinal(WebElement botaoProceedFinal) {
		this.botaoProceedFinal = botaoProceedFinal;
	}
}

package br.com.aprendendoutomatizar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.aprendendoautomatizar.core.BasePage;
import br.com.aprendendoautomatizar.core.Driver;

public class CreateAnAccountPage extends BasePage {

	public CreateAnAccountPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	/*
	 * super(); this.botaoGender = botaoGender; this.campoFirstName =
	 * campoFirstName; this.campoLastName = campoLastName; this.campoPassword =
	 * campoPassword; this.campoDate = campoDate; this.campoMonths =
	 * campoMonths; this.campoYears = campoYears; this.campoFirtsNameAddress =
	 * campoFirtsNameAddress; this.campoLastNameAddress = campoLastNameAddress;
	 * /this.campoAddress = campoAddress; this.campoCity = campoCity;
	 * this.campoState = campoState; this.campoCountry = campoCountry;
	 * this.campoPhone = campoPhone; this.campoMyAddress = campoMyAddress;
	 */

	@FindBy(id = "id_gender1")
	WebElement botaoGender;

	@FindBy(id = "customer_firstname")
	WebElement campoFirstName;

	@FindBy(id = "customer_lastname")
	WebElement campoLastName;

	@FindBy(id = "passwd")
	WebElement campoPassword;

	@FindBy(id = "days")
	WebElement campoDate;

	@FindBy(id = "months")
	WebElement campoMonths;

	@FindBy(id = "years")
	WebElement campoYears;

	@FindBy(id = "firstname")
	WebElement campoFirtsNameAddress;

	@FindBy(id = "lastname")
	WebElement campoLastNameAddress;

	@FindBy(id = "address1")
	WebElement campoAddress;

	@FindBy(id = "city")
	WebElement campoCity;

	@FindBy(id = "id_state")
	WebElement campoState;

	@FindBy(id = "postcode")
	WebElement campoZipCode;

	@FindBy(id = "id_country")
	WebElement campoCountry;

	@FindBy(id = "phone_mobile")
	WebElement campoPhone;

	@FindBy(id = "alias")
	WebElement campoMyAddress;

	@FindBy(id = "submitAccount") 
	WebElement campoRegister;
	
	
	public WebElement getBotaoGender() {
		return botaoGender;
	}

	public void setBotaoGender(WebElement botaoGender) {
		this.botaoGender = botaoGender;
	}

	public WebElement getCampoFirstName() {
		return campoFirstName;
	}

	public void setCampoFirstName(WebElement campoFirstName) {
		this.campoFirstName = campoFirstName;
	}

	public WebElement getCampoLastName() {
		return campoLastName;
	}

	public void setCampoLastName(WebElement campoLastName) {
		this.campoLastName = campoLastName;
	}

	public WebElement getCampoPassword() {
		return campoPassword;
	}

	public void setCampoPassword(WebElement campoPassword) {
		this.campoPassword = campoPassword;
	}

	public WebElement getCampoDate() {
		return campoDate;
	}

	public void setCampoDate(WebElement campoDate) {
		this.campoDate = campoDate;
	}

	public WebElement getCampoMonths() {
		return campoMonths;
	}

	public void setCampoMonths(WebElement campoMonths) {
		this.campoMonths = campoMonths;
	}

	public WebElement getCampoYears() {
		return campoYears;
	}

	public void setCampoYears(WebElement campoYears) {
		this.campoYears = campoYears;
	}

	public WebElement getCampoFirtsNameAddress() {
		return campoFirtsNameAddress;
	}

	public void setCampoFirtsNameAddress(WebElement campoFirtsNameAddress) {
		this.campoFirtsNameAddress = campoFirtsNameAddress;
	}

	public WebElement getCampoLastNameAddress() {
		return campoLastNameAddress;
	}

	public void setCampoLastNameAddress(WebElement campoLastNameAddress) {
		this.campoLastNameAddress = campoLastNameAddress;
	}

	public WebElement getCampoAddress() {
		return campoAddress;
	}

	public void setCampoAddress(WebElement campoAddress) {
		this.campoAddress = campoAddress;
	}

	public WebElement getCampoCity() {
		return campoCity;
	}

	public void setCampoCity(WebElement campoCity) {
		this.campoCity = campoCity;
	}

	public WebElement getCampoState() {
		return campoState;
	}

	public void setCampoState(WebElement campoState) {
		this.campoState = campoState;
	}

	public WebElement getCampoCountry() {
		return campoCountry;
	}

	public void setCampoCountry(WebElement campoCountry) {
		this.campoCountry = campoCountry;
	}

	public WebElement getCampoPhone() {
		return campoPhone;
	}

	public void setCampoPhone(WebElement campoPhone) {
		this.campoPhone = campoPhone;
	}

	public WebElement getCampoMyAddress() {
		return campoMyAddress;
	}

	public void setCampoMyAddress(WebElement campoMyAddress) {
		this.campoMyAddress = campoMyAddress;
	}
	
	public WebElement getCampoZipCode() {
		return campoZipCode;
	}

	public void setCampoZipCode(WebElement campoZipCode) {
		this.campoZipCode = campoZipCode;
	}
	
    
	public WebElement getCampoRegister() {
		return campoRegister;
	}

	public void setCampoRegister(WebElement campoRegister) {
		this.campoRegister = campoRegister;
	}

}

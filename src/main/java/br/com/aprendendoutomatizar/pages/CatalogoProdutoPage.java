package br.com.aprendendoutomatizar.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.aprendendoautomatizar.core.BasePage;
import br.com.aprendendoautomatizar.core.Driver;

public class CatalogoProdutoPage extends BasePage {

	public CatalogoProdutoPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}	

	//h4/a[contains(text(),'SAP M')]
	//div[@class="right-block"]/child::h5/a[@class="product-name"][contains(text(),'Blouse')]")
	//@FindBy(xpath = "//div[@class=\"header_user_info\"]")
	
	
	@FindBy(xpath = "//div[@class='right-block']//a[@class='product-name'][contains(text(),'Blouse')]") 
	WebElement botaoBlouse;

	public WebElement getBotaoBlouse() {
		return botaoBlouse;
	}

	public void setBotaoBlouse(WebElement botaoBlouse) {
		this.botaoBlouse = botaoBlouse;
	}

}

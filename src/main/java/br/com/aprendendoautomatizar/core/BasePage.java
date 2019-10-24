package br.com.aprendendoautomatizar.core;

import org.openqa.selenium.By;
import static br.com.aprendendoautomatizar.core.Driver.getDriver;

public class BasePage {

	public void clicar(By by) {
		getDriver().findElement(by).click();
	}

	public void escrever(By by, String escreve) {
		getDriver().findElement(by).sendKeys(escreve);
	}

}

package br.com.aprendendoautomatizar.core;

import static br.com.aprendendoautomatizar.core.Driver.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public void clicar(By by) {
		getDriver().findElement(by).click();
	}

	public void escrever(By by, String escreve) {
		getDriver().findElement(by).sendKeys(escreve);
	}

	public void selecionaCampo(By by,int index) {
		Select select = new Select (getDriver().findElement(by));
		select.selectByIndex(index);
	}
}

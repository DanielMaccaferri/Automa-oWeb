package br.com.aprendendoautomatizar.funcionalidade;

import br.com.aprendendoutomatizar.pages.HomePage;

public class HomeFuncionalidade {

	private HomePage home;

	public HomeFuncionalidade() {
		home = new HomePage();
	}

	public void clicarBotaoSignIn() {
		home.getBotaoSignIn().click();

	}

}

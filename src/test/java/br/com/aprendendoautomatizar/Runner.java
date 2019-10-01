package br.com.aprendendoautomatizar;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import br.com.aprendendoautomatizar.core.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.aprendendoautomatizar" }, features = {
		"src/main/java/br/com/aprendendoautomatizar/feature" }, plugin = { "pretty",
				"html:Reports/cucumber" }, tags = { "~@ignore", "@geral" })

public class Runner {
	
	@AfterClass
	public static void encerraTeste(){
		Driver.encerraDriver();
	}
	

}

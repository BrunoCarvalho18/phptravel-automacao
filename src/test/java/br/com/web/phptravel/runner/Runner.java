package br.com.web.phptravel.runner;

import static br.com.web.phptravel.core.Driver.encerraDriver;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.web.phptravel.steps" }, features = {
		"src/main/resources/br/com/web/phptravel/feature" }, plugin = { "pretty",
				"html:Reports/cucumber" },tags="@login")
public class Runner {
	
	@AfterClass
	public static void encerrarDriver() {
		encerraDriver();
	}
	
	

}

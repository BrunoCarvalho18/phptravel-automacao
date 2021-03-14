package br.com.web.phptravel.steps;

import static br.com.web.phptravel.core.Driver.getDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class LoginSteps {

	private String baseUrl = "https://phptravels.com/";
	private static ExtentHtmlReporter htmlReport;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;

	public static ExtentTest getExtentTest() {
		return extentTest;
	}

	@Before
	public static void Screenshot(Scenario cenario) {
		if (extentReport == null) {
			extentReport = new ExtentReports();
			htmlReport = new ExtentHtmlReporter("src/test/resources/prints/htmlReporter.html");
			extentReport.attachReporter(htmlReport);

		}
		extentTest = extentReport.createTest(cenario.getId());	
	}

	@Dado("acesso o site")
	public void acesso_o_site() {
		getDriver().get(baseUrl);
	}

	@Entao("realizo o login")
	public void realizo_o_login() {

	}

	@After
	public void afterCenario(Scenario cenario) {
		extentTest.log(Status.PASS, "Cenário: " + cenario.getName() + " executado com sucesso!");
		extentReport.flush();
	}

}

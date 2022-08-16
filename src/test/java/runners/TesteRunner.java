package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//Informa que os testes devem ser executados usando Cucumber
@RunWith(Cucumber.class) 

// Informa onde procurar por arquivos de Features e qual sistema de relatório usar
@CucumberOptions(
		features = "classpath:Features" // localização
		,glue = {"stepdefinitions"} 
		,tags = "@End2End"
		,plugin = {"pretty", "html:target/cucumber-reports.html"} // exibe mais informações 
		,monochrome = true // apresenta maior legibilidade sobre o relatório
		
		) 

public class TesteRunner {

}

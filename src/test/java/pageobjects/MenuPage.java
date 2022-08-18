package pageobjects;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.MetodosUteis;

public class MenuPage extends MetodosUteis  {
	
	Date hora = new Date();
	protected WebDriver driver;

	public MenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	// Para trecho da página que vai validar o login.
	@FindBy(how = How.CSS, using = ".btn-outline-danger")
	private WebElement paginaRestrita;
	
	public void esperarElemento(WebElement elemento) {
		// Espera implicita. Tempo máximo para montar um elemento.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		//Espera Explicita: Deve aguardar até o campo senha aparecer.
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(elemento));	
	}
	
	public void validarPaginaRestrita () {
	
		esperarElemento(paginaRestrita); // espera que o elemento seja apresentado
		WebDriverWait wait = new WebDriverWait(driver, 10);

		//assertTrue(driver.getPageSource().contains("Gerenciador"));
		wait.until(ExpectedConditions.textToBePresentInElement(paginaRestrita, "Sair"));
		assertTrue(paginaRestrita.isEnabled()); // verifica se o elemento está ativo.		
	}
}

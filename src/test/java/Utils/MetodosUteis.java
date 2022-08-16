package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepdefinitions.Hooks;

public class MetodosUteis {

	protected WebDriver driver;

	public void esperarElemento(WebElement elemento) {
		driver = Hooks.getBrowser();

		// Espera implicita. Tempo máximo para montar um elemento.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Espera Explicita: Deve aguardar até o campo aparecer.
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(elemento));
	}

	public void selecionar(WebElement elemento, String texto) {
		driver = Hooks.getBrowser();
		Select dropDown = new Select(elemento);
		dropDown.selectByVisibleText(texto);
	}
}

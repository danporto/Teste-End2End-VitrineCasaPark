package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utils.MetodosUteis;

public class LoginPage extends MetodosUteis {

	
	protected WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this); // inicia uma instância da classe conhecida.
		this.driver = driver;
	}
	
	// Localizar elementos dentro da página do usuário:
	
	// Para achar usuário
	@FindBy(how = How.ID, using = "user")
	private WebElement usuario;

	// Para achar senha
	@FindBy(how = How.ID, using = "password")
	private WebElement senha;

	// Para achar o botão de Entrar
	@FindBy(how = How.TAG_NAME, using = "button")
	private WebElement botaoEntrar;
	

	// Métodos que vão validar os campos acima:
	
	//Informar usuario com o argumento user
	public void informarUsuario(String user) {
		esperarElemento(usuario);
		usuario.sendKeys(user);
	}
	
	//Informar senha com o argumento password
	public void informarSenha(String password) {		
		esperarElemento(senha);
		senha.sendKeys(password);
	}
	
	// Simular o clique no botão
	public void clicarEntrar() {
		esperarElemento(botaoEntrar);
		botaoEntrar.click();
		}
	
	// Verificar erro de acesso.
	public void erroDeAcesso() {		
		Assert.assertTrue(driver.getPageSource().contains("usuário e/ou senha incorretos"));
	
//		Possivel Teste Adicional de Login não aplicável a esta página.
//		Assert.assertTrue(browser.getCurrentUrl().equals("http://localhost:/login?error")); 
	}
	
}

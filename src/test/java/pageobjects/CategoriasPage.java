package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.MetodosUteis;

public class CategoriasPage extends MetodosUteis {

	protected WebDriver driver;

	public CategoriasPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Para buscar no menu Categorias
	@FindBy(how = How.CSS, using = "#basic-navbar-nav > div > a:nth-child(2)")
	private WebElement menuCategorias;
	
	// Para buscar o menu Cadastrar dentro de Categorias
	@FindBy(how = How.XPATH, using = "//*[@id=\"tabs-categorias-tab-cadastrar-categoria\"]")
	private WebElement menuCadastrarCategorias;
	
	// Achar o campo nome da Categoria.
	@FindBy(how = How.ID, using = "formBasicEmail")
	private WebElement nomeDaCategoria;
	
	// Achar o campo nome da Alias.
	@FindBy(how = How.CSS, using = ".form-group + .form-group :nth-child(2)")
	private WebElement nomeDaAlias;
	
	// Achar o botão imagem.
	@FindBy(how = How.ID, using = "image")
	private WebElement Imagem;
	
	// Achar o botão Cadastrar
	@FindBy(how = How.CSS, using = "#tabs-categorias-tabpane-cadastrar-categoria > div > div > button")
	private WebElement botaoCadastrar;

	// Simular o clique do botão
	public void clicarEmCategorias() {
		esperarElemento(menuCategorias);
		menuCategorias.click();

	}

	// Para simular o clique no menu Cadastrar dentro de Categorias
	public void clicarEmCadastrarCategorias() {
		esperarElemento(menuCadastrarCategorias);
		menuCadastrarCategorias.click();
	}

	// Digitar o nome da Categoria
	public void digitarNomeDaCategoria(String campoNomeDaCategoria) {
		esperarElemento(nomeDaCategoria);
		nomeDaCategoria.sendKeys(campoNomeDaCategoria);
	}

	// Digitar o nome da Alias
	public void digitarNomeDaAlias(String campoNomeDaAlias) {
		esperarElemento(nomeDaAlias);
		nomeDaAlias.sendKeys(campoNomeDaAlias);
	}

	// Incluir Imagem
	public void incluirImagem() {
		esperarElemento(Imagem);
		WebElement uploadImage = driver.findElement(By.id("image"));
		uploadImage.sendKeys(System.getProperty("user.dir") + "/image/areaexterna.jpeg");

		// Outras formas de se obter o mesmo resultado.
		// Imagem.sendKeys(System.getProperty("user.dir") +
		// "/image/camamesaebanho.jpg");
		// Runtime.getRuntime().load("System.getProperty("user.dir") +
		// "/image/camamesaebanho.jpg");

	}

	// Para simular o clique no menu Cadastrar dentro de Categorias
	public void clicarEmCadastrar() {
		esperarElemento(botaoCadastrar);
		botaoCadastrar.click();
	}

	// Verificar existência de cadastro válido
	public void validarCadastro()  {			
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();  
	}

	// Verificar erro de Cadastro
	public void erroDeCadastro() {
		WebDriverWait wait = new WebDriverWait(driver, 5);	
		try {
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
			Assert.assertTrue(false);	
		} catch (TimeoutException e) {
			// TODO: handle exception	
		}		
	}
}

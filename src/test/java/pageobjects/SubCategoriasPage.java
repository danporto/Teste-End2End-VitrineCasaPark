package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class SubCategoriasPage extends MetodosUteis {

	protected WebDriver driver;

	public SubCategoriasPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Para buscar no menu SubCategorias
	@FindBy(how = How.XPATH, using = "//*[@id=\"basic-navbar-nav\"]/div/a[3]")
	private WebElement menuSubCategorias;

	// Para buscar o menu Cadastrar dentro de SubCategorias
	@FindBy(how = How.XPATH, using = "//*[@id=\"tabs-subcategorias-tab-cadastrar-subcategoria\"]")
	private WebElement menuCadastrarSubCategorias;

	// Achar o campo nome da SubCategoria.
	@FindBy(how = How.XPATH, using = "//*[@id=\"name\"]")
	private WebElement nomeDaSubCategoria;

	// Achar o campo nome da SubAlias.
	@FindBy(how = How.XPATH, using = "//*[@id=\"formBasicEmail\"]")
	private WebElement nomeDaSubAlias;

	// Achar o selectCategoria
	@FindBy(how = How.XPATH, using = "//*[@id=\"category\"]")
	private WebElement selectCategoria;

	// Achar o botão Cadastrar
	@FindBy(how = How.XPATH, using = "//*[@id=\"tabs-subcategorias-tabpane-cadastrar-subcategoria\"]/div/div/button")
	private WebElement botaoCadastrarSubCategoria;

	// Simular o clique do botão
	public void clicarEmSubCategorias() {
		esperarElemento(menuSubCategorias);
		menuSubCategorias.click();
	}

	// Para simular o clique no menu Cadastrar dentro de SubCategorias
	public void clicarEmCadastrarSubCategorias() {
		esperarElemento(menuCadastrarSubCategorias);
		menuCadastrarSubCategorias.click();
	}

	// Digitar o nome da SubCategoria
	public void digitarNomeDaSubCategoria(String campoNomeDaSubCategoria) {
		esperarElemento(nomeDaSubCategoria);
		nomeDaSubCategoria.sendKeys(campoNomeDaSubCategoria);
	}

	// Digitar o nome da Alias
	public void digitarNomeDaSubAlias(String campoNomeDaSubAlias) {
		esperarElemento(nomeDaSubAlias);
		nomeDaSubAlias.sendKeys(campoNomeDaSubAlias);
	}

	// Selecionar Categoria Existente
	public void selecionarCategoriaExistente(String categoria) {
		esperarElemento(selectCategoria);
		selecionar(selectCategoria, categoria);
	}

	// Para simular o clique no menu Cadastrar dentro de SubCategorias
	public void clicarEmCadastrarCategoria() {
		esperarElemento(botaoCadastrarSubCategoria);
		botaoCadastrarSubCategoria.click();
	}
}

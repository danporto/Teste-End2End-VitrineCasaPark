package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.CategoriasPage;

public class CategoriasSteps  {

	CategoriasPage categoriasPageObjects = new CategoriasPage(Hooks.getBrowser());
	
	protected WebDriver driver;

	@Quando("acionar o menu Categorias")
	public void acionar_o_menu_categorias() {
		categoriasPageObjects.clicarEmCategorias();
	}
	
	@Quando("acionar o menu Cadastrar")
	public void acionar_o_menu_cadastrar() {
		categoriasPageObjects.clicarEmCadastrarCategorias();
	}
	
	@Quando("informar o campo Nome da Categoria {string}")
	public void informar_o_campo_nome_da_categoria(String arg1) {
		categoriasPageObjects.digitarNomeDaCategoria(arg1);
	}
	
	@Quando("informar o campo Alias da Categoria {string}")
	public void informar_o_campo_alias_da_categoria(String arg1) {
		categoriasPageObjects.digitarNomeDaAlias(arg1);
	}
	
	@Quando("incluir uma imagem")
	public void incluir_uma_imagem() {
		categoriasPageObjects.incluirImagem();
	}
	
	@Quando("submeter o forumlario pelo botao Cadastrar")
	public void submeter_o_forumlario_pelo_botao_cadastrar() {
		categoriasPageObjects.clicarEmCadastrar();
	}
	
	@Entao("o sistema devera imprimir um alert de categoria cadastrada com sucesso")
	public void o_sistema_devera_imprimir_um_alert_de_categoria_cadastrada_com_sucesso() {
		categoriasPageObjects.validarCadastro();	
	}
	
	@Entao("o sistema devera recusar o cadastro da categoria desejada.")
	public void o_sistema_devera_recusar_o_cadastro_da_categoria_desejada() {	
		categoriasPageObjects.erroDeCadastro();
	}
	
}

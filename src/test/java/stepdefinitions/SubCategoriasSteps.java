package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Quando;
import pageobjects.SubCategoriasPage;

public class SubCategoriasSteps {

	SubCategoriasPage subCategoriasPageObjects = new SubCategoriasPage(Hooks.getBrowser());

	protected WebDriver driver;

	@Quando("acionar o menu Subcategorias")
	public void acionar_o_menu_subcategorias() {

		subCategoriasPageObjects.clicarEmSubCategorias();
	}

	@Quando("acionar o menu Cadastrar dentro de Subcategorias")
	public void acionar_o_menu_cadastrar_dentro_de_subcategorias() {
		subCategoriasPageObjects.clicarEmCadastrarSubCategorias();
	}

	@Quando("informar o campo Nome da SubCategoria {string}")
	public void informar_o_campo_nome_da_sub_categoria(String arg1) {
		subCategoriasPageObjects.digitarNomeDaSubCategoria(arg1);

	}

	@Quando("informar o campo Alias da SubCategoria {string}")
	public void informar_o_campo_alias_da_sub_categoria(String arg1) {
		subCategoriasPageObjects.digitarNomeDaSubAlias(arg1);
	}

	@Quando("selecionar a categoria existente {string}")
	public void selecionar_a_categoria_existente(String arg1) {
		subCategoriasPageObjects.selecionarCategoriaExistente(arg1);
	}

	@Quando("submeter o forumlario pelo botao Cadastrar Subcategoria")
	public void submeter_o_forumlario_pelo_botao_cadastrar_subcategoria() {
		subCategoriasPageObjects.clicarEmCadastrarCategoria();
	}
}

package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.LoginPage;
import pageobjects.MenuPage;

public class LoginSteps {

	public static WebDriver driver;

	@Dado("que o usuario esteja na pagina principal")
	public void que_o_usuario_esteja_na_pagina_principal() {
		Hooks.abrirUrl("http://localhost:3001/");
		driver = Hooks.getBrowser();

	}
	
	@Dado("que o usuario esteja logado")
	public void que_o_usuario_esteja_logado() {
		LoginPage loginPageObjects = new LoginPage(driver); // importo os Objects criados em LoginPage
		loginPageObjects.informarUsuario("admin");
		loginPageObjects.informarSenha("admin");
		loginPageObjects.clicarEntrar();
		
	}

	@Quando("informar o campo Usuario como {string}")
	public void informar_o_campo_usuario_como(String arg1) {
		LoginPage loginPageObjects = new LoginPage(driver); 
		loginPageObjects.informarUsuario(arg1);
	}

	@Quando("informar o campo Senha como {string}")
	public void informar_o_campo_senha_como(String arg1) {
		LoginPage loginPageObjects = new LoginPage(driver); 
		loginPageObjects.informarSenha(arg1);
	}

	@Quando("clicar no botao Entrar")
	public void clicar_no_botao_entrar() {
		LoginPage loginPageObjects = new LoginPage(driver); 
		loginPageObjects.clicarEntrar();
	}

	@Entao("o sistema devera autorizar o Login, exibindo a pagina do CasaPark Vitrine")
	public void o_sistema_devera_autorizar_o_login_exigindo_a_pagina_do_casa_park_vitrine() {
		MenuPage menuPageObjects = new MenuPage(driver); // importo os Objects criados em menuPage
		menuPageObjects.validarPaginaRestrita();
		
	}
	
	@Entao("o sistema devera recusar o acesso, exibindo mensagem de usuario e senha incorretos")
	public void o_sistema_devera_recusar_o_acesso_exibindo_mensagem_de_usuario_e_senha_incorretos() {
		LoginPage loginPageObjects = new LoginPage(driver); 
		loginPageObjects.erroDeAcesso();
		
	}
	
	
}

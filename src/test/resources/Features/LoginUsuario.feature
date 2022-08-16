#language: pt
@LoginUsuario @End2End
Funcionalidade: Login

	Contexto:
		Dado que o usuario esteja na pagina principal
	
	@LoginUsuario
	Cenario: Realizar Login com Sucesso
		Quando informar o campo Usuario como "admin" 
		E informar o campo Senha como "admin"
		E clicar no botao Entrar
		Entao o sistema devera autorizar o Login, exibindo a pagina do CasaPark Vitrine
		
	Esquema do Cenario: Tentar realizar Login com dados inválidos
		Quando informar o campo Usuario como "<usuario>" 
		E informar o campo Senha como "<senha>" 
		E clicar no botao Entrar
		Entao o sistema devera recusar o acesso, exibindo mensagem de usuario e senha incorretos
		
	Exemplos:
		
		| usuario            | senha       | # Testes
		| admin              |             | # campo de senha vazio
		|                    | admin       | # campo de usuário vazio
		|                    |             | # campo de usuário e senha vazio
		| admin              | senhaerrada | # senha inválida
		| usuarioInexistente | admin       | # usário inválido		
			
# pensei em colocar um outro cenário quando o cliente informar o usuário com caractere proibido, especial ou com espaços, mas o banco de dados é flexível e permite o registro de usuários assim, até com espaço.
#language: pt
@Categorias @End2End 
Funcionalidade: Categorias

	Contexto:
		Dado que o usuario esteja na pagina principal
		E que o usuario esteja logado
	
	@CadastrarCategoria	
	Cenario: Cadastrar categoria usando dados validos
		Quando acionar o menu Categorias
		E acionar o menu Cadastrar
		E informar o campo Nome da Categoria "área externa"
		E informar o campo Alias da Categoria "areaexterna"
		E incluir uma imagem
		E submeter o forumlario pelo botao Cadastrar
		Entao o sistema devera imprimir um alert de categoria cadastrada com sucesso
		
	Esquema do Cenário: Cadastrar categoria inválida
		Quando acionar o menu Categorias
		E acionar o menu Cadastrar
		E informar o campo Nome da Categoria "<categorianome>" 
		E informar o campo Alias da Categoria "<categoriaalias>"
		E incluir uma imagem
		E submeter o forumlario pelo botao Cadastrar
		Entao o sistema devera recusar o cadastro da categoria desejada.
		
	
	Exemplos:
		
		| categorianome | categoriaalias  | # Testes:
		| área externa  | areaexterna     | # categoria duplicada
		| área externa  | area externa    | # alias com espaços
		| sala          | Sala            | # alias com maiúsculas
		| área externa  | área externa    | # alias com acentos
		| quarto        | quarto.         | # alias com ponto final
		|               | banheiro        | # categoria com campo vazio
		| office        |                 | # categoria com alias vazio
		
		
				
		
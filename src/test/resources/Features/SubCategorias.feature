#language: pt
@CadastrarSubCategoria @End2End 
Funcionalidade: Subcategorias

	Contexto:
		Dado que o usuario esteja na pagina principal
		E que o usuario esteja logado
	
	@CadastrarSubCategoria	
	Cenario: Cadastrar sub categoria usando dados validos
		Quando acionar o menu Subcategorias
		E acionar o menu Cadastrar dentro de Subcategorias
		E informar o campo Nome da SubCategoria "adornos e acessórios"
		E informar o campo Alias da SubCategoria "adornoseacessorios"
		E selecionar a categoria existente "área externa"
		E submeter o forumlario pelo botao Cadastrar Subcategoria
		Entao o sistema devera imprimir um alert de categoria cadastrada com sucesso
		
		
	Esquema do Cenário: Cadastrar subcategoria usando dados invalidos 
		Quando acionar o menu Subcategorias
		E acionar o menu Cadastrar dentro de Subcategorias
		E informar o campo Nome da SubCategoria "<subcategorianome>" 
		E informar o campo Alias da SubCategoria "<categoriaalias>"
		E selecionar a categoria existente "<categoriaexistente>"
		E submeter o forumlario pelo botao Cadastrar Subcategoria
		Entao o sistema devera recusar o cadastro da categoria desejada.
		
	Exemplos:
		
		| subcategorianome     | categoriaalias     | categoriaexistente | # Testes:
		| adornos e acessórios | adornoseacessorios | área externa       | # categoria duplicada
		| camas, mesa e banho  | cama mesa e banho  | quarto             | # alias com espaços
		| poltronas            | Poltronas          | quarto             | # alias com maiúsculas
		| sofás                | sofás              | sala               | # alias com acentos
		|                      | adornoseacessorios | área externa       | # categoria com campo vazio
		| cadeiras             |                    | sala               | # categoria com alias vazio
		
		
		
		

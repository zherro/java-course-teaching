package br.com.tdstecnologia.registrodeproducao;

/*
 
 Na classe Fabrica crie um método chamado produzir:
	- o método deve receber um parâmetro do tipo inteiro
	- O inteiro recebido deve ser usado para recuperar o nome do produto na
	variável estática produtos que foi criada na classe RegistroDeProducao na
	etapa 2.
	- ATENÇÃO: deve ser criada uma validação para procurar o produto apenas se
	o parâmetro passado é menor ou que o tamanho do array produtos da classe
	RegistroDeProducao
	- Criar uma instância da classe Produto e atribuir o nome do produto
	encontrado no array ao atributo descricao classe Produto
	- o método produzir deve retornar o produto criado

 */
public class Fabrica {
	
	
	public Produto produzir(int produto) {
	
		// verifica se o parametro
		// 5 > produto
		if(RegistroDeProducao.produtos.length > produto) {
			
			// recupera o nome do produto
			String nomeProduto = new RegistroDeProducao().produtos[produto];
			
			// cria um novo produto
			Produto novoProduto = new Produto();
			novoProduto.descricao = nomeProduto;
			
			// retorna o produto criado
			return novoProduto;
		} 
		
		// retorna um produto vazio
		Produto novoProduto = new Produto();
		novoProduto.descricao = "Produto Indefinido";
		
		return novoProduto;
	}
}





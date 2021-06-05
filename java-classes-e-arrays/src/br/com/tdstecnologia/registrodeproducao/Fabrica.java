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
	} // fim do metodo produzir
	
	

	/*
	 	Na classe Fabrica crie o método rodarEsteira
	 	 que recebe 3 parâmetros inteiros:
		produto, qtd e diaDaSemana
	
	 */
	public Produto[] rodarEsteira(int produto, int qtd, int diaDaSemana) {
		
		Produto[] produtos = new Produto[qtd];
		
		// 1° operacao - executada 1x antes do for ser iniciado
		
		// 2º operacao - executada toda vez que o laço for executado
		// 		|_ espera o booleam, que decide se o for vai ser executado
		
		// 3º operacao - executada toda vez que o for finaliza uma repetição
		
		for(int contador = 0; contador < qtd;  contador++  ) {
			produtos[contador] = produzir(produto);
		}
		
		int numeroDeExecucoes = RegistroDeProducao.registroSemanal[diaDaSemana][produto][0];
		int qtdProduzida = RegistroDeProducao.registroSemanal[diaDaSemana][produto][1];
		
		RegistroDeProducao.registroSemanal[diaDaSemana][produto][0] = ++numeroDeExecucoes;
		RegistroDeProducao.registroSemanal[diaDaSemana][produto][1] = qtdProduzida + produtos.length;
				
	
		return produtos;
		
	} // fim do metodo rodarEsteira

	
	public void executarLinhaDeProducao(String linha, int qtd, int diaDaSemana) {
		
		switch(linha) {
			case "LINHA01":
				rodarEsteira(0, qtd, diaDaSemana);
				break;
				
			case "LINHA02":
				rodarEsteira(1, qtd, diaDaSemana);
				break;
				
			case "LINHA_PRODUCAO_AGUA":
				Produto[] produtos = rodarEsteira(2, qtd, diaDaSemana);
				
				for(int i =0; i < produtos.length; i++) {

					System.out.println( " ---- ");
					System.out.println( " Produto ID: " +  produtos[i].id);
					System.out.println( " Produto produzido: " +  produtos[i].descricao);
				}
				break;
				
			case "LINHA04":
				rodarEsteira(3, qtd, diaDaSemana);
				break;
				
			case "LINHA05":
				rodarEsteira(4, qtd, diaDaSemana);
				break;
		}
	}
	

} // fim da classe Fabrica





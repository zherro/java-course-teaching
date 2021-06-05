package br.com.tdstecnologia.registrodeproducao;

/*
 	- Criar uma classe com nome ExecutarLinhaDeProducao.
 	- Cria um método chamado executarLinha
	
	- o método executarLinha deve receber um inteiro como parâmetro
	
	- Então crie uma instância da classe Fabrica,
	 através dessa instância execute o método produzir da classe 
	 Fabrica e passa o parâmetro recebido
	 
	- criar uma variável que receba o retorno do método produzir da Fabrica e
	imprimir as informações do produto produzido

 */
public class ExecutarLinhaDeProducao {

	public void executarLinha(int teste) {
		Fabrica fabrica = new Fabrica();

		Produto produtoCriado = fabrica.produzir(teste);
//		Produto produtoCriado = new Produto();

		System.out.println(" Produto Criado ----------- ");
		System.out.println(" ID:" + produtoCriado.id);
		System.out.println(" Nome:" + produtoCriado.descricao);
		System.out.println("--");
	}
	
	public void executarLinhaProduto1() {
		executarLinha(0);
	}
	

	public void executarLinhaProduto2() {
		executarLinha(1);
	}
	
	public static void main(String[] args) {
//		new ExecutarLinhaDeProducao().executarLinha(0);

		ExecutarLinhaDeProducao executar = new ExecutarLinhaDeProducao();
		executar.executarLinhaProduto1();
		executar.executarLinhaProduto2();
	}
	
}

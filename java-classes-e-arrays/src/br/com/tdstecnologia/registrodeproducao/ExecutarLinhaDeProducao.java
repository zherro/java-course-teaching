package br.com.tdstecnologia.registrodeproducao;


public class ExecutarLinhaDeProducao {

	public void imprimirRegistro() {
		
		// for para percorrer o nosso array
		for(int i=0; i < RegistroDeProducao.diasDaSemana.length; i++) {
			
			System.out.print( "___________________________________\n\n");
			System.out.println(" ---> " + RegistroDeProducao.diasDaSemana[i]  );
			
			for(int n=0; n < RegistroDeProducao.produtos.length; n++) {
				
				if( RegistroDeProducao.registroSemanal[i][n][0] > 0 ) {

					 System.out.println("Nome :" + RegistroDeProducao.produtos[n] );
					 
					 System.out.println("Execuções: " + 
							 RegistroDeProducao.registroSemanal[i][n][0] );
					 
					 System.out.println("Qtd produzida: " + 
							 RegistroDeProducao.registroSemanal[i][n][1] );
					 
					
//						   FAÇA: [ recupere o nome do produto com base no array
//					       RegistroDeProducao.produtos e o imprima ]
//					       FAÇA: [ imprima o número de execuções de esteira para o produto ]
//					       FAÇA: [ imprima a quantidade de produtos produzidas ]
					
					System.out.println("=====\n");

				}
				
				
			}
			
		} // FIM DO FOR

	}

	public static void main(String[] args) {
		
		Fabrica fabrica = new Fabrica();
		fabrica.executarLinhaDeProducao("LINHA01", 5, 3);
		
		fabrica.executarLinhaDeProducao("LINHA_PRODUCAO_AGUA", 3, 1);
		fabrica.executarLinhaDeProducao("LINHA_PRODUCAO_AGUA", 3, 1);
		fabrica.executarLinhaDeProducao("LINHA_PRODUCAO_AGUA", 3, 1);
		

		new ExecutarLinhaDeProducao().imprimirRegistro();
	}
	
}

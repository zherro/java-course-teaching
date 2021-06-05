package br.com.learnjava.basic.chapB.tipos.spec;

/**
 * 
 * @author Cleiton Oliveira
 *
 * O tipo boolean possui apenas dois estados, sendo eles: true ou false
 * 
 * Não é possivel converter outro tipo para boolean, ou converter boolean para outro tipo.
 *  
 */
public class TipoBoolean {

	boolean variavelDeInstancia;						// uma váriavel de instância do tipo primitivo boolean, recebe automaticamente false
	boolean variavelDeInstanciaInicializada = true;		// aqui criamos uma váriavel e atribuimos um valor a ela
	
	
	void imprimirVariaveisDeInstancia() {
				System.out.println("\n:::::::::::::::::::::::::  VARIAVEIS DE INSTANCIA  ::::::::::::::::::::::::\n");

		System.out.println("variavelDeInstancia: " + variavelDeInstancia);
		System.out.println("variavelDeInstanciaInicializada: " + variavelDeInstanciaInicializada);
	}
	
	
	public static void main(String[] args) {
		
		new TipoBoolean().imprimirVariaveisDeInstancia();
	}
	
	
}
package br.com.learnjava.basic.chapB.tipos.spec;

/**
 * 
 * @author Cleiton Oliveira
 *
 *	O tipo byte é o menor tipo numérico do java e tem capacidade de amarzenar de -128 a 127
 *
 *	Se tentarmos atribuir um valor menor ou maior ao permitido teremos um erro em tempo de compilação.
 *  
 *  Podemos então fazer casting (converter), um tipo maior para um tipo byte ?
 *  A resposta é: sim.
 *  
 *  Porém, haverá perca de informações caso o numero convertido seja maior que a capacidade do tipo
 * 
 */
public class TipoByte {
	
	byte variavelDeInstancia;						// uma váriavel de instância do tipo primitivo byte, recebe automaticamente 0
	byte variavelDeInstanciaInicializada = 127;		// aqui criamos uma váriavel e atribuimos um valor a ela
	
	
	
	
	void imprimeVariaveisDeInstancia() {
		System.out.println("\n::::::::::::::::::::::::::::  variaveis de intância   ::::::::::::::::::::::::::\n");
		
		System.out.println("variavelDeInstancia:" + variavelDeInstancia);
		System.out.println("variavelDeInstanciaInicializada:" + variavelDeInstanciaInicializada);
	}
	
	
	void conversaoDeTiposParaByte() {
		int valorInt = 112;
		int valorInt2 = 130;
		long valorLong = 9023948907429742L;

		byte fromInt = (byte) valorInt;
		byte fromInt2 = (byte) valorInt2;   // havera perca de informação, pois esta alem da capacidade de um tipo byte
		byte fromLong = (byte) valorLong;   // havera perca de informação, pois esta alem da capacidade de um tipo byte
		
		

		System.out.println("\n:::::::::::::::::::::::::  Tipos convertidos para byte  ::::::::::::::::::::::::\n");

		System.out.println('\u2713' + " - fromInt: " + valorInt + "  / result:" + fromInt);
		System.out.println("x - fromInt2: " + valorInt2 + "  / result:" + fromInt2);
		System.out.println("x - fromLong: " + valorLong + "  / result:" + fromLong);	
	}
	
	
	public static void main(String[] args) {
		
		new TipoByte().imprimeVariaveisDeInstancia();
		
		new TipoByte().conversaoDeTiposParaByte();
	}
}

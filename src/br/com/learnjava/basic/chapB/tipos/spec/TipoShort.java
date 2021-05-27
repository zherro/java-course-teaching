package br.com.learnjava.basic.chapB.tipos.spec;

/**
 * 
 * @author Cleiton Oliveira
 *
 *	O tipo short é maior que o tipo byte, um numérico do java e tem capacidade de amarzenar de -32768 a 32767
 *
 *	Se tentarmos atribuir um valor menor ou maior ao permitido teremos um erro em tempo de compilação.
 *  
 *  Podemos então fazer casting (converter), um tipo maior para um tipo short ?
 *  A resposta é: sim.
 *  
 *  Porém, haverá perca de informações caso o numero convertido seja maior que a capacidade do tipo
 * 
 * ! o tipo byte pode ser atribuido livremente ao tipo short, pois o tipo byte sempre será menor que um short
 */
public class TipoShort {
	
	short tipoShort;
	short tipoShortInicializado = 32767;
	
	void imprimeVariaveisDeInstancia() {
		System.out.println("\n::::::::::::::::::::::::::::  variaveis de intância   ::::::::::::::::::::::::::\n");
		
		System.out.println("tipoShort:" + tipoShort);
		System.out.println("tipoShortInicializado:" + tipoShortInicializado);
	}
	
	
	void conversaoDeTiposParaShort() {
		int valorInt = 8987;
		int valorInt2 = 33767;
		long valorLong = 9023948907429742L;

		byte valorByte = 127;
		
		short fromInt = (short) valorInt;
		short fromInt2 = (short) valorInt2;   // havera perca de informação, pois esta alem da capacidade de um short
		short fromLong = (short) valorLong;   // havera perca de informação, pois esta alem da capacidade de um short
		
		short fromByte = valorByte;
		

		System.out.println("\n:::::::::::::::::::::::::  Tipos convertidos para byte  ::::::::::::::::::::::::\n");

		System.out.println('\u2713' + " - fromInt: " + valorInt + "  / result:" + fromInt);
		System.out.println("x - fromInt2: " + valorInt2 + "  / result:" + fromInt2);
		System.out.println("x - fromLong: " + valorLong + "  / result:" + fromLong);	
		System.out.println('\u2713' + " - fromByte: " + valorByte + "  / result:" + fromByte);	
	}
	
	
	public static void main(String[] args) {
		
		new TipoShort().imprimeVariaveisDeInstancia();
		
		new TipoShort().conversaoDeTiposParaShort();
		
	}
}

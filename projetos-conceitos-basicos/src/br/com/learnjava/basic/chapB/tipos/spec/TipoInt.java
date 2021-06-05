package br.com.learnjava.basic.chapB.tipos.spec;

/**
 * 
 * @author Cleiton Oliveira
 *
 *	O tipo int é maior que o tipo byte e short, um numérico do java e tem capacidade de amarzenar de -2147483648 a 2147483647
 *
 *	Se tentarmos atribuir um valor menor ou maior ao permitido teremos um erro em tempo de compilação.
 *  
 *  Podemos então fazer casting (converter), um tipo maior para um tipo int ?
 *  A resposta é: sim.
 *  
 *  Porém, haverá perca de informações caso o numero convertido seja maior que a capacidade do tipo
 * 
 * ! os tipos byte e short podem ser atribuidos livremente ao tipo int, pois o tipo byte e short sempre será menor que um int
 */
public class TipoInt {

	int variavelDeInstancia;						// uma váriavel de instância do tipo primitivo int, recebe automaticamente 0
	int variavelDeInstanciaInicializada = 2684;		// aqui criamos uma váriavel e atribuimos um valor a ela
	
	void imprimirVariaveisDeInstancia() {
				System.out.println("\n:::::::::::::::::::::::::  VARIAVEIS DE INSTANCIA  ::::::::::::::::::::::::\n");

		System.out.println("variavelDeInstancia: " + variavelDeInstancia);
		System.out.println("variavelDeInstanciaInicializada: " + variavelDeInstanciaInicializada);
	}
	
	
	void conversaoDeTiposParaInt() {
		// de byte para int
		byte b = 100;
		int fromByte = b;
		
		// de short para int
		short s = 333;
		int fromShort = s;
		
		// de long para int  (pode haver perca de informação)
		long l = 234L;
		long maxLong = 9223372036854775807L;
		int fromLong = (int) l;
		int fromMaxLong = (int) maxLong;
		
		// de float para int  (pode haver perca de informação)
		float f = 23.45F;
		int fromFloat = (int) f;
		
		// de double para int  (pode haver perca de informação)
		double d = 2342.34;
		int fromDouble = (int) d;

		
		// de char para int
		char c = 'f';
		int fromChar = c;
		
		
		System.out.println("\n:::::::::::::::::::::::::  Tipos convertidos para int  ::::::::::::::::::::::::\n");

		System.out.println('\u2713' + " - fromByte: " + b + "  / result:" + fromByte);
		System.out.println('\u2713' + " - fromShort: " + s + "  / result:" + fromShort);
		System.out.println('\u2713' + " - fromLong: " + l + "  / result:" + fromLong);
		System.out.println("x - fromMaxLong: " + maxLong + "  / result:" + fromMaxLong);
		System.out.println("x - fromFloat: " + f + "  / result:" + fromFloat);
		System.out.println("x - fromDouble: " + d + "  / result:" + fromDouble);
		System.out.println("x - fromBoolea: não é permitido converter boolean para int");
		System.out.println('\u2713' + " - fromChar: " + c + "  / result:" + fromChar);
	}

	
	public static void main(String[] args) {
		
		new TipoInt().imprimirVariaveisDeInstancia();
	
		new TipoInt().conversaoDeTiposParaInt();
		
		System.out.println(Integer.MIN_VALUE);
	}
	
	
}
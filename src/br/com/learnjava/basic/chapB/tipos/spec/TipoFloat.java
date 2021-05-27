package br.com.learnjava.basic.chapB.tipos.spec;

/**
 * 
 * @author Cleiton Oliveira
 *
 *	O tipo float é o menor tipo de ponto flutuante do java,
 *  um numérico do java e tem capacidade de amarzenar de 1.17549435E-38 a 3.4028235E38
 *
 *	Deve-se ter cuidado ao converter tipos grandes como long e double para float, pois pode haver perca de informações.
 *  
 * 
 */
public class TipoFloat {

	float variavelDeInstancia;		// uma váriavel de instância do tipo primitivo float, recebe automaticamente 0
	
	
	// qualquer tipo de ponto flutuante no java é automaticamente um tipo double
	// por esse motivo, para atribuir um valor fracionado devemos adicionar a letra 'f' ou 'F' ao fim do numero
	float variavelDeInstanciaInicializada = 3.4028235E38F;		// aqui criamos uma váriavel e atribuimos um valor a ela
	
	
	// não é necessário adiciona a letra 'F', pois o float comporta um numero inteiro.
	float atribuirUmInt = 423423;
	
	
	void imprimirVariaveisDeInstancia() {
				System.out.println("\n:::::::::::::::::::::::::  VARIAVEIS DE INSTANCIA  ::::::::::::::::::::::::\n");

		System.out.println("variavelDeInstancia: " + variavelDeInstancia);
		System.out.println("variavelDeInstanciaInicializada: " + variavelDeInstanciaInicializada);
	}
	
	
	void conversaoDeTipos() {
		// de byte para float
		byte b = 100;
		float fromByte = b;
		
		
		// de short para float
		short s = 333;
		float fromShort = s;
		
		
		// de long para float  (pode haver perca de informação)
		long l = 234L;
		long maxLong = 9223372036854775807L;
		float fromLong = l;
		float fromMaxLong =  maxLong;
		
		
		// de float para float  (pode haver perca de informação - o double tem capacidade maior, mas pode haver diferenças de arredondamento também)
		double d = 23567.45;
		float fromDouble = (float) d;
		
		
		// de int para float
		int i = 2342;
		float fromInt = i;

		
		// de char para int
		char c = 'f';
		float fromChar = c;
		
		
		System.out.println("\n:::::::::::::::::::::::::  Tipos convertidos para int  ::::::::::::::::::::::::\n");

		System.out.println('\u2713' + " - fromByte: " + b + "  / result:" + fromByte);
		System.out.println('\u2713' + " - fromShort: " + s + "  / result:" + fromShort);
		System.out.println('\u2713' + " - fromLong: " + l + "  / result:" + fromLong);
		System.out.println("x - fromMaxLong: " + maxLong + "  / result:" + fromMaxLong);
		System.out.println("x - fromDouble: " + d + "  / result:" + fromDouble);
		System.out.println('\u2713' + " - fromInt: " +i + "  / result:" + fromInt);
		System.out.println("x - fromBoolea: não é permitido converter boolean para int");
		System.out.println('\u2713' + " - fromChar: " + c + "  / result:" + fromChar);
	}

	
	public static void main(String[] args) {
		
		new TipoDouble().imprimirVariaveisDeInstancia();
	
		new TipoDouble().conversaoDeTipos();
	}
	
	
}
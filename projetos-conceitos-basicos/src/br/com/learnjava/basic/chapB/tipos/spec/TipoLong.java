package br.com.learnjava.basic.chapB.tipos.spec;

/**
 * 
 * @author Cleiton Oliveira
 *
 *	O tipo long é maior tipo numérico inteiro do java, e tem capacidade de amarzenar de -9223372036854775808 a 9223372036854775807
 *
 *	Se tentarmos atribuir um valor menor ou maior ao permitido teremos um erro em tempo de compilação.
 *  
 *  Podemos atribuir outros tipos a uma varaivel do tipo long ?
 *  A resposta é: sim, 
 *  				todos os tipos numéricos inteiros podem ser atribuidos a uma váriavel do tipo long.
 *  
 *  Porém, poderá haver perca de informações quando realizado casting de um float ou double.
 * 
 */
public class TipoLong {

	long variavelDeInstancia;		// uma váriavel de instância do tipo primitivo long, recebe automaticamente 0
	
	// qualquer numero inteiro no java é automaticamente um tipo int
	// por esse motivo, para atribuir um valor a um long devemos adicionar a letra 'l' ou 'L' ao fim do numero
	long variavelDeInstanciaInicializada = 9223372036854775807L;	// aqui criamos uma váriavel e atribuimos um valor a ela
	
	void imprimirVariaveisDeInstancia() {
				System.out.println("\n:::::::::::::::::::::::::  VARIAVEIS DE INSTANCIA  ::::::::::::::::::::::::\n");

		System.out.println("variavelDeInstancia: " + variavelDeInstancia);
		System.out.println("variavelDeInstanciaInicializada: " + variavelDeInstanciaInicializada);
	}
	
	
	void conversaoDeTiposParaInt() {
		// de byte para long
		byte b = 100;
		long fromByte = b;
		
		// de short para long
		short s = 333;
		long fromShort = s;
		
		// de int para long 
		int i = 232342323;
		int fromInt = i;
		
		// de float para long  (pode haver perca de informação - pois long aceita apenas numeros inteiros)
		float f = 23.45F;
		long fromFloat = (long) f;
		
		// de double para long  (pode haver perca de informação - pois long aceita apenas numeros inteiros)
		double d = 2342.34;
		long fromDouble = (long) d;
		
		// de char para long
		char c = 'f';
		long fromChar = c;
		
		
		System.out.println("\n:::::::::::::::::::::::::  Tipos convertidos para int  ::::::::::::::::::::::::\n");

		System.out.println('\u2713' + " - fromByte: " + b + "  / result:" + fromByte);
		System.out.println('\u2713' + " - fromShort: " + s + "  / result:" + fromShort);
		System.out.println('\u2713' + " - fromInt: " + i + "  / result:" + fromInt);
		System.out.println("x - fromFloat: " + f + "  / result:" + fromFloat);
		System.out.println("x - fromDouble: " + d + "  / result:" + fromDouble);
		System.out.println("x - fromBoolea: não é permitido converter boolean para int");
		System.out.println('\u2713' + " - fromChar: " + c + "  / result:" + fromChar);
	}

	
	public static void main(String[] args) {
		
		new TipoLong().imprimirVariaveisDeInstancia();
	
		new TipoLong().conversaoDeTiposParaInt();
	}
	
	
}
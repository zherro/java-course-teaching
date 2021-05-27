package br.com.learnjava.basic.chapB.tipos.spec;

/**
 * 
 * @author Cleiton Oliveira
 *
 *	O tipo double é maior tipo de ponto flutuante do java,
 *  um numérico do java e tem capacidade de amarzenar de 2.2250738585072014E-308 a 1.7976931348623157E308
 *
 *	Por ter uma capacidade enorme, seria algo distante alcançar o maximo ou o minimo possivel para um double em um cenário real.
 *  
 *  Podemos fazer casting (converter), outros tipos para um tipo double ?
 *  
 *  A resposta é: 
 *  	Não é necessário conversão de nenhum tipo, pois dentro dos tipos primitivos do java o double acaba sendo o maior tipo numérico.
 *  
 *  Porém, dificilmente haverá perca de informação, pois alem de ser um tipo de ponto flutuante, possui grande capacidade.
 * 
 */
public class TipoDouble {

	double variavelDeInstancia;							// uma váriavel de instância do tipo primitivo double, recebe automaticamente 0
	double variavelDeInstanciaInicializada = 2684;		// aqui criamos uma váriavel e atribuimos um valor a ela
	
	
	void imprimirVariaveisDeInstancia() {
				System.out.println("\n:::::::::::::::::::::::::  VARIAVEIS DE INSTANCIA  ::::::::::::::::::::::::\n");

		System.out.println("variavelDeInstancia: " + variavelDeInstancia);
		System.out.println("variavelDeInstanciaInicializada: " + variavelDeInstanciaInicializada);
	}
	
	
	void conversaoDeTipos() {
		// de byte para double
		byte b = 100;
		double fromByte = b;
		
		
		// de short para double
		short s = 333;
		double fromShort = s;
		
		
		// de long para double  (pode haver perca de informação)
		long l = 234L;
		long maxLong = 9223372036854775807L;
		double fromLong = l;
		double fromMaxLong =  maxLong;
		
		
		// de float para double  (pode haver perca de informação - devido a arredondamento)
		float f = 23567.45F;
		double fromFloat = f;
		
		
		// de int para double 
		int d = 2342;
		double fromInt = d;

		
		// de char para double
		char c = 'f';
		double fromChar = c;
		
		
		System.out.println("\n:::::::::::::::::::::::::  Tipos convertidos para int  ::::::::::::::::::::::::\n");

		System.out.println('\u2713' + " - fromByte: " + b + "  / result:" + fromByte);
		System.out.println('\u2713' + " - fromShort: " + s + "  / result:" + fromShort);
		System.out.println('\u2713' + " - fromLong: " + l + "  / result:" + fromLong);
		System.out.println("x - fromMaxLong: " + maxLong + "  / result:" + fromMaxLong);
		System.out.println("x - fromFloat: " + f + "  / result:" + fromFloat);
		System.out.println('\u2713' + " - fromInt: " + d + "  / result:" + fromInt);
		System.out.println("x - fromBoolea: não é permitido converter boolean para int");
		System.out.println('\u2713' + " - fromChar: " + c + "  / result:" + fromChar);
	}

	
	public static void main(String[] args) {
		
		new TipoDouble().imprimirVariaveisDeInstancia();
	
		new TipoDouble().conversaoDeTipos();
	}
	
	
}
package br.com.learnjava.basic.chapB.tipos.spec;

/**
 * 
 * @author Cleiton Oliveira
 *
 *	O tipo char é um tipo texto do java, que aceita apenas um caracter por vez, ou seja,
 * não é possível adicionar uma palavra inteira ou mais de um caracter a uma variavel do tipo char
 *
 *	Uma váriavel do tipo char recebe valores entre aspas simples. Ex: char nomeDaVariavel = 'a';
 *  
 *  Um tipo char é uma representação de um caracter, e podemos inferir seu valor ao java através de:
 *  - um caracter diretamente
 *  - o numero que representa o caractere na tabela ascii
 *  - o codigo unicode do caracter
 *  
 *   Segue exeplos de tabelas ascii:
 *   - https://web.fe.up.pt/~ee96100/projecto/Tabela%20ascii.htm
 *   - https://www.matematica.pt/util/resumos/tabela-ascii.php
 *  
 */
public class TipoChar {

	char variavelDeInstancia;					// uma váriavel de instância do tipo primitivo double, recebe automaticamente ''
	char variavelDeInstanciaInicializada = 'b';
	
	void imprimirVariaveisDeInstancia() {
		System.out.println("\n:::::::::::::::::::::::::  VARIAVEIS DE INSTANCIA  ::::::::::::::::::::::::\n");

		System.out.println("variavelDeInstancia: " + variavelDeInstancia);
		System.out.println("variavelDeInstanciaInicializada: " + variavelDeInstanciaInicializada);
	}
	
	
	void tiposDeAtribuicoes() {
		
		System.out.println("\n:::::::::::::::::::::::::  ATRIBUINDO OS CARACTERES DIRETAMENTE  ::::::::::::::::::::::::\n");
		
		char algumCcaracter1 = '7';
		char algumCcaracter2 = 'h';
		char algumCcaracter3 = '?';
		char algumCcaracter4 = '#';
		char algumCcaracter5 = '✓';

		System.out.println(algumCcaracter1);
		System.out.println(algumCcaracter2);
		System.out.println(algumCcaracter3);
		System.out.println(algumCcaracter4);
		System.out.println(algumCcaracter5);
		
	}
	
	void tiposDeAtribuicoesPorUnicode() {
		
		System.out.println("\n:::::::::::::::::::::::::  ATRIBUINDO OS CARACTERES - através de unicode  ::::::::::::::::::::::::\n");
		
		char algumCcaracter1 = '\u0007';
		char algumCcaracter2 = '\u0068';
		char algumCcaracter3 = '\u003f';
		char algumCcaracter4 = '\u0023';
		char algumCcaracter5 = '\u2713';

		System.out.println(algumCcaracter1);
		System.out.println(algumCcaracter2);
		System.out.println(algumCcaracter3);
		System.out.println(algumCcaracter4);
		System.out.println(algumCcaracter5);
		
	}
	
	void tiposDeAtribuicoesPorNumero() {
		
		System.out.println("\n:::::::::::::::::::::::::  ATRIBUINDO OS CARACTERES - através de números  ::::::::::::::::::::::::\n");
		
		char algumCcaracter1 = 07;
		char algumCcaracter2 = 104;
		char algumCcaracter3 = 63;
		char algumCcaracter4 = 35;
		char algumCcaracter5 = 10003;

		System.out.println(algumCcaracter1);
		System.out.println(algumCcaracter2);
		System.out.println(algumCcaracter3);
		System.out.println(algumCcaracter4);
		System.out.println(algumCcaracter5);
		
	}

	
	public static void main(String[] args) {
		
		new TipoChar().imprimirVariaveisDeInstancia();

		new TipoChar().tiposDeAtribuicoes();
		new TipoChar().tiposDeAtribuicoesPorUnicode();
		new TipoChar().tiposDeAtribuicoesPorNumero();
	}
	
	
}
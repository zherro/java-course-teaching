package br.com.learnjava.basic.chapC.operadores;

/**
 * 
 * @author Cleiton Oliveira
 * 
 * O java possui 5 operadores aritiméticos:
 *
 */

//	+  	-> 	soma
//	- 	-> 	subtração
//	/	-> 	divisão
//	*	-> 	multiplicação
//	%	->	resto de divisão

public class OperadoresAritmeticos {
	
	void soma() {
		int valor1 = 11;
		int valor2 = 11;
		long valor3 = 22;
		
		int resultado1;
		int resultado2;
		long resultado3;
		
		/** o operador de soma realiza a soma de tipos numéricos do java */
		resultado1 = valor1 + valor2 + 11;
		
		/** é preciso se atentar que quando houver uma operação com mais de um tipo
			caso necessário determinar o tipo do resultado da operação, devem ser realizados as conversões necessárias */
		resultado2 = valor1 + (int) valor3;
		
		/** no exemplo abaixo não foi necessária uma conversão,
		 	a varáivel 'resultado3' é do tipo long.
		 	
		 	Sempre que for realizada uma operação matemática, o retorno será do tipo de maiorssssssssssss capacidade,
		 	ou seja, no exemplo abaixo, long é maior que int, logo, o resultado será do tipo long.
		 	
		 	Se for necessário que o resultado seja do tipo int, deve ser observado a operação acima, 
		 	que alimenta a variável de 'resultado2' */
		resultado3 = valor1 + valor3;
	}
	

}

package br.com.learnjava.basic.chapC.operadores;

/**
 * 
 * @author Cleiton Oliveira
 * 
 * O operador de decremento é utilizado para diminuir o valor de uma variavel numérica 
 * antes ou depois de uma operação.
 * 
 * O decremento sempre subtrai -1 da variavel.
 */
public class OperadorDecremento {
		
		
		public void decremento() {
			int varaivelNumerica = 0;
			
			// antes de prosseguir entenda o que é uma operação
			// uma operação e uma execução de código
			// em uma espressão podem haver varias operações
			
			
			
			// no exemplo abaixo a variavel é subtraida após a operação
			// nesse caso temos duas operações 
			
			// Operação 1: cria a varaive 'int varaivel2'
			// Operação 2: atribuimos o valor da variavel 'varaivelNumerica' a variavel 'varaivel2'
			
			// sendo assim nosso decremento vai acontecer após a operação, ou seja,
			// o valor da variavel 'varaivelNumerica' será atribuido a 'varaivel2' e só depois disso a 'varaivelNumerica' reberá -1 ao seu valor
			int varaivel2 = varaivelNumerica--;
			
			
			
			// agora nossa variavel 'varaivelNumerica' tem valor -1
			// e nossa variavel 'varaivel2' tem valor 0
			
			// nas duas operações abaixo realizamos subtraimos -1 das nossas duas variaveis
			// assim teremos:
			// varaivel2 = -1
			// varaivelNumerica = -2
			varaivel2--;
			varaivelNumerica--;
			
			
			// Na operação abaixo realizamos o decremento antes da operação
			// ou seja, o decremento acontece antes de atribuir o valor da 'varaivelNumerica' a  'varaivel2'
			// ao fim da execução da expressão as duas variaveis terão o mesmo valor
			varaivel2 = ++varaivelNumerica;		
			
		}

}

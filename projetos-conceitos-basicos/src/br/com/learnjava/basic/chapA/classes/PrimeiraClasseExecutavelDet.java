// declaração do pacote da classe
package br.com.learnjava.basic.chapA.classes;


/**
 * 
 * @author Cleiton oliveira
 * @github https://github.com/zherro
 * 
 * Nesta classe declaramos o método 'main'
 * 
 * No java, métodos são utilizados para realizar operações.
 * 
 * O método 'main' é utilizado pela JVM para iniciar a execução de uma aplicação, sem a chamada a um método main
 * o código é compilado mas não é executado.
 * 
 * Uma aplição pode possuir mais de um método main, porém apenas um será executado para iniciar a aplicação,
 * e podemos definir qual.
 *
 */
class PrimeiraClasseExecutavelDet {

	
	/**
	 * Método main, por padrão é chamado para inicio da execução de um programa java.
	 * Caso não houver esse método, ao tentar executar a classe um mensagem será retornada,
	 * informando a necessidade da declaração do método 'please define the main method as:
   	 * public static void main(String[] args)'.
	 * 
	 * Por padrão um método main valido deve ser:
	 * public: Esse é o modificador de acesso do método main. Deve ser sempre publico para que o java possa executar esse metodo.
	 * static: O método 'main' deve ser 'static', para que a JVM possa carregar a classe na memória e executar o método main.
	 * void: O método main não deve retornar nada, por isso seu retorno deve sempre ser do tipo 'void'.
	 * main: Esse é o nome do método principal do Java. Quando um programa java é iniciado, a JVM tenta encontrar o método main na classe ao qual foi iniciada a execução.
	 * String[] args: O metódo main no java, permite apenas um unico argumento, que deve ser um array de String. Quando executamos uma aplicação por linha de comando, podemos definir valores a serem recebidos como paramêtros.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// imprime 'Olá java', no console
		System.out.print("Olá java!");
		
	}
	// fim do metodo main

	
}
// fim da classe PrimeiraClasseExecutavelDet


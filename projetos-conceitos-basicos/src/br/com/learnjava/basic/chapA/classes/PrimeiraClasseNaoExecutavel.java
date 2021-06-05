package br.com.learnjava.basic.chapA.classes;


class PrimeiraClasseNaoExecutavel {
	
	// método main java 
	public static void main(String[] args) {
		System.out.print("Olá java!");
	}
	
	
	// metodo com nome main, mas não se qualifica como inicializador de uma aplicação pois não atende a todos os requisitos
	// pode parecer estranho de inicio dois métodos com o mesmo nome, porem para o java eles são diferentes, pois um possui um argumento (String[] args) e outro não
	public static void main() {
		System.out.print("Olá outro método!");
	}
	
/* Todos os metodos abaixo são validos, porém nenhum deles se qualificar para iniciar a execução da aplicação.
 * Por isso é importante se lembrar, que:
 * 
 * ! o nome main não e reservado apenas ao método main Java, podemos criar métodos com o nome main, poré se esse método não atender
 * todos os requisitos do método main, será apenas um método comum.
 * 
 
	static void main(String[] args) {
		
	}
	
	public  void main(String[] args) {
		
	}
	
	public static void main() {
		
	}
	
	
	public void main() {
	
	}
	
*/

/*	
	
	// método invalido, pois não possui um tipo de retorno		
	public static main(String[] args) {
		
	}
	
	// método invalido, pois não possui um tipo de retorno	
	public static main() {
		
	}
	
	
*/
	
	
}
// fim da classe PrimeiraClasseExecutavel


package br.com.learnjava.basic.chapB.tipos;

/**
 * 
 * @author Cleiton Oliveira
 * 
 * Vamos abordar sobre criação de variaveis no java.
 * 
 * Temos 3 tipos de váriaveis:
 * - GLOBAIS
 * - de INSTÂNCIAS
 * - LOCAIS
 *	
 *	Vamos tratar de variaveis  
 * 
 */
public class SobreVariaveisNoJava {

	// váriaveis de instância incializadas quando a classe é instânciada
	int umaVariavelDoTipoInt;	
	int umaVariavelDoTipoIntInicializada = 234;

	// váriaveis de instância incializadas quando a classe é instânciada
	String umaVariavelString;
	String umaVariavelStringInicializada = "Um texto qualquer";
	

	// não podemos atribuir valor a uma váriavel declarada na classe
	// podemos atribuir valor na hora da criação ou dentro de um método
	
		// umaVariavelDoTipoInt = 83383;
		// umaVariavelString = "atribuido valor";
	
	
	void umMetodoQualquer() {
		
		// dentro dos métodos podemos utilizar as variaveis de instância, atribuir valor e sobrescrever os valores atribuidos dinâmicamente
		umaVariavelDoTipoInt = 2323;		
		umaVariavelString = "um texto qualquer";
		
		

		// ???????????????????????????????????????????????????????????????????
		
		// pode criar dentro de um método uma variavem com mesmo nome de uma váriavel de instância
		// devemos apenas ter o cuidado de sabem qual variavel esta sendo observada pelo java
		
		// nesse cenario, a partir desse ponto do código sempre que utilizar  a variavel de nome 'umaVariavelDoTipoInt'
		// estaremos nos referindo a váriavel local do tipo long criada abaixo
		
		// acima utilizamos a váriavel de instância ( da classe )
		// esse comportamento é permitido no java, devido ao escopo das váriaveis
		
		// ##########  váriaveis DE INSTÂNCIA (declaradas na classe) são visiveis aos métodos da classe
		// ##########  váriaveis LOCAIS ( declaradas nos métodos ) são acessiveis/visiveis apenas dentro do método em que foram criadas 
		
		long umaVariavelDoTipoInt = 890;
		
		int umaVariavelDoTipoIntInicializada = 234;  // outra variavel loca que sobrescre a váriavel de instância a partir desse ponto do MÉTODO 
		
		// ???????????????????????????????????????????????????????????????????
	

		// variaveis locais acessiveis apenas dentro do método ao qual foram criadas
		String umaVariavelString;
		String umaVariavelStringInicializada = "Um texto qualquer";
		
		// dentro de métodos é possivel criar uma variavel e tendo atribuido ou não um valor a ela
		// atribuir um novo valor
		umaVariavelDoTipoInt = 83383;
		umaVariavelString = "atribuido valor";
	}
	
	void umOutroMetodoQualquer() {
		// aqui declaramos duas váriaveis
		
		// por mais que os nomes sejam iguais, estas abaixo não tem nenhuma relação com as váriaveis de instância (declaradas na classe)
		// e nem mesmo com as váriaveis declaradas no método 'umMetodoQualquer'
		
		// vale reforçar que podemos utlizar aqui as variaveis de intância, mas,
		// NÃO É POSSIVEL UTILIZAR AS VÁRIAVEIS DECLARADAS NO MÉTODO 'umMetodoQualquer'
		
		int umaVariavelDoTipoInt = 2323;		
		String umaVariavelString = "um texto qualquer";
	}

}

package br.com.learnjava.basic.chapB.tipos;


/**
 * 
 * @author Cleiton oliveira
 * 
 * Uma variável de tipo primitivo armazena exatamente um valor de seu tipo declarado por vez. 
 * Quando um outro valor é atribuído a uma dessas variáveis, seu valor anterior é substituído.
 *
 */
public class TiposPrimitivos {
	
	
	// ! varaiveis de tipo primitivo declaradas nas classe possuem um valor default atribuido.
	// ! porém é possivel atribuir um valor incial
	byte tipoByte;
	short tipoShort;
	int tipoInt;
	long tipoLong;
	float tipoFloat;
	double tipoDouble;
	boolean tipoBoolean;
	char tipoChar;
	
	// variavel tipo int inicializada
	int tipoIntInicializado = 6888;
	long tipoLongInicializado = 7677L;
	float tipoFloatInicializado = 977.654F;
	double tipoDoubleInicializado = 977D;
	
	/**
	 * O método abaixo imprime os valos atribuidos automaticamente as variaveis globais.
	 * Se atribuimos um valor, então esse será o valor da variavel ao incializar a aplicação.
	 */
	void imprimeValoresAutoAtribuidos() {
		System.out.println("\n::::::::::::::::::::::::: Imprimindo valores atribuidos automaticamente  :::::::::::::::::::::::::\n");

		
		System.out.print("byte:");
		System.out.println(tipoByte);		

		System.out.print("short:");
		System.out.println(tipoShort);		

		System.out.print("int:");
		System.out.println(tipoInt);		

		System.out.print("long:");
		System.out.println(tipoLong);		

		System.out.print("float:");
		System.out.println(tipoFloat);		

		System.out.print("double:");
		System.out.println(tipoDouble);		

		System.out.print("boolean:");
		System.out.println(tipoBoolean);		

		System.out.print("char:");
		System.out.println(tipoChar);
		
		
		System.out.println("\n::::::::::::::::::::::::::: Imprimindo valores atribuidos manualmente  :::::::::::::::::::::::::::\n");

		System.out.print("tipoIntInicializado:");
		System.out.println(tipoIntInicializado);	
		
		System.out.print("tipoLongInicializado:");
		System.out.println(tipoLongInicializado);
		
		System.out.print("tipoFloatInicializado:");
		System.out.println(tipoFloatInicializado);	
		
		System.out.print("tipoDoubleInicializado:");
		System.out.println(tipoDoubleInicializado);	
	}
	
	
	
	/**
	 * Quando uma variavel de tipo primitivo é declarada dentro de um método
	 * essa varaivel não recebe um valor default automaticamente.
	 * Assim, é necessário inicializar a variavel ou seja atribuir um valor valido a mesma, antes de utiliza-la em seu código.
	 */
	void exemploDeDeclaracaoDeVariavelEmMetodo() {
		int outroTipoInt;
		
		// remova o comentario da linha abaixo e verá que não podemos utilizar  variaveis locais sem antes inicializalas		
		//		System.out.println(outroTipoInt);
	}
	
	void exemploDeDeclaracaoDeVariavelEmMetodoComVariavelInicializada() {
		int outroTipoInt = 2;
		
		System.out.println(outroTipoInt);
	}
	
	
	
	
	public static void main(String[] args) {
		new TiposPrimitivos().imprimeValoresAutoAtribuidos();
		
		
		System.out.println("\n::::::::::::::::::::::::: Variaveis locais ( criadas dentro de métodos ) :::::::::::::::::::::::::\n");
		new TiposPrimitivos().exemploDeDeclaracaoDeVariavelEmMetodo();
		new TiposPrimitivos().exemploDeDeclaracaoDeVariavelEmMetodoComVariavelInicializada();
	}

}

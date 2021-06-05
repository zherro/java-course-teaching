package br.com.tdstecnologia.registrodeproducao;

/*
2 - Crie uma classe chamada RegistroDeProducao 

	essa classe deve possuir um tributo estático chamado registroSemanal.
	O atributo registroSemanal deve ser um array [7][5][2], veremos a seguir como o
	array deverá ser alimentado.
	
	Crie outro atributo estático chamado diasDaSemana, que deve ser um array do tipo
	String com 7 posições, e cada posição deve ser um dia da semana
	
	Crie um atributo chamado produtos, que deve ser um array de tipo String de
	tamanho 5. Cada item do array deve ser um nome de produto
 */
public class RegistroDeProducao {
	
	static int registroSemanal[][][] = new int[8][5][2];

	/*
	 	
	 	
	 	diasDaSemana = tamanho 8 posicoes
	 	
	 	{0} = "Domingo"
	 	{1} = "Segunda-feira"
	 	{2} = "Terça-feira"
		{3} = "Quarta-feira"
		{4} = "Quinta-feira"
		{5} = "Sexta-feira"
		{6} = "Sábado"
		{7} = "Dia-da-Breja"
	
	
	 */
	static String[] diasDaSemana = new String[]{ "Domingo", "Segunda-feira","Terça-feira",
									 "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado",
									 "Dia-da-Breja"};
	
	static String produtos[] = new String[5];
	
	int teste;
	
	// bloco statico
	{ 
		teste = 0;
		produtos[0] = "Produto1";
		produtos[1] = "Produto2";
		produtos[2] = "Garrafa De Agua";
		produtos[3] = "Produto4";
		produtos[4] = "Produto5"; 
	}
}

package br.com.tdstecnologia.registrodeproducao;

import java.util.UUID;

/*
 	1 - Crie uma classe de nome Produto, sua classe deve ter o seguintes atributos:
		1. id do tipo inteiro
		2. descricao do tipo String
		3. custoDeProducao de um tipo com ponto flutuante
 */
public class Produto {
	String id = UUID.randomUUID().toString();
	String descricao;
	double custoProducao;
	
	// A classe Produto não deve possuir um método main.
}

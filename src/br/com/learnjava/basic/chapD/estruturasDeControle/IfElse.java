package br.com.learnjava.basic.chapD.estruturasDeControle;

public class IfElse {

	public String usandoIf(int valor) {
		
		if(valor > 0) {
			return "valor é maior que zero";
		}
		
		return "valor=" + valor;
	}
	
	
	public String usandoIfElse(int valor) {
		
		
		if(valor > 0) {
			return "valor é maior que zero";
		} else {
			return "valor=" + valor;
		}
	
	}
	
	public String usandoIfElseIf(int valor) {
		
		if(valor > 0) {
			
			return "valor é maior que zero";
			
		} else if(valor == 0) {
			
			return "valor é zero";
			
		} else{
			
			return "valor=" + valor;
			
		}
	}
	
}

package br.com.learnjava.basic.chapD.estruturasDeControle;

public class SwitchCase {

	public void usandoSwitchCase(char caracter) {
		
		switch (caracter) {
			case 'a':
				System.out.println("passou por a");
				
			case 'b':
				System.out.println("passou por b");
				break;
				
			case 'c':
				System.out.println("passou por c");
				
			case 'd':
				System.out.println("passou por d");
				break;
				
			case 'e':
				System.out.println("passou por e");
				break;

			default:
				System.out.println("fim");
				break;
		}
	}
}

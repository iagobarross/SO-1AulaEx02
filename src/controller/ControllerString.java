/*2. Fazer uma aplicação Java em Eclipse que tenha uma operação que se permita entrar com um
texto, conforme exemplo abaixo, por Scanner ou JOptionPane, divida o texto em partes, com
split e exiba quantas partes aquele texto tem. A aplicação deve ter uma classe de controle
com métodos para operações e uma classe de visão que instancie a classe de controle para
a comunicação, A resposta da tarefa deve ser o print do console com as quantidades.

Texto 1: abóbora;abobrinha;alcachofra;aspargos;batata-doce;berinjela;beterraba
Texto 2: abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela;manga
Texto 3: acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula;agrião
*/
package controller;

public class ControllerString {

	public ControllerString() {
		super();
	}
	
	public void contarElementos(String frase) {
		String[] fraseSeparada = frase.split(";");
		int tamanho = fraseSeparada.length;
		
		System.out.println("O texto tem " + tamanho + " elementos.");
	}
}

package view;

import controller.ControllerString;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ControllerString contStr = new ControllerString();
		Scanner sc = new Scanner(System.in);
		
		String frase = sc.nextLine();
		contStr.contarElementos(frase);
	}

}

package aula03dia290824tarefa6;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
	int idade,dias;
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite sua idade: ");
	idade = ler.nextInt();
	
	dias = idade*365;
	System.out.println("Sua idade convertida em dias é de: "+ dias);

	}

}

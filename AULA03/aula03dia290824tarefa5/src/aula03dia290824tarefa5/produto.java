package aula03dia290824tarefa5;

import java.util.Scanner;

public class produto {

	public static void main(String[] args) {
	double produto,desconto;
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite o valor do produto: ");
	produto = ler.nextDouble();
	
	desconto = produto - (produto*0.1);
	System.out.println("Desconto de 10% aplicado, resultando em:" + desconto);
	
	
	}

}

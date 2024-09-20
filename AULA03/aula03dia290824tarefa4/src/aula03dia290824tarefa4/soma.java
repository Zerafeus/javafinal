package aula03dia290824tarefa4;
import java.util.Scanner;
public class soma {

	public static void main(String[] args) {
		int n1 = 0,n2 = 0,resultado = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		n1 = ler.nextInt();
		System.out.println("Informe o segundo numero: ");
		n2 = ler.nextInt();
		
		resultado = n1 + n2;
		System.out.println("A soma dos dois numeros é de: " + resultado);
		
		
	}

}

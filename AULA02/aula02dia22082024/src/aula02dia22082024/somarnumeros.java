package aula02dia22082024;
import java.util.Scanner;

public class somarnumeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		int n1=0, n2=0;
		System.out.println("Ïnforme o primeiro Numero");
		n1 = ler.nextInt();
		System.out.println("Ïnforme o Segundo Numero");
		n2 = ler.nextInt();
		System.out.println("A soma é: " + (n1 + n2));

	}

}

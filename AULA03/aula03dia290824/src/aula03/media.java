package aula03;
import java.util.Scanner; //Permite biblioteca
public class media {

	public static void main(String[] args) {
		int n1 = 0 ,n2 = 0 ,n3 = 0;
		double media = 0;
		Scanner ler = new Scanner(System.in); //Permite entrada de info
		System.out.println("Informe o primeiro numero: ");
		n1 = ler.nextInt ();
		System.out.println("Informe o segundo numero: ");
		n2 = ler.nextInt ();
		System.out.println("Informe o terceiro numero: ");
		n3 = ler.nextInt ();
		media = (n1+n2+n3)/3;
		System.out.println("A média é: " + media);
		
		
		}
}


//1  - Criar um algoritmo em pseudocódigo que solicite ao usuário que informe três números e calcule e mostre a media aritmética entre eles.




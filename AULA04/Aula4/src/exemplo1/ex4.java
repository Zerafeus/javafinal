package exemplo1;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	    double nota1 = 0,nota2 = 0, nota3 = 0, media = 0;
	    
	    System.out.println("Informe a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2+3+5);
		System.out.println(media);
		
	}

}

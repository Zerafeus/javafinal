package exemplo1;
import java.util.Scanner;
public class bhaskara {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a = 0, b = 0, c = 0;
		double delta = 0, X1 = 0, X2 = 0;
		
		System.out.println("Informe o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Informe o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Informe o valor de C: ");
		c = leia.nextDouble();
		
		delta = Math.pow(b, 2) - 4*a*c;
		
		if(delta >=0 ) {
			X1 = (-b + Math.sqrt(delta)) / (2*a);
			X2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("As raizes são " + X1 + "e" + X2);
		}else{
		System.out.println("A equação não possui raízes reais" );
		}
		

	}

}

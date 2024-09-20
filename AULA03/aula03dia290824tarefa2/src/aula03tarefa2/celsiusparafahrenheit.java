package aula03tarefa2;
import java.util.Scanner;
public class celsiusparafahrenheit {

	public static void main(String[] args) {
		double celsius = 0, fahrenheit = 0;
		Scanner ler = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius para realizar a conversão: ");
        celsius = ler.nextDouble ();
        fahrenheit = (celsius*9/5) + 32;
        System.out.println("A temperatura para Fahrenheit é de:" + fahrenheit);
	
	}

}

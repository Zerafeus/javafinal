package exemplo1;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double salariobase = 0, horastrabalhadas = 0,horasextras=0;
		double valorhora = 0,valorhoraextra = 0,salariofinal = 0;
		
		System.out.println("Informe o salario: ");
		salariobase = leia.nextDouble();
		
		System.out.println("Informe as horas trabalhadas: ");
		horastrabalhadas = leia.nextDouble();
		
		System.out.println("Informa as horas extras: ");
		horasextras = leia.nextDouble();
		
		valorhora = salariobase/horastrabalhadas;
		valorhoraextra = valorhora * 1.5;
		salariofinal = salariobase + (horasextras * valorhoraextra);
		
		if(salariofinal > 500) {
			salariofinal = salariofinal * 1.3;
		}
		System.out.println("Seu salario é: " + salariofinal);
	}

}

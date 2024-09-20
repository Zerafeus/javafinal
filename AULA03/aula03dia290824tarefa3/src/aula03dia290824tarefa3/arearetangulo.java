package aula03dia290824tarefa3;
import java.util.Scanner;
public class arearetangulo {

	public static void main(String[] args) {
		double largura = 0, altura = 0 , retangulo = 0;
		Scanner ler = new Scanner(System.in);
        System.out.println("Informe a largura: ");
        largura = ler.nextDouble ();
        System.out.println("Informe a altura: ");
        altura = ler.nextDouble ();
        retangulo = largura*altura;
        System.out.println ("A área do retângulo é de:" + retangulo);
		

	}

}

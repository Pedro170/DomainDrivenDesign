import java.util.Scanner;

public class exercicio22_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.print("Digite um número: ");
		num1 = leia.nextDouble();
		
		System.out.print("Digite outro número: ");
		num2 = leia.nextDouble();
		
		while( num2 < num1 ) {
			System.out.print("[ ERRO ] - O número " + num2 + " é menor que o número " + num1);
			
			System.out.print("\nDigite o segundo número novamente outro número: ");
			num2 = leia.nextDouble();
		}
		
		System.out.printf("Parabéns!! O número " + num2 + " é maior ou igual que o número " + num1);
	}

}

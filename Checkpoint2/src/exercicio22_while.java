import java.util.Scanner;

public class exercicio22_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.print("Digite um n�mero: ");
		num1 = leia.nextDouble();
		
		System.out.print("Digite outro n�mero: ");
		num2 = leia.nextDouble();
		
		while( num2 < num1 ) {
			System.out.print("[ ERRO ] - O n�mero " + num2 + " � menor que o n�mero " + num1);
			
			System.out.print("\nDigite o segundo n�mero novamente outro n�mero: ");
			num2 = leia.nextDouble();
		}
		
		System.out.printf("Parab�ns!! O n�mero " + num2 + " � maior ou igual que o n�mero " + num1);
	}

}

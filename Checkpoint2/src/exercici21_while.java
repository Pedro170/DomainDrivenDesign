import java.util.Scanner;

public class exercici21_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double num;
		
		System.out.println("=========== WHILE ===========");
		
		System.out.print("Digite um número: ");
		num = leia.nextDouble();		
		
		while( num < 0 ) {
			System.out.print("\n[ ERRO ] - Você digitou um número negativo.\nPor favo, digite outro número: ");
			num = leia.nextDouble();
		}
		
		System.out.print("\nParabéns!!! Agora você digitou um número positivo ou 0, que é o " + num);
		
		
	}

}

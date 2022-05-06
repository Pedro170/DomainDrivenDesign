import java.util.Scanner;

public class exercici21_DoWhile {
	
	public static void main( String[] args) {
		Scanner leia = new Scanner(System.in);
		double num;
		
		System.out.println("=========== DO WHILE ===========");
		
		do {
			System.out.print("Digite um número: ");
			num = leia.nextDouble();
			
			if( num < 0) {
				System.out.print("[ ERRO ] - Você digitou um número negativo. Por favo, digite outro número: \n");
			}
			
		} while( num < 0 );
		
		System.out.print("Parabéns!!! Agora você digitou um número positivo ou 0, que é o " + num);
	}
	
}

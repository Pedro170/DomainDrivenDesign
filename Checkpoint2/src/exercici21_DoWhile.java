import java.util.Scanner;

public class exercici21_DoWhile {
	
	public static void main( String[] args) {
		Scanner leia = new Scanner(System.in);
		double num;
		
		System.out.println("=========== DO WHILE ===========");
		
		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextDouble();
			
			if( num < 0) {
				System.out.print("[ ERRO ] - Voc� digitou um n�mero negativo. Por favo, digite outro n�mero: \n");
			}
			
		} while( num < 0 );
		
		System.out.print("Parab�ns!!! Agora voc� digitou um n�mero positivo ou 0, que � o " + num);
	}
	
}

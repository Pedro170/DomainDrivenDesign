import java.util.Scanner;

public class exercici21_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double num;
		
		System.out.println("=========== WHILE ===========");
		
		System.out.print("Digite um n�mero: ");
		num = leia.nextDouble();		
		
		while( num < 0 ) {
			System.out.print("\n[ ERRO ] - Voc� digitou um n�mero negativo.\nPor favo, digite outro n�mero: ");
			num = leia.nextDouble();
		}
		
		System.out.print("\nParab�ns!!! Agora voc� digitou um n�mero positivo ou 0, que � o " + num);
		
		
	}

}

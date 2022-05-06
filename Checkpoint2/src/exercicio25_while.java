import java.util.Scanner;

public class exercicio25_while {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num;
		int contador = 0;
		
		System.out.print("Digite um número: ");
		num = leia.nextDouble();
		
		while( num < 0 ) {
			System.out.print("Digite um número: ");
			num = leia.nextDouble();
			
			if( num > 0 )
			while( contador < 10 ) {
				contador += 1;
				System.out.println( num + " + " + contador + " = " + (contador + num ) );
			}
		}
	}
}

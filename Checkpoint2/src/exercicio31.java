import java.util.Scanner;

public class exercicio31 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero = -1;
		int n1 = 2;
		int n2 = 5;
		int n3 = 10;
		
			
			do {
				
				System.out.printf("Digite um número positivo menor que cem: ", numero);
				numero = leia.nextInt();
			
			} while (numero < 0 || numero > 100);
			
			if (numero > 0 && numero < 100) {
				
				for (int i = 0; i < numero; i++) {

					int n4 = n3 + n2 + n1;
					n3 = n4;
					n2 = n3;
					n1 = n2;
					System.out.println(n4);
					
				}
				
				
			}
	}

}

import java.util.Scanner;

public class exercicio29_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		int anterior = 1, atual = 1, proximo = anterior + atual, contador = 2, num;
		
		System.out.print("Digite o número que deseja ver a serie de Fibonacci: ");
		num = leia.nextInt();
		while( contador < num ) {
			contador = contador + 1;
			
			anterior = atual;
			atual = proximo;
			proximo = anterior + atual;
			
			num = proximo;
			System.out.println( num );
		}

	}

}

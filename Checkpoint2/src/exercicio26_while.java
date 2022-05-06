import java.util.Scanner;

public class exercicio26_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, tabuada, contador = 0;
		
		/*System.out.print("Digite um número: ");
		num = leia.nextInt(); */
		
		/*while( num < 0 ) {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
		}
		
		if( num > 0 )
			System.out.print("Qual o intervalo deseja fazer sua tabuada? ");
			tabuada = leia.nextInt();
			
			while(num < tabuada ) {
				System.out.println("[ ERRO ] - O segundo valor deve ser maior que o primeiro!");
				System.out.print("Qual o intervalo deseja fazer sua tabuada? ");
				tabuada = leia.nextInt();
			}
		
		while( contador > num ) {
			contador -= tabuada;
			System.out.println( num + " - " + contador + " = " + (num - contador));
		}*/
		
		System.out.print("Digite o contador: ");
		contador = leia.nextInt();
		
		System.out.print("Digite o número: ");
		num = leia.nextInt();
		
		System.out.print("Digite o intervalo: ");
		tabuada = leia.nextInt();
		
		while( num <= contador ) {
			System.out.println(contador);
			contador -= tabuada;
		}
	}

}

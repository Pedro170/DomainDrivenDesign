import java.util.Scanner;

public class exercicio23_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		char sexo, sexo2;
		//String sexo;
		
		// O progama está aceitando todas as paravras que começam com a letra "M" e "F" maiúscula
		
		System.out.print("Digite 'F' para feminino e 'M' para masculino: ");
		sexo = leia.next().charAt(0);
		
		sexo2 = sexo;
		//sexo = leia.nextLine();
		
		while( sexo2 != 'F' && sexo2 != 'M') {
			System.out.println("[ ERRO ] - O valor que você digitou é inválido. Por favor, digite um valor válido.");
			System.out.print("Digite 'F' para feminino e 'M' para masculino: ");
			sexo = leia.next().charAt(0);
			//sexo = leia.nextLine();
		}
		
		System.out.print("Parabéns!! Você digitou um valor válido!");
	}

}

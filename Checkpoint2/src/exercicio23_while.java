import java.util.Scanner;

public class exercicio23_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		char sexo, sexo2;
		//String sexo;
		
		// O progama est� aceitando todas as paravras que come�am com a letra "M" e "F" mai�scula
		
		System.out.print("Digite 'F' para feminino e 'M' para masculino: ");
		sexo = leia.next().charAt(0);
		
		sexo2 = sexo;
		//sexo = leia.nextLine();
		
		while( sexo2 != 'F' && sexo2 != 'M') {
			System.out.println("[ ERRO ] - O valor que voc� digitou � inv�lido. Por favor, digite um valor v�lido.");
			System.out.print("Digite 'F' para feminino e 'M' para masculino: ");
			sexo = leia.next().charAt(0);
			//sexo = leia.nextLine();
		}
		
		System.out.print("Parab�ns!! Voc� digitou um valor v�lido!");
	}

}

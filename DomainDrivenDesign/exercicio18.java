package DomainDrivenDesign;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0,00");
		
		double vf, vn, a, t;
		
		System.out.print("Digite a velocidade inicial: ");
		vn = leia.nextDouble();
		
		System.out.print("Digite a sua acelera��o: ");
		a = leia.nextDouble();
		
		System.out.print("Digite o tempo de viagem: ");
		t = leia.nextDouble();
		
		vf = vn + a * t;
		
		if(vf <= 40) 
			System.out.print("Ve�culo muito lento");
		
		else if(vf < 40 && vf <= 60) 
			System.out.print("Velocidade permitida");
		
		else if(vf < 60 && vf <= 80 ) 
			System.out.print("Velocidade de cruzeiro");
		
		else if(vf < 80 && vf <= 120) 
			System.out.print("Ve�culo r�pido");
		
		else if(vf > 120) 
			System.out.print("Ve�culo muito r�pido");
		else {
			System.out.print("Sua velocidade n�o est� na nossa tabela");
		}
	}

}

import java.util.Scanner;

public class exercicio24_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int contador = 0;
		System.out.println("[ TABUADA DO CINDO COM O DO WHILE ]");
		
		while( contador < 50  ) {
			contador += 5;
			System.out.println("------------------------------");
        	System.out.println( " 5 + " + contador + " = " + (contador + 5 ) );
        	System.out.println( " 5 - " + contador + " = " + (contador - 5 ) );
        	System.out.println( " 5 x " + contador + " = " + (contador * 5 ) );
        	System.out.println( " 5 / " + contador + " = " + (contador / 5 ) );
		}
				
		int c = 0;  
		
		System.out.println("[ TABUADA DO CINDO COM O DO WHILE ]");
		
        do {  
        	c += 5;  
        	System.out.println("------------------------------");
        	System.out.println( " 5 + " + c + " = " + (c + 5 ) );
        	System.out.println( " 5 - " + c + " = " + (c - 5 ) );
        	System.out.println( " 5 x " + c + " = " + (c * 5 ) );
        	System.out.println( " 5 / " + c + " = " + (c / 5 ) ); 
        } while( c < 50 );
        
        System.out.println("[ TABUADA DO CINDO COM O FOR ]");
        
        for( int i = 0; i < 50; i += 5 ) {
        	System.out.println("------------------------------");
        	System.out.println( " 5 + " + i + " = " + (i + 5 ) );
        	System.out.println( " 5 - " + i + " = " + (i - 5 ) );
        	System.out.println( " 5 x " + i + " = " + (i * 5 ) );
        	System.out.println( " 5 / " + i + " = " + (i / 5 ) );
        }
	}

}


public class exercicio28_while {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		
		for (int i = 0; i <= 30; i++) {
			
			   int n3 = n1 + n2;
	            n1 = n2;
	            n2 = n3;
	            System.out.println(n1);
	            System.out.println("-------");
			
		}
	}

}

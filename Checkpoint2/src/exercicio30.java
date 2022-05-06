
public class exercicio30 {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		int n3 = 1;
		int n4 = n3 + n2 + n1;
		
		for (int i = 0; i <= 20; i++) {
			
			int n5 = n4 + n3 + n2;
		    n3 = n4;
		    n2 = n3;
		    System.out.println(n5);
		}
	}

}

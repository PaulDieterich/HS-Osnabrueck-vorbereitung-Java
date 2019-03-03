package src.hsosnabrueck;

public class FibonacciFolge {
	

	public static void main(String[] args) {
		int x = 1; 
		int y = 0; 
		
		for(int i = 0; i < 50; i++) {
			System.out.println(y);
			y = x + (x = y);

		}
	}
}

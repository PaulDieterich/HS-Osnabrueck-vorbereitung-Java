package src.hsosnabrueck;

public class fooBar {

	public static void main(String[] args) {
	
		FooBar();
	}
	public static void FooBar() {
		for(int i = 1; i <= 30; i++) {
			if(i %3 == 0 && i % 5 == 0) {
				System.out.println("foobar");
			}else if( i %3 == 0) {
				System.out.println("foo");
			}else if( i % 5 == 0) {
				System.out.println("bar");
			}else {
				System.out.println(i);
			}
		}

	}
}



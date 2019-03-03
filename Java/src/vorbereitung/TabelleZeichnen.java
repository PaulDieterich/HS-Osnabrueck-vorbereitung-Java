package vorbereitung;

public class TabelleZeichnen {

	public static void main(String[] args) {
		
		int x = 5; // Eingelesene Zahl
		
		// Erste Zeile können wir außerhalb der Schleifen machen
		System.out.print("    "); // Platz schaffen
		for (int i = 1; i <= x; i++) {
			System.out.print(i + " ");
		}
				
		System.out.println(); // Zeilenumbruch

		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= x; j++) {
				if (i == 0 && j == 0) {
					System.out.print("    ");
				} else if (j == 0 && i != 0) {
					System.out.print(i + " | ");
				} else if (i == 0 && j != 0) {
					System.out.print("--");
				} else {
					System.out.print(i+j + " ");
				}
			}
			
			System.out.println(); // Zeilenumbruch
		}
	}

}

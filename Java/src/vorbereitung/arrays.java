package vorbereitung;

import java.util.List;
import java.util.List.*;

public class arrays {

	public static void main(String[] args) {
		array1D();
		array2D();
		
	
	
	}
	
	public static void array1D() {
		int[] array1D = new int[5];
		
		for(int i = 0; i < array1D.length ;i++){
			array1D[i] = i;
			System.out.println(array1D[i]);
			
		}
	}
	
	public static void array2D() {
		int[][] array2D = new int[5][5];
		for(int i = 0; i < array2D.length;i++) {
			for(int j = 0; j < array2D.length; j++) {
				array2D[i][j] = i;
				
					System.out.println(array2D[i][j]);
			
				
			}
		}
	}
	

}

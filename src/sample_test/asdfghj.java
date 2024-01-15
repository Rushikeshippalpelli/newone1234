package sample_test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class asdfghj {

	public static void main(String[] args) {
	
		
		int a [] = {8,0,5,0,6,8,0,4};
		
		Arrays.sort(a);
		
		System.out.print(Arrays.toString(a));
		
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] == 0) {
				count++;
			}
			

		}
		System.out.println(count);
		
		
		
		
		
		
		
		

	}

}

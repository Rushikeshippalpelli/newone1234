package sample_test;

import java.util.Arrays;

public class dfgh {

	public static void main(String[] args) {
		 int a [] = {8,9,7,6,5,4,3,2, 1,2,3,4,5,6};
		 
		 int n = a.length;
		 int j = n;
		 
		 int b [] = new int[n];
		 
		 for(int i=0; i<n; i++) {
			 b[j-1]=a[i];
			 j=j-1;
		 }
		 
		 System.out.print(b[n-2]);
	}
	


}

package sample_test;

import java.util.Arrays;
import java.util.Collections;

public class aSDFG {

	public static void main(String[] args) {
		
		
	String s = "hello world";
	
	String [] a = s.split(" ");
	
	//System.out.print(Arrays.toString(a));
	
	StringBuilder sb = new StringBuilder();
	
	for(int i=a.length-1; i>=0; i-- ) {
		sb.append(a[i]);
		if(i>0) {
			sb.append(" ");
		}
	}
	

	
	System.out.print(sb);
	
	

}}

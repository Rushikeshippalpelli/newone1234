package sample_test;

import java.io.InputStream;
import java.util.Scanner;

public class excode {
	
	
	public void removenumber(String S) {
		
      String str = S.replaceAll("[0-9]", "");
		
		System.out.println(str);
		
	}
	
	
	public void reverse(String S) {
	
		
		String rev = "";
		char ch;
		
		for (int i = 0; i<S.length();i++ ) {
			ch = S.charAt(i);
			rev= ch+rev;
		}
		System.out.println(rev);
	
	}
	
	public void palldrome(int ori) {
		
		int rev = 0;
		int temoroginal = ori ;
		
		
		
		
		while(temoroginal > 0) {
			int lastD = temoroginal%10;
			rev = rev*10 + lastD;
			temoroginal = temoroginal/10;
		}
		
		System.out.println(rev+" "+ ori);
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		excode ref = new excode();
		ref.removenumber("adsfgh1234567");
		ref.reverse("rushikesh");
		ref.palldrome(123);
	
	
	}
	
	
	
	
	

}

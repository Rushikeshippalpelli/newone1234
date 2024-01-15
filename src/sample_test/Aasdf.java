package sample_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aasdf {

	public static void main(String[] args) {
		
		Map<String , Object> u1 = new HashMap<String , Object>();
		
		
		u1.put("id", 1);
		u1.put("name", "cerulean");
		u1.put("year", 2000);
		u1.put("color", "#98B2D1");
	
		
		Map<String , Object> u2 = new HashMap<String , Object>();
		
		
		u2.put("id", 1);
		u2.put("name", "sdfgh");
		u2.put("year", 2000);
		u2.put("color", "#98B2D1");
		
		
		/*
		 * System.out.print(u1); System.out.print(u2);
		 */
		
		List< Map<String , Object> > li = new ArrayList< Map<String , Object> >();
		
		li.add(u1);
		li.add(u2);
		
		System.out.print(li.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
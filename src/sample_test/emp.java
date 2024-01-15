package sample_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class emp {

	private int id;
	private String name;

	public emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		List<emp> l1 = new ArrayList<emp>();
		
		emp a1 = new emp(1, "wersdth");
		emp a2 = new emp(2, "werty");
		emp a3 = new emp(3, "qaewtr");
		
		l1.add(a1);
		l1.add(a2);
		l1.add(a3);
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		
		for(emp ref:l1) {
			m1.put(ref.id, ref.name);
		}
		
		System.out.print(m1);
		
		
	}

}

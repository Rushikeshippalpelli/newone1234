package sample_test;

public class Dec11 {

	public static void main(String[] args) {

		String s = "5800690780980780";
		
		int count  = 0;
		
		String a = s.replaceAll("0", "");
		
		System.out.println(a);
		for (int i=0; i<s.length();i++ ) {
			char c = s.charAt(i);
			if(c =='0') {
				count++;
			}
		}
	
		System.out.println(count);
		
		StringBuilder x = new StringBuilder();
		
		x.append(a);
	
		
		for(int i=0; i<count;i++) {
			x.insert(i, '0');
		}
		
		System.out.println(x.toString());
	
	}
}

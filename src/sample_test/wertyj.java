package sample_test;

public class wertyj {

	public static void main(String[] args) {
		
		 int a [] = {8,9,7,6,5,4,3,2, 1,2,3,4,5,6};
		 
		 for(int i=0; i<a.length; i++) {
			 int count =1;
			 for(int j=i+1; j<a.length; j++) {
				 if(a[i]==a[j] && a[i]!= ' ' ) {
					 count++;
					 a[j]='0';
				 }
			 }
			 if(count>1 && a[i]!=0) {
				 
				 System.out.println(a[i]);
			 }
		 }
	}

}

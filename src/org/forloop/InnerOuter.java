package org.forloop;

public class InnerOuter {
	
	public static void main(String[] args) {
		//        1       2     3
		for (int i = 1; i <=3; i++) {
			//     a           b     d
			for (int j = i+1; j <= 3; j++) {
				//             c
				System.out.println(j);
				
			}
			
		}
		
	}

}

package com.syntax.class11;

public class task4 {

	public static void main(String[] args) {

		int[][] arr= {{10,10,10},{20,20,20},{30,30,30}};
        
		int sum=0;

		
		for(int j=0; j<arr.length;j++) {
			
			for(int i=0;i<arr[j].length; i++) {
				if(arr[j][i]%2==0) {
					System.out.println(arr[j][i]);
				}
			}
			
		}
		System.out.println(sum);
		
		
		
		
		
	}

}

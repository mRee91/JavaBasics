package com.syntax.class11;

public class task3 {

	public static void main(String[] args) {
		
		int[][] arr= {{10,10,10},{20,20,20},{30,30,30}};
         
		int sum=0;

		
		for(int j=0; j<arr.length;j++) {
			
			for(int i=0;i<arr[j].length; i++) {
				sum=sum+arr[j][i];
			}
			
		}
		System.out.println(sum);
		
		
	}

}

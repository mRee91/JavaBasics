package explore;

import java.util.Scanner;

public class MathPow {

	public static void main(String[] args) {


		Scanner inp=new Scanner (System.in);

		int num=2;
		int p = 1;
		int ans=0;

		while(ans<(int)Math.pow(num,20 )) {
			ans= (int) Math.pow(num,p++);
			System.out.println(p+" "+ans);    }
		
		
		

}}

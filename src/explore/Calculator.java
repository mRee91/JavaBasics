package explore;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		
		Scanner inp = new Scanner(System.in);

		System.out.println("Calculator");

		double num1 = inp.nextDouble();
		char math = inp.next().charAt(0);
		double num2 = inp.nextDouble();

		double ans = 0;
		String o="null";

	//	if (math=='/') {ans = (num1 / num2);}
	//	if (math=='*') {ans = (num1 * num2);}
	//	if (math=='+') {ans = (num1 + num2);}
	//	if (math=='-') {ans = (num1 - num2);}
		
		switch(math) {	//////////////////////////////////////////////////////////////////////////////////////
		case '/' : ans = (num1 / num2);break;
		case '*' : ans = (num1 * num2);break;
		case '+' : ans = (num1 + num2);break;
		case '-' : ans = (num1 - num2);break;
		default: System.out.println("Invalid Operator");
		o="invalid"; }/////////////////////////////////////////////////////////////

		if(ans!=0 || o.equals("null") )System.out.println(ans);  // null is changed on default-invalid 






	}

}

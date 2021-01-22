package com.cybage;
import java.util.Scanner;

public class UI {
	public static void main(String args[]) {
		System.out.println("Welcome ");	
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		
		
		try {
			int div=n1/n2;
			System.out.println("Division is:"+div);		
		}catch(ArithmeticException ae) {
			
			System.err.println("not able to divide");		//end user
			System.err.println(ae.getMessage()); //developer
			ae.printStackTrace();
		}finally {
			System.out.println("this block executed irrespective of exception");
			System.out.println("generally useful for resource management");
			scanner.close();
		}
		
		//System.in-->standard input, keyboard
		//System.out-->standard output, monitor
		//System.err--> standard error, monitor
		
		System.out.println("Program Completed");
	}

}

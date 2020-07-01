package assignment;

import java.util.InputMismatchException;

/*Problem 1 - Java Loops
 
Given an integer, N , print its first  i multiples. Each multiple  should be printed on a new line in the form:
	 N x i = result*/


import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		int n = 0;
		
		while(true){
		Scanner ac = new Scanner(System.in);
		
		System.out.println ("enter a value between 0 and 100:");
		
		try {
		n= ac.nextInt();
		if (0<n && n<100) {
			for (int i=1;i<=10;i++) {
				System.out.println(n+"*"+i+"="+i*n);
			}
		}
		else {
			System.out.println("the given number is not between 0 and 100");
			}
		}
		catch (InputMismatchException e) {
			System.out.println(e+"input value is not an integer");
			
		}
		
	}
		
	}
	
}



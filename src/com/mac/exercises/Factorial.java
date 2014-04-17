package com.mac.exercises;


import java.util.Scanner;

public class Factorial {

	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		scanner = new Scanner(System.in);
		String numString=scanner.next();
		if(numString!=null)
			System.out.format("Factorial is %s.",getFactorial(Integer.parseInt(numString)));
	}
	
	public static int getFactorial(int i){
		if(i==1){
			return 1;
		}
		return i*getFactorial(i-1);
	}
}

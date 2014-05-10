package com.mac.exercises;


public class Fibonacci {

	public static void main(String[] args) {
		fibIteration(0);
		fibIteration(1);
		fibIteration(2);
		fibIteration(3);
		fibIteration(4);
		fibIteration(5);
		//System.out.println(fibRecursion(6));
	}

	
	public static void fibIteration(int n){
		int prev1=1, prev2=1, fn=0;
		
		for(int i=0; i<n; i++){
			fn=prev1+prev2;
			prev1=prev2;
			prev2=fn;
		}
		
		System.out.println(fn);
	}
	
	
	//1 1 2 3 5 8 13 21 34 55 89 144
	public static int fibRecursion(int n){
	    if(n<2)
	      return n;
	    else
	      return fibRecursion(n-1) + fibRecursion(n-2);
	}
}

package com.bridgelabz.reverse;


public class ReverseArray {
	//Java program for reversing elements of an Array
	public static void main(String[] args) {
		int[] temp = new int[] {10,20,30,40,50};
		System.out.println("Original Array");
		for(int i=0;i<temp.length;i++) {
			
			System.out.println(temp[i]+"");
			
			System.out.print("");
		}
		System.out.println("Reverse Array");
		for(int i= temp.length-1;i>=0;i--) {
			
			System.out.println(temp[i]+"");
			
		}
		
	}
	
}

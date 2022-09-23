package com.assignment7;
import java.util.Scanner;
public class Cube {
	public static int getNumbercube(int num) {
		int result=num*num*num;
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number...");
		int a=scanner.nextInt();
		System.out.println("The cube of number is...."+getNumbercube(a));
		
		
	}
	

}
 
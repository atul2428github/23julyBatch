package com.assignment7;
import java.util.Scanner;
public class Reverse {
	public static int getRverseNumber(int no) {	
		int reverse=0;
	   while(no!=0) {
			reverse=reverse*10;
			reverse=reverse+no%10;
			no=no/10;
		}
		return reverse;
	
			
		}
	public static void main (String [] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number ...");
		int no=scanner.nextInt();
		int renumber=getRverseNumber(no);
		System.out.println("The reverse number is  "+renumber);
	
		
	}
	}



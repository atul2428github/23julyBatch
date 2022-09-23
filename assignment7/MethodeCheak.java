package com.assignment7;
                                                                
import java.util.Scanner;

public class MethodeCheak {
        public static void chek(int ch) {
        	if (ch>=65 && ch<=90) {
        		System.out.println("it is a capital letter alphabet");
        	}else if(ch>=97 && ch<=122) {
        		System.out.println("it is a small lettter apfhabet");
        	}else if(ch>=48&&ch<=57) {
        		System.out.println("it is a number");
        	}else if (ch>=33 && ch<=47) {
        		System.out.println("it is a spasial simbol");
        	}else 
        		System.out.println("it is incorrect");
        	
        	
        }
        public static void main(String[] args) {
        	Scanner scanner=new Scanner(System.in);
        	System.out.println("Enter the charactor");
        	int a=scanner.next().charAt(0);
        	chek(a);
        	//ASSCII CODE 
        	//CAPITAL LETTER=65 TO 90
        	//SMALL LETTER=    97 TO 122
        	//NUMBER       ==   48 TO 57
        	// SPECIAL ==      32-47  58-64 91-96 123-126
        	
        	
        }
}

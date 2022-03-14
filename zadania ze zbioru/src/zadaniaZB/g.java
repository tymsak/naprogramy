package zadaniaZB;

import java.util.Scanner;

public class g {
	
	
	 public static void main (String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("podaj wartoœc a");
			 int a= sc.nextInt();
			 System.out.println("podaj wartoœc b");
			 int b= sc.nextInt();
			 System.out.println("podaj wartoœc c");
			  int c= sc.nextInt();
		 
		 if (a > b || a > c || b > c) {
			 System.out.println(c);
			 System.out.println(b);
			 System.out.println(a);
		 
		 } else if (b > a || b > c || a > c) {
		 System.out.println(c);
		 System.out.println(a);
		 System.out.println(b);
		 } else if (c > a || c > b || b > a) {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 } else if (b > a || b > c || c > a) {
			 System.out.println(a);
		 System.out.println(c);
		 System.out.println(b);
		 } else if (c > a || c > b || a > b) {
			 System.out.println(c);
			 System.out.println(a);
			 System.out.println(b);
	 }
	 }
	 }
g
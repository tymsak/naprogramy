package tak;

import java.util.Scanner;

public class warunkowe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj  a");	
		int a =  sc.nextInt();
		System.out.println("podaj  b");
		int b = sc.nextInt();
		System.out.println("podaj c");
		int c =  sc.nextInt();
		if (a>b && b>c) {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		} else if (c>b && b>a) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);	
		} else if (b>a && a>c) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		} else if (a>c && c>b) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
			
		} else if (b>c && c>a) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
			
		}else if (c>a && a>b) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		sc.close();
}
}

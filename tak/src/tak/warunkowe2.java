package tak;

import java.util.Scanner;

public class warunkowe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj  a");	
		double a =  sc.nextDouble();
		System.out.println("podaj  b");
		double b = sc.nextDouble();
		if (a==b) {
			System.out.println("obie wartosci sa rowne");
		} else if (a!=b) {
			System.out.println("obie wartosci nie sa sobie rowne");
		}
		sc.close();
}
}

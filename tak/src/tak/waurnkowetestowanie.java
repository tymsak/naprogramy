package tak;

import java.util.Scanner;

public class waurnkowetestowanie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj bok a");	
		double a =  sc.nextDouble();
		System.out.println("podaj bok b");
		double b = sc.nextDouble();
		System.out.println("podaj bok c");
		double c = sc.nextDouble();
		if (a+b>c && b+c>a && a+c>b) { /// || b+c>a || a+c>b
		System.out.print("obwod trojkata wynosi:");
		System.out.print(a+b+c);
	
		}  else {
			System.out.println("nie istnieje taki trojkat");
		}
		sc.close();
	}
}

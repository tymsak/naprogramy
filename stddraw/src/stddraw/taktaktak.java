package stddraw;

import java.util.Scanner;

public class taktaktak {
	

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj dlugosc boku");
		double a = sc.nextDouble();
		StdDraw.show();
		StdDraw.square(0.1, 0.1, a);
		sc.close();
}
}
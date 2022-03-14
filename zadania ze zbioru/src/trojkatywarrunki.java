import java.util.Scanner;
public class trojkatywarrunki {

	

	static Scanner sc = new Scanner(System.in);
	static double a= sc.nextDouble();
	static double b= sc.nextDouble();
	static double c= sc.nextDouble();

	public static void main (String[] args) {
		System.out.println("podaj boki a,b i c");
	if(a+b>c || a+c>b || c+b>a );
	System.out.println(a+b+c);
	} else {
	
	System.out.println("nie spe³niono warunku powstawania trójkata");
	}
}



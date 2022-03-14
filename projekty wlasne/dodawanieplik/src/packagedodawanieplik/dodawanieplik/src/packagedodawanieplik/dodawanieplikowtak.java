package packagedodawanieplik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dodawanieplikowtak {
	public static void main (String[] args) throws FileNotFoundException{
		File plik = new File("tak.txt");
		Scanner sc = new Scanner(plik);
		int suma = 0;
				int liczba;
		while(sc.hasNextInt()) {
			liczba=sc.nextInt();
			suma=suma+liczba;
		}
		System.out.println(suma);
		}
	
}

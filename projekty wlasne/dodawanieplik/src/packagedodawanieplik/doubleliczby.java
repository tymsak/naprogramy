package packagedodawanieplik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class doubleliczby {
	
		
		
		public static void main (String[] args) throws FileNotFoundException {
			File plik = new File("double.txt");
			Scanner sc = new Scanner(plik);
			double suma = 0;
			double liczba;
			while(sc.hasNextDouble()) {
				liczba=sc.nextDouble();
				suma=suma+liczba;
				System.out.println(suma);
			}
			
	}
}
///System.out.println(sc.nextDouble());
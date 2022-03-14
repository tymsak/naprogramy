package packagedodawanieplik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dodawaniesrednia {

	
	public static void main (String[] args) throws FileNotFoundException {
		File plik = new File("srednia.txt");
		Scanner sc = new Scanner(plik);
		double srednia = 0;
		double ocena;
while(sc.hasNextDouble()) {
	ocena=sc.nextDouble();
	srednia=(srednia+ocena);
	
}
System.out.println(srednia/7);		
}
}
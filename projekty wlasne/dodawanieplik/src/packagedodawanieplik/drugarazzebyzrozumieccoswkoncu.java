package packagedodawanieplik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class drugarazzebyzrozumieccoswkoncu {

	public static void main (String[] args) throws FileNotFoundException{
		File plik = new File("tak.txt");
		Scanner sc = new Scanner(plik);
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt());
		}
		
		}
}

package packagedodawanieplik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class listazakupowsuma {

		public static void main (String[] args) throws FileNotFoundException{
			File plik = new File("listazakupow.txt");
			Scanner sc = new Scanner(plik);
			
			int ilosc;
			String przedmiot;
			double cena;
			double suma = 0;
			
			while(sc.hasNextLine())
			{
			
			
			przedmiot = sc.next();
			ilosc = sc.nextInt();
			cena = sc.nextDouble();
			suma = suma + cena*ilosc;
			System.out.println(przedmiot);
			
			}
			
		System.out.println("laczna cena wszystkich produktow wynosi:" + suma/100+"zl");
	}
}
			
			
			
			
			


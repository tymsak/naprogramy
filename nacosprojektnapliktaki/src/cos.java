	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class cos {
		public static void main (String[] args) throws FileNotFoundException{
			File plik = new File("imie.txt");
			Scanner sc = new Scanner(plik);
			System.out.println(sc.next());
			sc.close();
	}
	}

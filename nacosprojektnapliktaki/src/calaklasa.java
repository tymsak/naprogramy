import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class calaklasa {
	public static void main (String[] args) throws FileNotFoundException {
	
	File plik = new File("abcd.txt");
	Scanner sc = new Scanner(plik);
	while(sc.hasNext()) {
		
		System.out.println(sc.next());
	
}
}
}

import java.util.Scanner;

public class abcd {

	static Scanner sc = new Scanner(System.in); 
	int length(String s) {
		return s.length(); }
		
		public static void main (String [] args) {
			abcd licz = new abcd();
			
			System.out.println("Wpisz poni¿ej dowolny tekst:");
			String s = sc.next();
			System.out.println("Poni¿ej pokazuje siê iloœæ znaków w tym wyrazie:");
			System.out.println("d³ugoœæ:"+licz.length(s));

}
}
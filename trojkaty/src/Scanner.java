
public class Scanner {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void main (String[] args) {
		System.out.println("podaj rok");
		
		while(sc.hasNextInt())	
	int rok =  sc.nextInt();
	
	System.out.println(rok*rok)
}
}
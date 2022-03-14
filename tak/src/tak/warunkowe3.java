package tak;

import java.util.Scanner;

public class warunkowe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj dzien");	
		int d =  sc.nextInt();
		System.out.println("podaj miesiac");
int m = sc.nextInt();

if ( m==3 && d<=20 || m==4 && d<=30 || m==5 && d<=31 || m==6 && d<21) { 
	System.out.println("pora roku to wiosna");
} else if (m==6 && d<=30 && 21<=d || m==7 && d<=31 || m==8 && d<=31 || m==9 && d<22) {
	System.out.println("pora roku to lato");
} else if (m==9 && 22<=d && d<=30 || m==10 && d<=31 || m==11 && d<=30 || m==12 && d<22) {
	System.out.println("pora roku to jesien");
} else if (m==12 && d<=22 && d<=31 ||m==1 && d<=31 || m==2 && d<=29 || m==3 && d<20) {
	System.out.println("pora roku to zima");
}
	sc.close();
	}
}

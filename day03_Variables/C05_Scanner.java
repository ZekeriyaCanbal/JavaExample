package day03_Variables;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
	System.out.println("Ad�n�z� Giriniz :");
	String isim=scan.nextLine();

	System.out.println("Soyad�n�z� Giriniz :");
	String soyismi=scan.nextLine();

	System.out.println("Girmi� oldu�unuz Ad Soyad : "+isim +" "+soyismi) ;

	}

}

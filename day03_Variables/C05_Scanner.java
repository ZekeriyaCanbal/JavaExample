package day03_Variables;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
	System.out.println("Adýnýzý Giriniz :");
	String isim=scan.nextLine();

	System.out.println("Soyadýnýzý Giriniz :");
	String soyismi=scan.nextLine();

	System.out.println("Girmiþ olduðunuz Ad Soyad : "+isim +" "+soyismi) ;

	}

}

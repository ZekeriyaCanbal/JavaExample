package day03_Variables;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ad�n�z� Giriniz : ");
		String ad=scan.next();
		System.out.println("Soyad�n�z giriniz : ");
		String soyadi=scan.next();
		System.out.println("Girdi�iniz Bilgiler : "+ad+" "+soyadi);
		
		
	
	}

}

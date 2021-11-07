package day13_stringManipulations;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen cümle giriniz");
		String cumle=scan.nextLine();
		
		System.out.println("Kontrol edilecek kelimeyi giriniz");
		String kelime=scan.next();
		
		System.out.println("-Baþladýðýný kontrol için +\n-Bittiðini kontrol için - yazýnýz");
		char islem=scan.next().charAt(0);
		
		
		if (islem=='+') {
			if (cumle.startsWith(kelime)) {
				System.out.println("Baþlýyor");
				
			} else {
				System.out.println("Baþlamýyor");
			}
		
		}else {
		
		if (cumle.endsWith(kelime)) {
			System.out.println("Baþlýyor");
			
		} else {
			System.out.println("Baþlamýyor");
		}
		}	
		
		scan.close();
	}

}

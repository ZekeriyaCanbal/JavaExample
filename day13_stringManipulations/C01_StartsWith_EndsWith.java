package day13_stringManipulations;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen c�mle giriniz");
		String cumle=scan.nextLine();
		
		System.out.println("Kontrol edilecek kelimeyi giriniz");
		String kelime=scan.next();
		
		System.out.println("-Ba�lad���n� kontrol i�in +\n-Bitti�ini kontrol i�in - yaz�n�z");
		char islem=scan.next().charAt(0);
		
		
		if (islem=='+') {
			if (cumle.startsWith(kelime)) {
				System.out.println("Ba�l�yor");
				
			} else {
				System.out.println("Ba�lam�yor");
			}
		
		}else {
		
		if (cumle.endsWith(kelime)) {
			System.out.println("Ba�l�yor");
			
		} else {
			System.out.println("Ba�lam�yor");
		}
		}	
		
		scan.close();
	}

}

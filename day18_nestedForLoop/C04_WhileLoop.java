package day18_nestedForLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		
		// Kullan�c�dan toplanmak �zere sayi isteyin 
		// Kullan�c� s�f�ra bas�ncaya kadar say�lar� al�p
		// toplamaya devam edin
		// kullanc� s�f�ra bast���nda 
		// o ana kadar ka� say� girdi�ini ve girilen say�lar�n toplam�n� yaz�n

		Scanner scan=new Scanner(System.in);
			
			int sayi=100;
			int toplam=0;
			int sayac=0;
			
			while (sayi!=0) {
				System.out.println("Say� giriniz \nsonland�rmak i�in s�f�ra bas�n");
				sayi=scan.nextInt();
				toplam+=sayi;
				sayac++;
			}
			
			System.out.println("Toplam "+(sayac-1)+" adet say� girdiniz ve toplamlar� :"+toplam);
	
			scan.close();
	}

}

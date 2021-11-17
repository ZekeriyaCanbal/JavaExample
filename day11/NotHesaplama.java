package day11;

import java.util.Scanner;

public class NotHesaplama {

	public static void main(String[] args) {
	  		
		Scanner scan=new Scanner(System.in);				// 1. Madde
		
		System.out.println("Vize Sýnav Notunuzu Giriniz");	// 2. Madde 
		double vize_notu=scan.nextDouble();					// 2. Madde

		System.out.println("Vize Sýnav Yüzdesini Giriniz");	// 3. Madde
		double vize_yuzdesi=scan.nextDouble();				// 3. Madde

		System.out.println("Final Sýnav Notunuzu Giriniz");	// 4. Madde
		double final_notu=scan.nextDouble();				// 5. Madde

		System.out.println("Final Sýnav Yüzdesini Giriniz");// 6. Madde
		double final_yuzdesi=scan.nextDouble();				// 6. Madde

		double sonuc=((vize_notu*(vize_yuzdesi/100))+(final_notu*(final_yuzdesi/100))); //7. madde
		
		// 8. Madde Baþlangýcý
		if ((vize_notu<0) || (vize_notu>100)||(final_notu<0) || (final_notu>100)) {	
			System.out.println("Lütfen Notlarýnýzý 0 ile 100 arasýnda giriniz");
		}else if (sonuc>=90) {
			System.out.println("Geçme Notunuz : AA");
		}else if (sonuc>=80) {
			System.out.println("Geçme Notunuz : BA");
		}else if (sonuc>=70) {
			System.out.println("Geçme Notunuz : BB");
		}else if (sonuc>=60) {
			System.out.println("Geçme Notunuz : CB");
		}else if (sonuc>=50) {
			System.out.println("Geçme Notunuz : CC");
		}else if (sonuc>=40) {
			System.out.println("Geçme Notunuz : DC");
		}else if (sonuc>=30) {
			System.out.println("Geçme Notunuz : DD");
		}else {
			System.out.println("Geçme Notunuz : FF");
		}
		System.out.println("ortalama : "+sonuc);
		// 8. Madde Sonu
		
		scan.close();
	}

}

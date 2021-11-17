package day11;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan=new Scanner(System.in);	
		
		System.out.println("Birinci Sayýyý Giriniz");	 
		double sayi1=scan.nextDouble();					

		System.out.println("Ýkinci Sayýyý Giriniz");
		double sayi2=scan.nextDouble();	

		System.out.println("Yapýlacak Ýþlem \nToplama ise + \nÇýkarma ise - \nÇarpma ise * \nBölme ise / giriniz");
		
		char islem=scan.next().charAt(0);
				
		if (islem=='+') {
			System.out.println("Seçilen iþlem : Toplama");
			System.out.println("Sonuç : "+(sayi1+sayi2));
			
		}else if (islem=='-') {
			System.out.println("Seçilen iþlem : Çýkarma");
			System.out.println("Sonuç : "+(sayi1-sayi2));
		}else if (islem=='*') {
			System.out.println("Seçilen iþlem : Çarpma");
			System.out.println("Sonuç : "+(sayi1*sayi2));
		}else if (islem=='/') {
			System.out.println("Seçilen iþlem : Bölme");
			System.out.println("Sonuç : "+(sayi1/sayi2));
		}else {
			System.out.println("Üzgünüm Bir Ýþlem Seçmediniz");
		}
		
	scan.close();	
	}

}

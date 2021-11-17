package day14;

import java.util.Scanner;

public class C02_cozum {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin
        // sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
        // kullaniciya us sorun
        // 2 yazarsa kareleri toplamini yapan method,
		// 3 yazarsa kupler toplamini yapan method calissi
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen iki sayi girin \nÝlk Sayýdan sonra ENTER'a basýn");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("n²+n² Toplamý için 2"
				+ " \nn³+n³ Toplamý için 3");

		int sec=scan.nextInt();
		
		switch (sec) {
		
		case 2:
			kareleriniTopla(sayi1,sayi2);
			break;
		
		case 3:
			kupleriniTopla(sayi1,sayi2);
			break;
		
		default :
			System.out.println("Lütfen istenilen tercihten birini giriniz");
			
		}
		
		scan.close();
		
		
	}

	public static void kupleriniTopla(double dsayi1, double dsayi2) {
		System.out.println(dsayi1+" x "+dsayi2+" küplerin toplamý : "+ ((dsayi1*dsayi1*dsayi1)+(dsayi2*dsayi2*dsayi2)));
		
	}

	public static void kareleriniTopla(double dsayi1, double dsayi2) {
		System.out.println(dsayi1+" x "+dsayi2+" karelerinin toplamý : "+ ((dsayi1*dsayi1)+(dsayi2*dsayi2)));
		
	}
}

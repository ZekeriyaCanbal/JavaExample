package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
		// Kullanici 2,3 veya 4 degerini girerse, 
		// kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
		// Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse
		// “Cok sayi girdiniz, ben toplayamam” yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Kaç sayý ile iþlem yapýlacaksa girin"
				+ "\n(2-3-4 sayýdan birini seçin");
		int sayiAdeti=scan.nextInt();

		if (sayiAdeti>4 && sayiAdeti<2) {
			//sayiAdeti=5;
		}
		
		switch (sayiAdeti) {
		case 2:
			ikiSayiTopla();
			break;
		case 3:
			ucSayiTopla();
			break;
		case 4:
			dortSayiTopla();
			break;
			default:
			System.out.println("Geçersiz tercih");
			
			scan.close();
		}
	}

	private static void dortSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Birinci Sayýyý Giriniz : ");
		int sayi1=scan.nextInt();
		System.out.println("Ýkinci Sayýyý Giriniz : ");
		int sayi2=scan.nextInt();
		System.out.println("Üçüncü Sayýyý Giriniz : ");
		int sayi3=scan.nextInt();
		System.out.println("Dördüncü Sayýyý Giriniz : ");
		int sayi4=scan.nextInt();
		
		System.out.println("dört sayýnýn toplamý : "+(sayi1+sayi2+sayi3+sayi4));
		scan.close();
	
	}

	public static void ucSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Birinci Sayýyý Giriniz : ");
		int sayi1=scan.nextInt();
		System.out.println("Ýkinci Sayýyý Giriniz : ");
		int sayi2=scan.nextInt();
		System.out.println("Üçüncü Sayýyý Giriniz : ");
		int sayi3=scan.nextInt();
		
		System.out.println("Üç sayýnýn toplamý : "+(sayi1+sayi2+sayi3));
		scan.close();
		
	}

	public static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Birinci Sayýyý Giriniz : ");
		int sayi1=scan.nextInt();
		System.out.println("Ýkinci Sayýyý Giriniz : ");
		int sayi2=scan.nextInt();
		System.out.println("Ýki sayýnýn toplamý : "+(sayi1+sayi2));
		scan.close();
	}

}

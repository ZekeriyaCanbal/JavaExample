package day03_Variables;

import java.util.Scanner;

public class Soru_Cevaplari1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Lütfen iþlem yapýlacak 1. ve 2. sayýlarý giriniz : ");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int toplam;
		int fark;
		int carpim;
		
		toplam=sayi1+sayi2;
		fark=sayi1-sayi2;
		carpim=sayi1*sayi2;
				
	System.out.println("Girilen iki Sayýnýn iþlem Sonuçlarý");
	System.out.println("Toplamý : "+toplam);
	System.out.println("Farký : "+fark);
	System.out.println("Çarpýmý : "+carpim);
	
	}

}

package day03_Variables;

import java.util.Scanner;

public class Soru_Cevaplari1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("L�tfen i�lem yap�lacak 1. ve 2. say�lar� giriniz : ");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int toplam;
		int fark;
		int carpim;
		
		toplam=sayi1+sayi2;
		fark=sayi1-sayi2;
		carpim=sayi1*sayi2;
				
	System.out.println("Girilen iki Say�n�n i�lem Sonu�lar�");
	System.out.println("Toplam� : "+toplam);
	System.out.println("Fark� : "+fark);
	System.out.println("�arp�m� : "+carpim);
	
	}

}

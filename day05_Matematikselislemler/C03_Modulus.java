package day05_Matematikselislemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {

		//Kullanýcýdan 3 basamaklý bir sayý girmasini isteyelim.
		// Rkamlar toplamýný yazdýran program kullanalým
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen 3 Basamaklý bir sayý Giriniz");
		int sayi=scan.nextInt();
		int rakamToplami=0;
		int rakam=0;
		
		rakam=sayi%10;  // modulus ile kalaný bulduk
		
		System.out.println(rakam);
		rakamToplami+=rakam;
		System.out.println("Rakam Toplami : "+rakamToplami);

		sayi=sayi/10; // sayý 57 olur.

		rakam=sayi%10;

		System.out.println(rakam);
		rakamToplami+=rakam;
		System.out.println("Rakam Toplami : "+rakamToplami);

		sayi=sayi/10; // sayý 5 olur.
		System.out.println(rakam);
		rakamToplami+=rakam;
		System.out.println("Rakam Toplami : "+rakamToplami);
	
		
	}

}

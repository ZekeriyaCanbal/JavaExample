package day05_Matematikselislemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {

		//Kullan�c�dan 3 basamakl� bir say� girmasini isteyelim.
		// Rkamlar toplam�n� yazd�ran program kullanal�m
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("L�tfen 3 Basamakl� bir say� Giriniz");
		int sayi=scan.nextInt();
		int rakamToplami=0;
		int rakam=0;
		
		rakam=sayi%10;  // modulus ile kalan� bulduk
		
		System.out.println(rakam);
		rakamToplami+=rakam;
		System.out.println("Rakam Toplami : "+rakamToplami);

		sayi=sayi/10; // say� 57 olur.

		rakam=sayi%10;

		System.out.println(rakam);
		rakamToplami+=rakam;
		System.out.println("Rakam Toplami : "+rakamToplami);

		sayi=sayi/10; // say� 5 olur.
		System.out.println(rakam);
		rakamToplami+=rakam;
		System.out.println("Rakam Toplami : "+rakamToplami);
	
		
	}

}

package day05_Matematikselislemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 4 Basamaklý Bir Sayý Giriniz");
		int sayi=scan.nextInt();
		
		int rakamToplami=0;
		int rakam=0;
		
		System.out.println("Sayi : "+sayi);
		rakam=sayi%10;
		System.out.println("Rakam : "+rakam);
		rakamToplami+=rakam;
		System.out.println("Rakam Toplamý : "+rakamToplami);

		sayi/=10;
		System.out.println("Sayý : "+sayi);
		rakam=sayi%10;
		System.out.println("Rakam : "+rakam);
		rakamToplami+=rakam;
		System.out.println("Rakam Toplamý : "+rakamToplami);

		sayi/=10;
		System.out.println("Sayý : "+sayi);
		rakam=sayi%10;
		System.out.println("Rakam : "+rakam);
		rakamToplami+=rakam;
		System.out.println("Rakam Toplamý : "+rakamToplami);

		sayi/=10;
		System.out.println("Sayý : "+sayi);
		rakam=sayi%10;
		System.out.println("Rakam : "+rakam);
		rakamToplami+=rakam;
		System.out.println("Rakam Toplamý : "+rakamToplami);
		
	}

}



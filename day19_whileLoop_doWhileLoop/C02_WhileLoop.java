package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin ve 
		// bu sayinin rakamlari toplamini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Say� giriniz");
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=0;
		/*
		while(sayi>0) {
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;	
		}
		System.out.println("Rakamlar toplam� : "+rakamlarToplami);
		*/
		
		//for loop ile yap�l���
		
		rakamlarToplami=0;
		String sayiStr=""+sayi;
		
		for (int i = 0; i < sayiStr.length(); i++) {
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;	
		}
		System.out.println("Rakamlar toplam� : "+rakamlarToplami);
		scan.close();
	}

}

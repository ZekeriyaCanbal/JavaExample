package day14;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
// verilen iki sayinin toplamini ve carpimini yapip yazdiran iki ayri method olusturun
        
        // method olusturmak icin 4 adim takip edelim
        // 1. adim method call yazalim
        // 2. adim method'a arguman yazacak miyiz karar vermeliyiz
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen 1. Sayýyý Giriniz");
		int sayi1=scan.nextInt();
		
		System.out.println("Lütfen 2. Sayýyý Giriniz");
		int sayi2=scan.nextInt();
		
		carpma(sayi1,sayi2);
		toplama (sayi1,sayi2);
	
	
		scan.close();
	}

	private static void toplama(int sayi1, int sayi2) {
		System.out.println("Sayi1+Sayi2 : " + (sayi1 + sayi2));		
	}

	private static void carpma(int sayi1, int sayi2) {
		System.out.println("Sayi1*Sayi2 : " + (sayi1 * sayi2));	
		
	}

}

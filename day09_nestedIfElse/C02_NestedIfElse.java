package day09_nestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen 4 basamakl� bir say� Giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi>999 && sayi<10000) { // D�rt basamakl� olup olmad���n� kontrol ediyor.
			
			if(sayi%5==0) { // say�n�n 5'e b�l�n�p b�l�nmedi�ini kontrol ediyor
				
				if(sayi%10==0) {	//say�n�n tek mi �ift mi kontrol ediyor.
				
					System.out.println("Girilen say� 5'e b�l�nen �ift say�d�r");
				}else {
					
					System.out.println("Girilen say� 5'e b�l�nen Tek Say�d�r");
				}
				
			}else {
				System.out.println("Tekrar Deneyiniz");
			}
			
			
			
			
		} else {
			System.out.println("Girilen say� 4 basamakl� de�ildir.");
		}
		
		scan.close();

	}

}

package day09_nestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 4 basamaklı bir sayı Giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi>999 && sayi<10000) { // Dört basamaklı olup olmadığını kontrol ediyor.
			
			if(sayi%5==0) { // sayının 5'e bölünüp bölünmediğini kontrol ediyor
				
				if(sayi%10==0) {	//sayının tek mi çift mi kontrol ediyor.
				
					System.out.println("Girilen sayı 5'e bölünen Çift sayıdır");
				}else {
					
					System.out.println("Girilen sayı 5'e bölünen Tek Sayıdır");
				}
				
			}else {
				System.out.println("Tekrar Deneyiniz");
			}
			
			
			
			
		} else {
			System.out.println("Girilen sayı 4 basamaklı değildir.");
		}
		
		scan.close();

	}

}

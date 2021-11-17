package day07_IfStatements;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {
		 // Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen Bir sayý giriniz");
		
		int sayi=scan.nextInt();
		
		if(sayi%2==0) {
			System.out.println(sayi + " sayýsý ÇÝFT sayýdýr");
		}

		if(sayi%2==1) {
			System.out.println(sayi+ " sayýsý TEK sayýdýýr");
		}
				
	}

}

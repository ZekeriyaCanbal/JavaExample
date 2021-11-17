package day07_IfStatements;

import java.util.Scanner;

public class C03_BasitifCumleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin 
            Ornek:      gun=Pazar output = “Hafta sonu”
                        gun=Sali output = “Hafta ici”
         *** String icin equals method’unu kullanin
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Bir gün ismin giriniz");
		String gun=scan.next().toLowerCase();
		
		if(gun.equals("pazartesi") || gun.equals("salý") || gun.equals("çarþamba") || gun.equals("perþembe") || gun.equals("cuma") ) {
			System.out.println("Hafta içi bir gündür");
		}
		
		if(gun.equals("pazar") || gun.equals("cumartesi")) {
			System.out.println("Hafta sonu");
		}
	}

}

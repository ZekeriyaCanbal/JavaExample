package day07_IfStatements;

import java.util.Scanner;

public class C03_BasitifCumleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin 
            Ornek:      gun=Pazar output = �Hafta sonu�
                        gun=Sali output = �Hafta ici�
         *** String icin equals method�unu kullanin
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen Bir g�n ismin giriniz");
		String gun=scan.next().toLowerCase();
		
		if(gun.equals("pazartesi") || gun.equals("sal�") || gun.equals("�ar�amba") || gun.equals("per�embe") || gun.equals("cuma") ) {
			System.out.println("Hafta i�i bir g�nd�r");
		}
		
		if(gun.equals("pazar") || gun.equals("cumartesi")) {
			System.out.println("Hafta sonu");
		}
	}

}

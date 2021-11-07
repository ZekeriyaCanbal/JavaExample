package day13_stringManipulations;

import java.util.Scanner;

public class C06_SifreSorusu {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
		// isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234

		Scanner scan=new Scanner(System.in);
		
		System.out.print("�sminizi Giriniz :");
		String isim=scan.next();

		System.out.print("Soyad�n�z Giriniz : ");
		String soyisim=scan.next();
	
		System.out.print("Kredi Kart Numaras�n�z Giriniz : ");
		String kart=scan.next();
		
		if (kart.length()<16){
		
			System.out.println("L�tfen 16 haneli kredi kart� numaran�z�  giriniz");
		} else if (kart.substring(0,1).equals("0")){
			System.out.println("kredi kart� numaran�z s�f�r ile ba�layamaz.");
		} else {
						
		String formatliisim = isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
		String formatlisoyad = soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
		String formatlikart="**** **** **** "+kart.substring(12,16);
		
		System.out.println("G�R�LEN DE�ERLER �LE �LG�L� SONU�");
		System.out.println("isim-soyisim : "+formatliisim+" "+formatlisoyad);
		System.out.println("kart no : "+formatlikart);
		}		
		
		scan.close();
		
	}

}

package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ýsim Giriniz");
		String isim=scan.next();
		
		System.out.println("Soyad Giriniz");
		String soyad=scan.next();

		System.out.println("Ýsiminiz nasýl yazýlsýn"
				+ "Eðer Açýk ise 1"
				+ "Gizli Yazýlsýn ise 2");
		int secim=scan.nextInt();
		
		String birlesikIsim=null;
		
		if (secim==1) {
			birlesikIsim=acikYaz(isim,soyad);
		} else if (secim==2) {
			birlesikIsim=isimGizle(isim, soyad);
		}else {
			System.out.println("Yanlýþ giriþ oldu. Ýstenilen deðerden birini seçin");
		}
			
		
		//System.out.println(acikYaz(isim,soyad));
		//System.out.println(isimGizle(isim,soyad));
		System.out.println(birlesikIsim);
				
		scan.close();
	}

	private static String isimGizle(String isim, String soyad) {
		isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
		soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\w", "*");
		
		return isim+" "+soyad;

		
	}

	public static String acikYaz(String isim, String soyad) {
		isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
		soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
		return isim+" "+soyad;
		
		
	}

}

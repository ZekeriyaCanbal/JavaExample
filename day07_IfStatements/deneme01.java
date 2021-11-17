package day07_IfStatements;

import java.util.Scanner;

public class deneme01 {

	public static void main(String[] args) {
		// Kullanýcý adýný ve þifresini giriþ yapsýn
		// Girdiðine göre hangisi doðru, yanlýþ ise ekranda yazdýrsýn
		
		String kullaniciAdi="zekeriya";
		String sifre="12345";
		
		Scanner scan=new Scanner(System.in);

		System.out.println("Lütfen Kullanýcý Adýný Giriniz");
		String kullanici_adi=scan.nextLine();

		System.out.println("Lütfen Parola Giriniz");
		String kullanici_sifre=scan.nextLine();
		
		if((kullanici_adi.equals(kullaniciAdi)) && (kullanici_sifre.equals(sifre)) ) {
			System.out.println("Kullanýcý Adý : Doðru");
			System.out.println("Þifre         : Doðru");
			
		}else if ((kullanici_adi.equals(kullaniciAdi)) && !(kullanici_sifre.equals(sifre))){
			System.out.println("Kullanýcý Adý : Doðru");
			System.out.println("Þifre         : Yanlýþ");
		}else if (!(kullanici_adi.equals(kullaniciAdi)) && (kullanici_sifre.equals(sifre))){
			System.out.println("Kullanýcý Adý : Yanlýþ");
			System.out.println("Þifre         : Doðru");
		}else if (!(kullanici_adi.equals(kullaniciAdi)) && !(kullanici_sifre.equals(sifre))){
			System.out.println("Kullanýcý Adý : Yanlýþ");
			System.out.println("Þifre         : Yanlýþ");
		}
		scan.close();		
	}

}

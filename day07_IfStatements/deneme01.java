package day07_IfStatements;

import java.util.Scanner;

public class deneme01 {

	public static void main(String[] args) {
		// Kullan�c� ad�n� ve �ifresini giri� yaps�n
		// Girdi�ine g�re hangisi do�ru, yanl�� ise ekranda yazd�rs�n
		
		String kullaniciAdi="zekeriya";
		String sifre="12345";
		
		Scanner scan=new Scanner(System.in);

		System.out.println("L�tfen Kullan�c� Ad�n� Giriniz");
		String kullanici_adi=scan.nextLine();

		System.out.println("L�tfen Parola Giriniz");
		String kullanici_sifre=scan.nextLine();
		
		if((kullanici_adi.equals(kullaniciAdi)) && (kullanici_sifre.equals(sifre)) ) {
			System.out.println("Kullan�c� Ad� : Do�ru");
			System.out.println("�ifre         : Do�ru");
			
		}else if ((kullanici_adi.equals(kullaniciAdi)) && !(kullanici_sifre.equals(sifre))){
			System.out.println("Kullan�c� Ad� : Do�ru");
			System.out.println("�ifre         : Yanl��");
		}else if (!(kullanici_adi.equals(kullaniciAdi)) && (kullanici_sifre.equals(sifre))){
			System.out.println("Kullan�c� Ad� : Yanl��");
			System.out.println("�ifre         : Do�ru");
		}else if (!(kullanici_adi.equals(kullaniciAdi)) && !(kullanici_sifre.equals(sifre))){
			System.out.println("Kullan�c� Ad� : Yanl��");
			System.out.println("�ifre         : Yanl��");
		}
		scan.close();		
	}

}

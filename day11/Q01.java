package day11;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan=new Scanner(System.in);	
		
		System.out.println("Birinci Say�y� Giriniz");	 
		double sayi1=scan.nextDouble();					

		System.out.println("�kinci Say�y� Giriniz");
		double sayi2=scan.nextDouble();	

		System.out.println("Yap�lacak ��lem \nToplama ise + \n��karma ise - \n�arpma ise * \nB�lme ise / giriniz");
		
		char islem=scan.next().charAt(0);
				
		if (islem=='+') {
			System.out.println("Se�ilen i�lem : Toplama");
			System.out.println("Sonu� : "+(sayi1+sayi2));
			
		}else if (islem=='-') {
			System.out.println("Se�ilen i�lem : ��karma");
			System.out.println("Sonu� : "+(sayi1-sayi2));
		}else if (islem=='*') {
			System.out.println("Se�ilen i�lem : �arpma");
			System.out.println("Sonu� : "+(sayi1*sayi2));
		}else if (islem=='/') {
			System.out.println("Se�ilen i�lem : B�lme");
			System.out.println("Sonu� : "+(sayi1/sayi2));
		}else {
			System.out.println("�zg�n�m Bir ��lem Se�mediniz");
		}
		
	scan.close();	
	}

}

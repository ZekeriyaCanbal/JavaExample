package day03_Variables;

import java.util.Scanner;

public class Soru_Cevaplari7 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
	System.out.println("Adýnýzý Giriniz :");
	String isim=scan.nextLine();
	//char ilkHarf=scan.next().charAt(0);
//	System.out.println("Adýnýzýn baþ Harfi : "+isim.substring(0,1)) ;
//	System.out.println("Adýnýzýn baþ Harfi : "+ilkHarf) ;
	System.out.println("Adýnýzýn baþ Harfi : "+isim.charAt(0)) ;

	}
}

package day13_stringManipulations;

import java.util.Scanner;

public class C02_Raplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bulunan sonucu giriniz");
		String sonuc=scan.nextLine();
		
		sonuc=(sonuc.replace(".", ""));
		
		if(Integer.valueOf(sonuc)>10000) {
			System.out.println("Büyüktür");
		}else {
			System.out.println("Küçüktür");
		}
			
	}

}

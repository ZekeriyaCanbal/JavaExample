package day08_ifElseStatements;

import java.util.Scanner;

public class C02_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir karakter Giriniz");
		
		char karakter=scan.next().charAt(0);
		
		if ((karakter>='A') && (karakter<='Z') || (karakter>='a') && (karakter<='z')) {
			
			System.out.println("Girilen "+karakter+" bir HARFT�R.");
		}
		else {
			System.out.println("Girilen "+karakter+ " bir HARF DE��LD�R");
		}
	}

}

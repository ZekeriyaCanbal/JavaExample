package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C03_Ternary {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Sayýyý Giriniz.");
		double sayi=scan.nextDouble();

		System.out.println("sayýnýn mutlak deðeri : "+(sayi<0 ? (sayi*(-1)) : sayi));
		scan.close();

	}

}

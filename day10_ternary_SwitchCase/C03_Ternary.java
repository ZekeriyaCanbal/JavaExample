package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C03_Ternary {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen Say�y� Giriniz.");
		double sayi=scan.nextDouble();

		System.out.println("say�n�n mutlak de�eri : "+(sayi<0 ? (sayi*(-1)) : sayi));
		scan.close();

	}

}

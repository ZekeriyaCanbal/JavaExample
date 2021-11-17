package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Sayýyý Giriniz.");
		int sayi=scan.nextInt();

		System.out.println(sayi%2==0 ? "çift" : "tek");
		scan.close();
		
	}

}

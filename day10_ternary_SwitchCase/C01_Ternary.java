package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen Birinci Say�y� Giriniz.");
		double sayi1=scan.nextDouble();

		System.out.println("L�tfen Birinci Say�y� Giriniz.");
		double sayi2=scan.nextDouble();
	
		System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
		
		scan.close();

	}

}

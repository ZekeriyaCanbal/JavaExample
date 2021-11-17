package day17_forLoop;

import java.util.Scanner;

public class C07_NestedForLoop {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Çarpým tablosu kaça kaç olsun");
		int satir=scan.nextInt();

		System.out.println("Çarpým tablosu kaça kaç olsun");
		int sutun=scan.nextInt();

		
		for (int i=1; i<=sutun; i++) {
			
			for (int a=1; a<=satir; a++) {
				
				System.out.print(i*a+" ");
			}
			System.out.println("");
		}
		
		
	}

}

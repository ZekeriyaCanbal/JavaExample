package day03_Variables;

import java.util.Scanner;

public class Soru_Cevaplari4 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("K�sa Kenar uzunlu�unu giriniz :");
		int kisaKenar=scan.nextInt();
		System.out.println("uzun Kenar uzunlu�unu giriniz :");
		int uzunKenar=scan.nextInt();
		System.out.println("Y�ksekli�ini giriniz :");
		int yukseklik=scan.nextInt();
	
		System.out.println("Dikd�rtgen prizmen�n hacmi :"+(kisaKenar*uzunKenar*yukseklik)); //Form�l :K�sa Kenar * Uzun Kenar* Y�kseklik

}

}

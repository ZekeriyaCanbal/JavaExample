package day03_Variables;

import java.util.Scanner;

public class Soru_Cevaplari4 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Kýsa Kenar uzunluðunu giriniz :");
		int kisaKenar=scan.nextInt();
		System.out.println("uzun Kenar uzunluðunu giriniz :");
		int uzunKenar=scan.nextInt();
		System.out.println("Yüksekliðini giriniz :");
		int yukseklik=scan.nextInt();
	
		System.out.println("Dikdörtgen prizmenýn hacmi :"+(kisaKenar*uzunKenar*yukseklik)); //Formül :Kýsa Kenar * Uzun Kenar* Yükseklik

}

}

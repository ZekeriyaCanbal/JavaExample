package day08_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseIf {

	public static void main(String[] args) {
		// Kullanicidan maas icin bir teklif isteyin ve 
		// asagidaki degerlere gore cevap azdirin. 
		// Teklif 80.000�in uzerinde ise �Kabul ediyorum� ,
		// 60 � 80.000 arasinda ise �Konusabiliriz�,
		// 60.000�nin altinda ise �Maalesef Kabul edemem� yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen Almak �stedi�iniz Maa�� Giriniz");
		
		int maas=scan.nextInt();
		
		if (maas>80000) {
			System.out.println("Y�ll�k Maa� : "+maas+ " TL, Ayl�k : "+(maas/12)+" TL Kabul ediyorum");
		}else if(maas>60000) {
			System.out.println("Y�ll�k Maa� : "+maas+ " TL, Ayl�k : "+(maas/12)+" TL  Konu�abiliriz.");
		}else {
			System.out.println("Y�ll�k Maa� : "+maas+ " TL,  Ayl�k : "+(maas/12)+" TL Kabul Edemem");
		}
		
		
		
	}

}

package day17_forLoop;

import java.util.Scanner;

public class C03_Palindrome {

	public static void main(String[] args) {
		// method olu�turarak tesrten yazd�rmak 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen tersten yaz�lacak ifadeyi girin.");
		String girilen=scan.nextLine();
	
		if (girilen.equals(terstenYaz(girilen))) {
			System.out.println("Girilen ifade Palindrome");
		}else {
			System.out.println("Girilen ifade Palindrome de�ildir.");
		}
		
		//System.out.println(terstenYaz(girilen));
	}


public static String terstenYaz(String metin) {
		String sonuc="";
		for (int i=metin.length()-1; i>=0; i--) {
			sonuc+=(metin.substring(i,i+1));
		}
	return sonuc;
}

}

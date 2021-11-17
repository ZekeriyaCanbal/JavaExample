package day17_forLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// method oluþturarak tesrten yazdýrmak 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen tersten yazýlacak ifadeyi girin.");
		String girilen=scan.nextLine();
		System.out.println(terstenYaz(girilen));
	}


public static String terstenYaz(String metin) {
		String sonuc="";
		for (int i=metin.length()-1; i>=0; i--) {
			sonuc+=(metin.substring(i,i+1));
		}
	return sonuc;
}

}

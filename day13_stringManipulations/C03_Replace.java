package day13_stringManipulations;

import java.util.Scanner;

public class C03_Replace {

	public static void main(String[] args) {

	//	Scanner scan=new Scanner(System.in);
	
	//	System.out.println(" giriniz");
	//	String sayi=scan.nextLine();
		
		String str="*Java 98ogrenmek c..ok k876olay";
		
		str=str.replaceAll("\\d", "");	// str ifadesindeki t�m say�lar� de�i�tirdik (sildik)
		str=str.replaceAll("\\s", "x");	// str ifadesindeki t�m bo�luklar� x ile de�i�tirdik
		str=str.replaceAll("\\W", "");	// str ifadesindeki harf olmayanlar� de�i�tirdilk. (sildik)
		str=str.replace("x", " ");		// str ifadesindeki x harflerini bo�luk ile de�i�tirdik.
		System.out.println(str);
	
		
	}

}

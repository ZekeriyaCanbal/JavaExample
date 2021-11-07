package day13_stringManipulations;

import java.util.Scanner;

public class C03_Replace {

	public static void main(String[] args) {

	//	Scanner scan=new Scanner(System.in);
	
	//	System.out.println(" giriniz");
	//	String sayi=scan.nextLine();
		
		String str="*Java 98ogrenmek c..ok k876olay";
		
		str=str.replaceAll("\\d", "");	// str ifadesindeki tüm sayýlarý deðiþtirdik (sildik)
		str=str.replaceAll("\\s", "x");	// str ifadesindeki tüm boþluklarý x ile deðiþtirdik
		str=str.replaceAll("\\W", "");	// str ifadesindeki harf olmayanlarý deðiþtirdilk. (sildik)
		str=str.replace("x", " ");		// str ifadesindeki x harflerini boþluk ile deðiþtirdik.
		System.out.println(str);
	
		
	}

}

package day11;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);	
		
		System.out.println("L�tfen Boyunuzu cm olarak Giriniz");	 
		double boy=scan.nextDouble();
		
		System.out.println("L�tfen Kilonuzu Giriniz");	 
		double kilo=scan.nextDouble();
		
		double bmi=((kilo)/(boy/100*boy/100));
		
		System.out.println(bmi);
				
		if (bmi<=20) {
			System.out.println("Olduk�a Zay�fs�n�z");
		}else if(bmi>20 && bmi<=25) {
			System.out.println("Normal S�n�rdas�n�z");
		}else if(bmi>25 && bmi<=30) {
			System.out.println("�irman Kategorisindesiniz");
		}else if(bmi>30){
			System.out.println("Obez Grubundas�n�z");
		}
		
		scan.close();
	}

}

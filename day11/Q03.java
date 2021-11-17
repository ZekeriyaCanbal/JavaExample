package day11;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);	
		
		System.out.println("Lütfen Boyunuzu cm olarak Giriniz");	 
		double boy=scan.nextDouble();
		
		System.out.println("Lütfen Kilonuzu Giriniz");	 
		double kilo=scan.nextDouble();
		
		double bmi=((kilo)/(boy/100*boy/100));
		
		System.out.println(bmi);
				
		if (bmi<=20) {
			System.out.println("Oldukça Zayýfsýnýz");
		}else if(bmi>20 && bmi<=25) {
			System.out.println("Normal Sýnýrdasýnýz");
		}else if(bmi>25 && bmi<=30) {
			System.out.println("Þirman Kategorisindesiniz");
		}else if(bmi>30){
			System.out.println("Obez Grubundasýnýz");
		}
		
		scan.close();
	}

}

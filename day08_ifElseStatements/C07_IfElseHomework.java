package day08_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Notu Giriniz : ");
		double not=scan.nextDouble();
		
		if((not<0) || (not>100)) {
			System.out.println("Lütfen girdiðiniz not 0 ile 100 arasýnda olmalýdýr.");
			
		}else if(not<50) {
			System.out.println("Notunuz : D");
		}else if (not<60) {
			System.out.println("Notunuz : C");
		}else if (not<80){
			System.out.println("Notunuz : B");
		}else {
			System.out.println("Notunuz : A");
		}

}

}

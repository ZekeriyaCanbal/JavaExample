package day13_stringManipulations;

import java.util.Scanner;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Scanner scan=new Scanner(System.in);
	
	//	System.out.println(" giriniz");
	//	String sayi=scan.nextLine();
		
	String EXAMPLE_TEST="Örneðin, bir harf ve ardýndan bir nokta veya virgül arasýndaki tüm boþluklarý deðiþtirmek istediðinizi varsayalým. Bu,"; 
		System.out.println(EXAMPLE_TEST);
		String pattern = "(\\w)(\\s+)([\\.,])";
		System.out.println(EXAMPLE_TEST.replaceAll(pattern, "$1$3"));
	
int gunNo=3;
		
		
		switch(gunNo) {
		
		case 1: 
			System.out.println("Pazartesi"); 
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Lutfen gecerli bir gun numarasi yaziniz");
		
		}
	}

}

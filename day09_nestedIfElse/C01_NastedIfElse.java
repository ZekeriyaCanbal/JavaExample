package day09_nestedIfElse;

import java.util.Scanner;

public class C01_NastedIfElse {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Þifreyi Giriniz");
		char sifre=scan.next().charAt(0);
		
		if (sifre>='A' && sifre<='Z')
		{
			if (sifre=='A')
			{
				System.out.println("Geçerli Þifre");
			}else
			{
				System.out.println("Geçersiz Þifre");			
			}
					
		} else if (sifre>='a' && sifre>='z')
			{
				if (sifre=='z')
					{
						System.out.println("Geçerli Þifre");
					}else
						{
						System.out.println("Geçersiz Þifre");			
						}
			
			} else
				{
				System.out.println("Geçerli bir þifre için harfle baþlamanýz gerekmektedir.");
				}
scan.close();		
	}

}

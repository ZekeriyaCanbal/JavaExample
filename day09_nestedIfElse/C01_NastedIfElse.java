package day09_nestedIfElse;

import java.util.Scanner;

public class C01_NastedIfElse {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen �ifreyi Giriniz");
		char sifre=scan.next().charAt(0);
		
		if (sifre>='A' && sifre<='Z')
		{
			if (sifre=='A')
			{
				System.out.println("Ge�erli �ifre");
			}else
			{
				System.out.println("Ge�ersiz �ifre");			
			}
					
		} else if (sifre>='a' && sifre>='z')
			{
				if (sifre=='z')
					{
						System.out.println("Ge�erli �ifre");
					}else
						{
						System.out.println("Ge�ersiz �ifre");			
						}
			
			} else
				{
				System.out.println("Ge�erli bir �ifre i�in harfle ba�laman�z gerekmektedir.");
				}
scan.close();		
	}

}

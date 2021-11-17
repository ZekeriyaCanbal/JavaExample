package day08_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Cinsiyetinizi erkek veya kadýn seçiniz. Daha sonrasýnda ise Yaþýnýzý Giriniz");
		
		String cinsiyeti=scan.nextLine().toLowerCase();
		int yas=scan.nextInt();

		if (cinsiyeti.equals("erkek") || cinsiyeti.equals("kadýn"))
		{

			if (cinsiyeti.equals("erkek"))
			{
				if (yas>65) 
					{
						System.out.println("EMEKLÝ OLABÝLÝRSÝNÝZ BAYIM");
					}else
					{
						System.out.println("EMEKLÝ OLAMAZSINIZ BAYIM");
					}
			}

			if (cinsiyeti.equals("kadýn"))
			{
				if (yas>60)	{
						System.out.println("EMEKLÝ OLABÝLÝRSÝNÝZ BAYAN");
					}else {
						System.out.println("EMEKLÝ OLAMAZSINIZ BAYAN");
						}
					}
			} else {
					System.out.println("Lütfen erkek veya kadýn yazýn");
					}
	}

}

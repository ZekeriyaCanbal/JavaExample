package day08_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Cinsiyetinizi erkek veya kad�n se�iniz. Daha sonras�nda ise Ya��n�z� Giriniz");
		
		String cinsiyeti=scan.nextLine().toLowerCase();
		int yas=scan.nextInt();

		if (cinsiyeti.equals("erkek") || cinsiyeti.equals("kad�n"))
		{

			if (cinsiyeti.equals("erkek"))
			{
				if (yas>65) 
					{
						System.out.println("EMEKL� OLAB�L�RS�N�Z BAYIM");
					}else
					{
						System.out.println("EMEKL� OLAMAZSINIZ BAYIM");
					}
			}

			if (cinsiyeti.equals("kad�n"))
			{
				if (yas>60)	{
						System.out.println("EMEKL� OLAB�L�RS�N�Z BAYAN");
					}else {
						System.out.println("EMEKL� OLAMAZSINIZ BAYAN");
						}
					}
			} else {
					System.out.println("L�tfen erkek veya kad�n yaz�n");
					}
	}

}

package my.day02;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args)
	{
		System.out.println("------ ���� ���߱� ���� ���� ------");
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int com_num = ran.nextInt(100) + 1;
		
		while(true)
		{
			System.out.print("���ڸ� �Է����ּ���(1~100) : ");
			int user_num = scan.nextInt();
			
			if(user_num > 0 && user_num <= 100)
			{
				if(user_num != com_num)
				{
					if(user_num > com_num)
					{
						System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�.\n");
					}
					else if(user_num < com_num)
					{
						System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�.\n");
					}
					continue;
				}
				else if(user_num == com_num)
				{
					System.out.println("�����Դϴ�.");
					break;
				}
			}
			else
			{
				System.out.println("1 ~ 100������ ���ڸ� �Է����ּ���.");
				continue;
			}
		}
	}
}

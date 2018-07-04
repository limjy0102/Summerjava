package my.day02;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args)
	{
		System.out.println("------ 숫자 맞추기 게임 시작 ------");
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int com_num = ran.nextInt(100) + 1;
		
		while(true)
		{
			System.out.print("숫자를 입력해주세요(1~100) : ");
			int user_num = scan.nextInt();
			
			if(user_num > 0 && user_num <= 100)
			{
				if(user_num != com_num)
				{
					if(user_num > com_num)
					{
						System.out.println("입력하신 숫자보다 작습니다.\n");
					}
					else if(user_num < com_num)
					{
						System.out.println("입력하신 숫자보다 큽니다.\n");
					}
					continue;
				}
				else if(user_num == com_num)
				{
					System.out.println("정답입니다.");
					break;
				}
			}
			else
			{
				System.out.println("1 ~ 100까지의 숫자만 입력해주세요.");
				continue;
			}
		}
	}
}

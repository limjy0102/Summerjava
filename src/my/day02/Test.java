package my.day02;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args){
		
		/* �й� �̸� �Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("�й� : ");
		int num1 = scan.nextInt(); // scan.nextInt() ���� ������ �ȴ�.
		
		System.out.print("�̸� : ");
		
		String name = scan.next();
		
		System.out.println("�й� : " + num1 + "\n" + "�̸� : " + name);*/
		
		/* ���� ������ ���ϱ�
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ : ");
		double r = scan.nextDouble();
		double area = Math.pow(r, 2) * 3.14;
		
		System.out.println("���� ���� : " + area);
		*/
		
		/* if~ else if ����
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ���. ");
		double score_lang = scan.nextDouble();
		
		System.out.print("���� ������ �Է��ϼ���. ");
		double score_eng = scan.nextDouble();
		
		System.out.print("���� ������ �Է��ϼ���. ");
		double score_math = scan.nextDouble();
		
		double score_avg = (score_lang + score_eng + score_math) / 3;
		
		System.out.println("��� ������ " + "�Դϴ�.");
		
		if(score_lang > score_avg)
		{
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		}
		else if(score_lang < score_avg)
		{
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		}
		else
		{
			System.out.println("���� ������ ��� �Դϴ�.");
		}
		
		if(score_eng > score_avg)
		{
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		}
		else if(score_eng < score_avg)
		{
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		}
		else
		{
			System.out.println("���� ������ ��� �Դϴ�.");
		}
		
		if(score_eng > score_avg)
		{
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		}
		else if(score_eng < score_avg)
		{
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		}
		else
		{
			System.out.println("���� ������ ��� �Դϴ�.");
		}
		*/	
		
		/*		
		int sum = 0;
		
		for(int i = 0; i <= 10; i++)
		{
			sum += i;
			if(i == 10)
			{
				System.out.println(sum);
				break;
			}
		}
		 */
		
		/*
		int total_1 = 0, total_2 = 0;
		
		for(int i = 0; i <= 10; i++)
		{
			
			if(i%2 == 1)
			{
				total_1 += i;
			}
			else if(i%2 == 0)
			{
				total_2 += i;
			}
			
			if(i == 10)
			{
				System.out.println("Ȧ���� ���� " + total_1);
				System.out.println("¦���� ���� " + total_2);
				break;
			}
		}
		*/
		
		/*
		for(int i = 1; i < 10; i++)
		{
			for(int j = 1; j < 10; j++)
			{
				System.out.print(j + " X " + i + "= " + (i*j) + "\t");
			}
			System.out.println();
		}
		*/
		
	}
}

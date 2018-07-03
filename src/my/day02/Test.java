package my.day02;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args){
		
		/* 학번 이름 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 : ");
		int num1 = scan.nextInt(); // scan.nextInt() 먼저 실행이 된다.
		
		System.out.print("이름 : ");
		
		String name = scan.next();
		
		System.out.println("학번 : " + num1 + "\n" + "이름 : " + name);*/
		
		/* 원의 반지름 구하기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		double r = scan.nextDouble();
		double area = Math.pow(r, 2) * 3.14;
		
		System.out.println("원의 넓이 : " + area);
		*/
		
		/* if~ else if 사용법
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요. ");
		double score_lang = scan.nextDouble();
		
		System.out.print("영어 점수를 입력하세요. ");
		double score_eng = scan.nextDouble();
		
		System.out.print("수학 점수를 입력하세요. ");
		double score_math = scan.nextDouble();
		
		double score_avg = (score_lang + score_eng + score_math) / 3;
		
		System.out.println("평균 점수는 " + "입니다.");
		
		if(score_lang > score_avg)
		{
			System.out.println("국어 점수는 평균보다 높습니다.");
		}
		else if(score_lang < score_avg)
		{
			System.out.println("국어 점수는 평균보다 낮습니다.");
		}
		else
		{
			System.out.println("국어 점수는 평균 입니다.");
		}
		
		if(score_eng > score_avg)
		{
			System.out.println("영어 점수는 평균보다 높습니다.");
		}
		else if(score_eng < score_avg)
		{
			System.out.println("영어 점수는 평균보다 낮습니다.");
		}
		else
		{
			System.out.println("영어 점수는 평균 입니다.");
		}
		
		if(score_eng > score_avg)
		{
			System.out.println("수학 점수는 평균보다 높습니다.");
		}
		else if(score_eng < score_avg)
		{
			System.out.println("수학 점수는 평균보다 낮습니다.");
		}
		else
		{
			System.out.println("수학 점수는 평균 입니다.");
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
				System.out.println("홀수의 합은 " + total_1);
				System.out.println("짝수의 합은 " + total_2);
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

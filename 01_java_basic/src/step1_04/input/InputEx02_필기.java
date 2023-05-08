package step1_04.input;

//scan (데이터 입), 출력 sout, 연산 기호

import java.util.Scanner;


public class InputEx02_필기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		System.out.print("정수1 입력 :");
		int number = scan.nextInt();
		System.out.print("정수2 입력 :");
		int number2 = scan.nextInt();
		
		System.out.println(number+ number2 );
		
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.print("숫자를 입력하시요 :");
		int unmber = scan.nextInt();
		System.out.println(unmber == 1);
		
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.print("숫자를 입력하시요 :");
		int sdfgs = scan.nextInt();
		System.out.println(60 < sdfgs && sdfgs < 100);
		
	}
	
}

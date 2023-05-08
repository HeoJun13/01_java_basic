package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx21_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rNum = ran.nextInt(50) +1 ;
		System.out.println("문제" + rNum);
		
		int locatiog10 = rNum / 10;
		int locatiog1 = rNum % 10;
		
		int count369 = 0;
		
		if(locatiog10 == 3 || locatiog10 == 6 || locatiog10 == 9 ) {
			count369++;
		}
		
		if (count369 == 2) {
			System.out.println("짝짝");
		}
		else if (count369 == 1) {
			System.out.println("짝");
			}
		else {
			System.out.println(rNum);
		}
		}
	
	
		
	}


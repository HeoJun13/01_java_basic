package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

// 15:40 ~

/*
 * # 홀짝 게임
 * 
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 * 
 */

public class IfEx16_필기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rRum1 = ran.nextInt(100)+1;
		
		System.out.println("문제[ " + rRum1 + " ]");
		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 :");
		int choice = scan.nextInt();
		
		if (choice ==1) {
			if(rRum1 % 2 == 1) {
				System.out.println("오답");
			}
			if(rRum1 % 2 == 0) {
				System.out.println("정답");
			}
		}
		if (choice == 2) {
			if(rRum1 % 2 == 1) {
				System.out.println("정답");
			}
			if(rRum1 % 2 == 2) {
				System.out.println("오답");
			}
			}
		}
	}

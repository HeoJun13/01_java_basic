package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

// 15:33 ~ 15:39
// 
/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_필기 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int Rum = ran.nextInt(10);
		
		if (Rum < 3 ) {
				System.out.println("꽝");
		}
		if (Rum >= 3) {
			System.out.println("당첨");
		}
	
		
	}

}

package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_필기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System .in);
		Random ran = new Random();
		
		int bulgogiBurgerPrice = 8700; // 가격
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		int bulgogiBurgerOrder = 0; //몇개
		int shrimpBurgerOrder = 0;
		int colaOrder = 0;
		int i = 1; //반복문을 위해
		
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");
		
		while (i <= 5 ) { //반복문
			
			System.out.print("메뉴선택 :");
			int choice = scan.nextInt();
			
			if (choice == 1) bulgogiBurgerOrder++;
			else if (choice == 2) shrimpBurgerOrder++;
			else if (choice == 3) colaOrder++;
			
			i++;
		} 
		
		int total = bulgogiBurgerOrder * bulgogiBurgerPrice + shrimpBurgerOrder * bulgogiBurgerPrice + colaOrder * colaPrice;
		
		System.out.println("총금액 =" + total + "원");
		System.out.print("현금 금액 :");
		int money = scan.nextInt();
		
		int charge = money - total;
		
		if(charge >=0 ) {
			System.out.println("======연수증 ======");
			System.out.println("1. 불고기 버거 " + bulgogiBurgerOrder + "개");
			System.out.println("2. 새우  버서 " + shrimpBurgerOrder + "개");
			System.out.println("3. 콜     라 " + colaOrder + "개");
			System.out.println("4. 총 금 액 " + total + "원");
			System.out.println("5. 잔     돈 " + charge + "원");
			
			}
		else {
			System.out.println("잔액이 부족합니다");
					
			}
			
			
			
			
			
		}

	}

package step1_02.variable;

// 2023-04-24 16:04 ~ 16:15
// int 와 double의 차이점을 교려하지 못하였던 점을 느겼습니다
// int 숫자 double 소수점
public class VariableEx03_풀이 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력
		
		int cash = 10000;
		int snack = 2800;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		double taxRate = 3.3;
		int money = 2000000;
		System.out.println("세금은 " + taxRate * money + " 입니다");
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		int total = 100+88+92;
				System.out.println("평균은 " + total / 3 + " 입니다");
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		int partOf = 3;
		int Height = 7;
		System.out.println("넓이는 " + (partOf * Height) / 2 + " 입니다");

		//문제4) 100초를 1분 40초로 출력
		int minute = 100/60;
		int second = 100%60;
		System.out.println(+ minute + "분" + second + "초");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원의 개수 = 1개
		//       100원의 개수 = 3개 


	}

}

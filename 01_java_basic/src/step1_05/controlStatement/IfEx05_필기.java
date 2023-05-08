package step1_05.controlStatement;

import java.util.Scanner;

// (16:53~17:09)
// Scanner Scan = new Scanner(System.in); 이 프로그램이 익숙하지않다
//

/*
 * # 로그인[2단계]
 * 
 * 1. id와 pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 id와 pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_필기 {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		System.out.println("회원가입을 진행합니다 :");
		System.out.print("가입할 아이디 입력해주세요 :");
		dbId = Scan.nextInt();
				
		System.out.print("가입할 비밀번호 입력해주세요 :");
		dbPw = Scan.nextInt();
		
		System.out.println("가입이 되었습니다");
		
		System.out.println("===로그인===");
		System.out.print("id 입력해주세요 :");
		int myid = Scan.nextInt();
				
		System.out.print("pw 입력해주세요 :");
		int myPw = Scan.nextInt();
		
		if (dbId==myid && dbPw==myPw) System.out.println("로그인 성공");
			
		if (dbId!=myid || dbPw!=myPw) System.out.println("로그인 실패");
			
		
	}

}

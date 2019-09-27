package com.view;

import java.util.Scanner;

public class CafeMenu {
	Scanner sc = new Scanner(System.in);
	
	/*로그인 후 실행되는 첫 화면, 메뉴 선택 화면*/
	public void MenuChoice() {
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 전체 메뉴 출력");
			System.out.println("6. 장바구니에 추가");
			System.out.println("7. 장바구니에서 삭제");
			System.out.println("8. 장바구니 출력");
			System.out.println("9. 주문하기");
			
			System.out.println("0. 종료");
			System.out.print("번호 입력: ");
			int menu = sc.nextInt();
			
		}
		
	}
	
	
	
}

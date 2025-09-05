package com.kh.librarymember.view;

import java.util.Scanner;

import com.kh.librarymember.controller.LibraryMemberController;

public class LibraryView {

	private Scanner sc = new Scanner(System.in);
	private LibraryMemberController lmc = new LibraryMemberController();
	
	
	public void mainMenu() {
		
		/*
		 * 1. 회원 가입- 이름, 전화번호
		 * 2. 회원 정보변경(전화번호)
		 * 3. 회원 조회
		 * 4. 회원 탈퇴
		 */
		
		while(true) {
			System.out.println();
			System.out.println("===== 🙎‍♂️🙎‍♂️ 회원 관리 서비스입니다 🙎‍♀️🙎 =====");
			System.out.println();
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 정보 변경");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 탈퇴");
			System.out.println("0. 메인메뉴로 돌아가기");
			System.out.print("메뉴를 선택해주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			
			switch(menuNo) {
			case 1 : memberInsert(); break;
			case 2 : memberUpdate(); break;
			case 3 : break;
			case 4 : break;
			case 0 : System.out.println("메인화면으로 이동합니다"); return;
			}
		}
	}
	
	
	private void memberInsert() {
		
		System.out.println();
		System.out.println("===== 📃📃 회원 가입 서비스 📃📃 =====");
		System.out.println("등록하실 이름을 입력해주세요 > ");
		String memberName = sc.nextLine();
		System.out.println("등록하실 전화번호를 입력해주세요 > ");
		String memberPhone = sc.nextLine();
		
		int result = lmc.memberInsert(memberName, memberPhone);
		
		if(result > 0) {
			System.out.println("회원 가입에 성공했습니다.");
		} else {
			System.out.println("회원 가입에 실패했습니다.");
		}
		
	}
	

	private void memberUpdate() {
		
		System.out.println();
		System.out.println("===== 📃📃 정보 변경 서비스 📃📃 =====");
		System.out.println("등록하신 이름을 입력해주세요 > ");
		String memberName = sc.nextLine();
		System.out.println("등록하신 전화번호를 입력해주세요 > ");
		String memberPhone = sc.nextLine();
		System.out.println("변경하실 전화번호를 입력해주세요 > ");
		String newPhone = sc.nextLine();
		
		int result = lmc.memberUpdate(memberName, memberPhone, newPhone);
		
		System.out.println(memberName + memberPhone + newPhone);
	}
	
	
	
	
}


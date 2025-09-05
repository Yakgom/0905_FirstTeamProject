package com.kh.book.view;

import java.util.Scanner;

import com.kh.book.controller.BookController;

public class BookView {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("=========< 도서 관리 서비스 >==========");
		System.out.println("1. 개별도서 관리");
		System.out.println("2. 도서장르 관리");
		System.out.println("9. 이전 메뉴로 돌아가기");
		System.out.print("원하시는 메뉴를 입력해주세요 : ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1 : bookView(); break;
		case 2 : BookGenreView().mainMenu(); break;
		case 9 : return;
		default : System.out.println("잘못 입력하셨습니다. ");
		}
	}
	
	private void bookView() {
		System.out.println("=========< 개별 도서 관리 서비스 >==========");
		System.out.println("1. 도서 추가");
		System.out.println("2. 도서 삭제");
		System.out.println("3. 도서 조회");
		System.out.println("4. 도서명 변경");
		System.out.println("9. 이전 메뉴로 돌아가기");
		System.err.print("원하시는 메뉴를 입력해주세요 : ");
		
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1 : insertBook(); break;
		case 2 : break;
		case 3 : break;
		case 4 : break;
		case 9 : return;
		default : System.out.println("잘못 입력하셨습니다. ");
		}
	}
	
	private void insertBook() {
		System.out.println("도서 추가 서비스입니다.");
		System.out.print("도서명 : ");
		String bookName = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르명 : ");
		String genre = sc.nextLine();
		
		int result = bc.insertBook(bookName, author, genre);
		
		if(result > 0) {
			System.out.println("새 도서가 성공적으로 추가 되었습니다.");
		} else {
			System.out.println("도서 등록에 실패했습니다. 장르명등을 다시 확인해주세요.");
		}
		
		
	}
	
	
	
	
	
	

}

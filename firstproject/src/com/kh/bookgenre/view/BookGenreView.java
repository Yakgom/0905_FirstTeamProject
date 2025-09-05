package com.kh.bookgenre.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.bookgenre.controller.BookGenreController;
import com.kh.bookgenre.model.vo.BookGenre;

public class BookGenreView {

	private BookGenreController bgc = new BookGenreController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		while (true) {
			System.out.println("==========장르 관리 서비스==========");

			System.out.println("1. 장르 추가");
			System.out.println("2. 장르 전체 조회");
			System.out.println("3. 장르별 분류장소 변경");
			System.out.println("4. 장르 삭제");
			System.out.println("8. 프로그램 종료");
			System.out.print("메뉴를 선택하세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {

			case 1:
				save();
				break;
			case 2:
				findAll();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 8:
				System.out.println("프로그램을 종료합니다 .");
				return;

			}

		}

	}

	private void save() {

		System.out.println("\n장르 추가 시스템입니다.");

		System.out.print("추가하실 장르명을 적어주세요 > ");
		String genreName = sc.nextLine();
		System.out.print("장르 분류 장소를 적어주세요 > ");
		String locationPlace = sc.nextLine();

		int result = bgc.save(genreName, locationPlace);

		if (result > 0) {
			System.out.println("장르 추가에 성공했습니다.");
		} else {
			System.out.println("장르 추가에 실패했습니다.");
		}

	}

	private void findAll() {

		List<BookGenre> bookGenres = new ArrayList<BookGenre>();

		bookGenres = bgc.findAll();

		if (!bookGenres.isEmpty()) {
			System.out.println("회원 조회 결과 입니다.");
			bookGenres.stream().forEach(b -> {
				System.out.println("================================");
				System.out.println("장르 번호 : " + b.getGenreNo());
				System.out.println("장르 이름 : " + b.getGenreName());
				System.out.println("분류 장소 : " + b.getLocationPlace());

			});

		} else {
			System.out.println("조회결과가 없습니다.");
		}

	}
	
	private void update() {
		
		System.out.println("장르가 위치하는 분류장소 변경 서비스입니다.");
		
		System.out.print("장소를 바꾸실 장르를 적어주세요 > ");
		String genreName = sc.nextLine();
		System.out.print("바꾸실 장소명을 적어주세요 > ");
		String locationPlace = sc.nextLine();
		
		int result = bgc.update(genreName,locationPlace);
		
		
		if(result > 0 ) {
			System.out.println("변경에 성공했습니다.");
		}
		else {
			System.out.println("변경에 실패했습니다.");
		}
		
		
	}
	
	private void delete() {
		
		System.out.print("삭제하실 장르를 적어주세요 > ");
		String genreName = sc.nextLine();
		System.out.print("삭제하실 장르명의 분류장소를 적어주세요 > ");
		String locationPlace = sc.nextLine();
		
		int result = bgc.delete(genreName,locationPlace);
		
		if(result > 0) {
			System.out.println("삭제에 성공했습니다.");
		}
		else {
			System.out.println("삭제에 실패했습니다.");
		}
}
}

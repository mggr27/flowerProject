package view;

import java.util.ArrayList;

public class EndView {

	// 모든 프로젝트들 출력
	public static void projectListView(ArrayList allOrderProject) {
		if (allOrderProject != null) {
			int length = allOrderProject.size();

			if (length != 0) {
				for (int index = 0; index < length; index++) {
					System.out.println("[주문번호]" + (index + 1) + allOrderProject.get(index));
				}
			} else {
				System.out.println("요청하신 프로젝트 정보는 1도 없습니다.");
			}
		} else {
			System.out.println("요청하신 프로젝트들 정보는 없습니다.");
		}
	}

	// ?? 모든 DTO 정보 출력하는 메소드
	public static void allView(Object object) {
		System.out.println("        " + object);
	}

	// 예외 상황 출력
	public static void showError(String message) {
		System.out.println(message);
	}
}

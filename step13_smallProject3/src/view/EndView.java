package view;

import java.util.ArrayList;

public class EndView {

	// ��� ������Ʈ�� ���
	public static void projectListView(ArrayList allOrderProject) {
		if (allOrderProject != null) {
			int length = allOrderProject.size();

			if (length != 0) {
				for (int index = 0; index < length; index++) {
					System.out.println("[�ֹ���ȣ]" + (index + 1) + allOrderProject.get(index));
				}
			} else {
				System.out.println("��û�Ͻ� ������Ʈ ������ 1�� �����ϴ�.");
			}
		} else {
			System.out.println("��û�Ͻ� ������Ʈ�� ������ �����ϴ�.");
		}
	}

	// ?? ��� DTO ���� ����ϴ� �޼ҵ�
	public static void allView(Object object) {
		System.out.println("        " + object);
	}

	// ���� ��Ȳ ���
	public static void showError(String message) {
		System.out.println(message);
	}
}

package javaObject;

import java.util.Scanner;

public class Toi10 {

	public static void main(String[] args) {
		int flag = 1;

		Scanner str = new Scanner(System.in);

		while (flag == 1) {
			//trueの時ループ

			//入力処理
			System.out.println("モードを入力してください。1or2");

			int mode = str.nextInt();

			System.out.println("生まれた年を西暦で入力してください。");

			int umare = str.nextInt();

			//モード判定

			if (mode == 1) {

				Toi10SubAge toi10subage = new Toi10SubAge();
				toi10subage.Toshi(umare);

			} else if (mode == 2) {
				Toi10SubYear toi10subyear = new Toi10SubYear();
				toi10subyear.Year(umare);

			} else {

				flag = 1;

			}

		}
		str.close();
	}

}

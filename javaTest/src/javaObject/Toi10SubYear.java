package javaObject;

import java.util.Scanner;

public class Toi10SubYear {
	public void Year(int umare) {

		Scanner str = new Scanner(System.in);

		System.out.println("調べたい年齢を入力してください。");

		int nenrei = str.nextInt();

		int year = nenrei + umare;

		System.out.println("あなたが" + nenrei + "歳の時は西暦" + year + "年です。");


		str.close();

		System.exit(0);
	}
}
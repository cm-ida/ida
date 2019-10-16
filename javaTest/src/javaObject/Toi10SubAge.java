package javaObject;

import java.util.Scanner;

public class Toi10SubAge {

	 public void Toshi(int umare) {

	Scanner str = new Scanner(System.in);

System.out.println ("調べたい年を西暦で入力してください。");

	int year = str.nextInt();
	int nenrei = year - umare;

	System.out.println("西暦" + year + "年の時、あなたは" + nenrei + "歳です。");


	str.close();

		System.exit(0);
}
}
package javaTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("aの値を入力してください");
		int a;
		a = Integer.parseInt(br.readLine());

		int b;
		b = 5;
		int count;
		count = 0;

		while (a < b) {
			a = a + 1;
			++count;

		}

		System.out.println("aの値は" + a + "です。");

		System.out.println("繰り返した回数は" + count + "回です。");

		br.close();

	}

}

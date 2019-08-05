package javaTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {


		public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("aの値を入力してください");
		int a;
		a=Integer.parseInt(br.readLine());
		
		System.out.println("bの値を入力してください");
		int b;
		b=Integer.parseInt(br.readLine());

		int c;

		System.out.println("c=" + a + "+" + b);

		c = a + b;
		System.out.println("c=" + c + "+1");
		
		
		}

	// TODO 自動生成されたメソッド・スタブ

}

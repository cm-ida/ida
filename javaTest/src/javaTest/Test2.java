package javaTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("年齢を入力してください");
		String nyuryoku;
		nyuryoku = br.readLine();
		int nenrei;
		nenrei = Integer.parseInt(nyuryoku);

		int kakaku;
		kakaku = 0;

		if (nenrei == 0) {
			kakaku = 100;//年齢が0歳だったら
		} else {
			kakaku = 500;//年齢が0でなかったら

		}
		System.out.println("年齢が" + nenrei + "歳の時、価格は" + kakaku + "円です");

		br.close();
	}
}

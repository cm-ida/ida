package javaPractice;

import java.util.Scanner;

public class Poke10 {

	public static void main(String[] args) throws Exception {

		// Your code here!
		String[] ctp = { "キャタピー", "トランセル", "バタフリー" };
		int level = 1;
		int shinka = 0;
		//int hp = 10;

		Poke10Sub sp = new Poke10Sub();

		System.out.println(ctp[0] + "を捕まえた。");

		Pokemon mpokemon1 = new Pokemon();
		Pokemon ypokemon1 = new Pokemon();
        //マイポケモン
		mpokemon1.setlevel(3);
		mpokemon1.setpokeName("キャタピー");
		//野生のポケモン
		ypokemon1.setlevel(2);
		ypokemon1.setpokeName("ピカチュウ");


		System.out.println(ctp[0] + "のニックネームを入力してね！");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();

		System.out.println(ctp[0] + "のニックネームは" + name + "だ！");

		//条件レベル1から100まで
		for (int a = 1; a >= 1 && a <= 100; a++) {

			//条件分岐shinka = 0の時
			while (shinka == 0) {

				level++;
				System.out.println("あ、野生のポケモンが現れた！！");
				System.out.println("野生の" + ypokemon1.getpokeName() + "だ！");


				//レベルが７より小さければ
				if (level < 7) {

					sp.levelup(name, level);

				} else {

					sp.levelup(name, level);

					System.out.println("おめでとう!" + name + "は" + ctp[1] + "に進化した！");

					shinka = 1;

				}
			}
			//条件分岐shinka = 1の時
			while (shinka == 1) {

				level++;
				System.out.println("あ、野生のポケモンが現れた！！");
				System.out.println("野生の" + ypokemon1.getpokeName() + "だ！");

				//レベルがより小さい
				if (level < 10) {

					sp.levelup(name, level);

				} else {

					sp.levelup(name, level);
					System.out.println("おめでとう!" + name + "は" + ctp[2] + "に進化した！");

					shinka = 2;

				}

			}

		}
		//   hp = sp.fight
		//		System.out.println(hp);

		scan.close();

	}
}

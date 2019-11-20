package javaPractice;

public class Poke10Sub {

	// String poke =""
	public void levelup(String name, int level) throws Exception {
		
		Pokemon ypokemon1 = new Pokemon();
		
		//野生のポケモン
		ypokemon1.setlevel(2);
		ypokemon1.setpokeName("ピカチュウ");


		System.out.println("野生の" + ypokemon1.getpokeName() + "を倒した！！");
		
		System.out.println(name + "はレベル" + level + "になった");

		//System.out.println("kakaka");
	}

	public int fight(String name, int hp) throws Exception {

		System.out.println("あ、野生のポケモンが現れた！！");
		System.out.println(name + "の攻撃！！");

		hp = hp + 20;

		return hp;
	}

}

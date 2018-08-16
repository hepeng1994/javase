package java34.dya06;

import java.util.Random;

public class ArrRandom {
	public static void main(String[] args) {
		String[] names=new String[]{"刘能","赵四","郑贵强","谢广坤"};
		Random  r=new Random();
		int index=r.nextInt(names.length);
		String name=names[index];
		System.out.println(name);
	}

}

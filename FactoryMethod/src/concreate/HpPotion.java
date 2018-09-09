package concreate;

import framework.Item;

public class HpPotion implements Item {

	@Override
	public void use() {
		System.out.println("Hp Potion을 사용 했습니다.");
	}

}

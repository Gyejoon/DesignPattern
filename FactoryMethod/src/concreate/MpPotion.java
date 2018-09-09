package concreate;

import framework.Item;

public class MpPotion implements Item {

	@Override
	public void use() {
		System.out.println("Mp Potion을 사용 했습니다.");
	}

}

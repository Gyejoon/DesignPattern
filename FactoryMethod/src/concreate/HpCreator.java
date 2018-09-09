package concreate;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("데이터베이스에서 회복 물약의 정보를 가져온다.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("회복 물약 생성 로그를 기록한다." + new Date());
	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}
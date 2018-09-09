package concreate;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("�����ͺ��̽����� ȸ�� ������ ������ �����´�.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("ȸ�� ���� ���� �α׸� ����Ѵ�." + new Date());
	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}
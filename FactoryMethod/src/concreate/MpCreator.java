package concreate;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("�����ͺ��̽����� ���� ������ ������ �����´�.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("���� ���� ���� �α׸� ����Ѵ�." + new Date());
	}

	@Override
	protected Item createItem() {
		return new MpPotion();
	}

}

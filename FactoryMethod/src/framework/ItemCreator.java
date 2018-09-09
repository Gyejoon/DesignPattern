package framework;

public abstract class ItemCreator {

	// ���丮 �޼ҵ� ���� -> ���ø� �޼ҵ尡 ����
	// ������ ������ �и��� -> ���� ������ �ִ� ���α׷��� ���� �ϱ� �����̴�.
	public Item create() {
		Item item;
		
		// step1
		requestItemsInfo();
		// step2
		item = createItem();
		// step3
		createItemLog();
		
		return item;
	}
	
	// �������� �����ϱ� ���� ������ ���̽����� ������ ������ ��û�Ѵ�.
	protected abstract void requestItemsInfo();
	
	// �������� ���� �� ������ ���� ���� �ҹ��� �����ϱ� ���� ����Ʈ���̽��� ������ ����
	protected abstract void createItemLog();
	
	// �������� �����ϴ� �˰���
	protected abstract Item createItem();
	
	
}

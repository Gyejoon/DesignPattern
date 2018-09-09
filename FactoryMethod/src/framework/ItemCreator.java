package framework;

public abstract class ItemCreator {

	// 팩토리 메소드 패턴 -> 템플릿 메소드가 사용됨
	// 구조와 구현의 분리는 -> 좀더 유연성 있는 프로그램을 설계 하기 위함이다.
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
	
	// 아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청한다.
	protected abstract void requestItemsInfo();
	
	// 아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이트베이스에 아이템 생성
	protected abstract void createItemLog();
	
	// 아이템을 생성하는 알고리즘
	protected abstract Item createItem();
	
	
}

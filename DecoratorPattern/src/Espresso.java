
public class Espresso extends Adding {

	protected static int espressoCount = 0;
	
	public Espresso(Beverage base) {
		super(base);
	}
	
	@Override
	public int getTotalPrice() {
		// 이 부분이 핵심.
		// super.getTotalPrice()로 호출하면 부모 클래스인 Adding으로 간다.
		// 근데, 부모의 getTotalPrice는 base.getTotalPrice()임.
		// 문제는 Beverage를 직접적으로 구현한 Base클래스가 Beverage 자체이므로,
		// base.getTotalPrice()는 항상 Base의 구현부를 거쳤다가 돌아온다.
		// 데코레이터 이므로 계속 덮어씌워져서 호출이 됨.
		// 그래서 static 변수로 인해 espressCount는 1이 넘어가고
		// 다시 이부분으로 돌아옴으로써, getTotalPrice가 70이 되고, getAddPrice() 조차 
		// eespressoCount가 1이 넘어가므로, 70이 된다. 그래서 70 + 70 = 140
		return super.getTotalPrice() + getAddPrice();
	}
	
	private static int getAddPrice() {
		espressoCount += 1;
		int addPrice = 100;
		
		if(espressoCount > 1) {
			addPrice = 70;
		}
		
		return addPrice;
	}

}

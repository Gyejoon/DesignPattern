
public class Espresso extends Adding {

	protected static int espressoCount = 0;
	
	public Espresso(Beverage base) {
		super(base);
	}
	
	@Override
	public int getTotalPrice() {
		// �� �κ��� �ٽ�.
		// super.getTotalPrice()�� ȣ���ϸ� �θ� Ŭ������ Adding���� ����.
		// �ٵ�, �θ��� getTotalPrice�� base.getTotalPrice()��.
		// ������ Beverage�� ���������� ������ BaseŬ������ Beverage ��ü�̹Ƿ�,
		// base.getTotalPrice()�� �׻� Base�� �����θ� ���ƴٰ� ���ƿ´�.
		// ���ڷ����� �̹Ƿ� ��� ��������� ȣ���� ��.
		// �׷��� static ������ ���� espressCount�� 1�� �Ѿ��
		// �ٽ� �̺κ����� ���ƿ����ν�, getTotalPrice�� 70�� �ǰ�, getAddPrice() ���� 
		// eespressoCount�� 1�� �Ѿ�Ƿ�, 70�� �ȴ�. �׷��� 70 + 70 = 140
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

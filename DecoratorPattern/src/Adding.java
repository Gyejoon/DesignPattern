
/**
 * 데코레이터 
 * @author KJY
 *
 */
public abstract class Adding implements Beverage {
	
	private Beverage base;
	
	public Adding(Beverage base) {
		this.base = base;
	}
	
	
	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}
	
	protected Beverage getBase() {
		return base;
	}
	
	
}

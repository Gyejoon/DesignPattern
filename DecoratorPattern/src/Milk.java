
public class Milk extends Adding {

	public Milk(Beverage base) {
		super(base);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + 50;
	}
	
}
package c15.toy;

public class ToyPriceInfo {
	private String name;
	private int price;
	public ToyPriceInfo(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "ToyPriceInfo [name=" + name + ", price=" + price + "]";
	}

}

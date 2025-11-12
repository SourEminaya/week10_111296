package week10_111296;

public class Barang {
	protected String name;
	protected int price;
	protected int stock;
	public Barang(String name, int price, int stock) {
		this.name=name;
		this.price=price;
		this.stock=stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}

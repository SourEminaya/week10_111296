package week10_111296;

public class Handphone extends Barang {
	private String warna;
	public Handphone(String name, int price, int stock, String warna) {
		super(name,price,stock);
		this.warna=warna;
	}
	public String getWarna() {
		return warna;
	}
	public void setWarna(String warna) {
		this.warna = warna;
	}
	

}

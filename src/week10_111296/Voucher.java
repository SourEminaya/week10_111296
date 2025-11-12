package week10_111296;

public class Voucher extends Barang {
	private float ppn;
	public Voucher(String name, int price, int stock, float ppn) {
		super(name,price,stock);
		this.ppn=ppn;
	}
	public float getPpn() {
		return ppn;
	}
	public void setPpn(float ppn) {
		this.ppn = ppn;
	}
	

}

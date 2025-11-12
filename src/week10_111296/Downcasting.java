package week10_111296;

public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CEO c= new CEO();
		Pekerja p= new CEO();
		c=(CEO)p;
		c.tanyaPendapatan();
	}

}

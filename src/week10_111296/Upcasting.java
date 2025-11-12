package week10_111296;

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pekerja pekerja= new Pekerja();
		pekerja.tanyaIdentitas();
		pekerja= new CEO();
		pekerja.tanyaIdentitas();
		
		Karyawan karyawan= new Karyawan();
		pekerja=(Karyawan)karyawan;
		pekerja.tanyaIdentitas();

	}

}

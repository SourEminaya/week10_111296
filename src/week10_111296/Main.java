package week10_111296;
import java.util.*;
public class Main {


	public static void main(String[] args) {
		ArrayList<Barang> list= new ArrayList<Barang>();
		Scanner sc = new Scanner(System.in);
		int choice;
		boolean checker;
		String name;
		int harga;
		int stok;
		String warna;
		float ppn;
		
		System.out.println("Menu Barang\n1. Display barang\n2. Beli barang\n3. Add barang baru");
		choice= sc.nextInt();
		sc.hasNextLine();
		switch(choice) {
		case 1:
			for (Barang i: list) {
				System.out.println("Nama: "+ i.getName()+ "\nHarga: "+i.getPrice()+ "\nStok: "+i.getStock());
				if(i instanceof Handphone) {
					Handphone i2 = (Handphone) i;
					System.out.println("Warna: "+i2.getWarna());
				} else {
					if (i instanceof Voucher) {
						Voucher i3=(Voucher)i;
						System.out.println("PPN: "+i3.getPpn());
					}
				}
				
			}
			break;
		case 2:
			
		do {
			System.out.println("Voucher/Handphone (1/2)");
			choice=sc.nextInt();
			sc.nextLine();
			checker=true;
			if(choice!=1) {
				if (choice!=2) {
					checker=false;
				}
			}
		} while (checker==false);
		switch(choice) {
		case 1:
			System.out.println("Nama: ");
			name=sc.nextLine();
			System.out.println("Harga: ");
			harga=sc.nextInt();
			System.out.println("Stok: ");
			stok=sc.nextInt();
			sc.nextLine();
			System.out.println("Warna: ");
			warna=sc.nextLine();
			Barang newPhone= new Handphone(name,harga,stok,warna);
			list.add(newPhone);
			break;
		case 2:
			System.out.println("Nama: ");
			name=sc.nextLine();
			System.out.println("Harga: ");
			harga=sc.nextInt();
			System.out.println("Stok: ");
			stok=sc.nextInt();
			System.out.println("PPN: ");
			ppn=sc.nextFloat();
			Barang newVoucher= new Voucher(name,harga,stok,ppn);
			
			list.add(newVoucher);
			break;
		}
		
		}
	}

}

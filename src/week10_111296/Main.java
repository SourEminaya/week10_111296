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
		boolean mainChecker=false;
		int jumlah;
		float total;
		int newStok;
		do {
		System.out.println("Menu Barang\n1. Display barang\n2. Add barang baru\n3. Beli Barang\n4. Berhenti");
		choice= sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			mainChecker=true;
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
		mainChecker=true;
		do {
			System.out.println("Handphone/Voucher(1/2)");
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
			Voucher newVoucher= new Voucher(name,harga,stok,ppn);
			Barang addVoucher = newVoucher;
			list.add(addVoucher);
			break;
		}
		break;
		case 3:
			mainChecker=true;
			System.out.println("Pilih barang yang dibeli (1.Voucher/2.Handphone)");
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
			int counter=0;
			boolean counterChecker=false;
			int beli;
			switch(choice) {
			case 1:
				for (Barang i: list) {

					counter++;
					if(i instanceof Voucher) {
						Voucher i2= (Voucher) i;
						System.out.println(counter+"\n\n"+"Voucher: "+i2.getName()+"\nHarga: "+i2.getPrice()+"\nStok: "+i2.getStock()+"\nPPN: "+i2.getPpn());
						counterChecker=true;
					}
					if (counterChecker==true) {
					do {
					System.out.println("Silahkan pilih index yang ingin dibeli.");

					beli=sc.nextInt();
					sc.nextLine();
					}while ( beli<0 || beli>counter);
					beli-=1;
					Barang accessPoint= list.get(beli);
					if (accessPoint instanceof Voucher) {
						Voucher ap2=(Voucher) accessPoint;
						do {
						System.out.println("Stock: "+ap2.getStock()+"\nMasukkan jumlah yang mau dibeli.");
						jumlah=sc.nextInt();
						sc.nextLine();
						total=(jumlah)*(1+ap2.getPpn())*ap2.getPrice();
						}while(jumlah<0||jumlah>ap2.getStock());
						System.out.println("Total: "+total+"rb\nJumlah yang dibeli: "+jumlah+"\nPembayaran selesai");
						newStok=ap2.getStock()-jumlah;
						ap2.setStock(newStok);
						accessPoint= (Barang)ap2;
						list.set(beli, accessPoint);
					}else System.out.println("Barang bukanlah Voucher");
					}else System.out.println("Tidak ada voucher di list");
				}break;
			case 2:
				for (Barang i: list) {

					counter++;
					if(i instanceof Handphone) {
						Handphone i2= (Handphone) i;
						System.out.println(counter+"\n\n"+"Handphone: "+i2.getName()+"\nHarga: "+i2.getPrice()+"\nStok: "+i2.getStock()+"\n:Warna: "+i2.getWarna());
						counterChecker=true;
					}
					if (counterChecker==true) {
					do {
					System.out.println("Silahkan pilih index yang ingin dibeli.");

					beli=sc.nextInt();
					sc.nextLine();
					}while ( beli<0 || beli>counter);
					beli-=1;
					Barang accessPoint= list.get(beli);
					if (accessPoint instanceof Handphone) {
						Handphone ap2=(Handphone) accessPoint;
						do {
						System.out.println("Stock: "+ap2.getStock()+"\nMasukkan jumlah yang mau dibeli.");
						jumlah=sc.nextInt();
						sc.nextLine();
						total=(jumlah)*ap2.getPrice();
						}while(jumlah<0||jumlah>ap2.getStock());
						System.out.println("Total: "+total+"rb\nJumlah yang dibeli: "+jumlah+"\nPembayaran selesai");
						newStok=ap2.getStock()-jumlah;
						ap2.setStock(newStok);
						accessPoint= (Barang)ap2;
						list.set(beli, accessPoint);
					}else System.out.println("Barang bukanlah handphone");
					}else System.out.println("Tidak ada handphone di list");
				}
			}
			
		
		
		}
	} while (mainChecker==true);
	}

}

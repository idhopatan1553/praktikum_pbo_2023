package praktikum5;
import java.util.Scanner;

public class TestHewan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String namaKucing, warnaKucing;
		int beratKucing;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nama Kucing ");
//		nextLine biar bisa pake spasi
		namaKucing = input.nextLine();
		
		System.out.print("warna Kucing ");
		warnaKucing = input.nextLine();
		
		System.out.print("berat Kucing ");
		beratKucing = input.nextInt();
		
		Cat kucingSaya = new Cat();	
		kucingSaya.identitas(namaKucing,warnaKucing,beratKucing);
//		kucingSaya.identitas(namaKucing,"putih", 2);
//		Cat Kucing = new Cat("Xiro"); (by sistem)
		System.out.println("\nKucing "+ kucingSaya.name
				+ " Warnanya " +kucingSaya.ambilWarna()
				+ " beratnya " +kucingSaya.ambilBerat() +"kg");
		kucingSaya.eat();
	}

}

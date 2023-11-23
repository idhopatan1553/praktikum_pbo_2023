package praktikum3;

import java.util.Scanner;

public class Latihan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		inisialisasi
		Scanner input = new Scanner(System.in);
		int angka1, angka2, hasil, perhitungan, perulangan;
//		perulangnFOR	
		System.out.print("Masukan Perulangan : " );
		perulangan = input.nextInt();
			for(int i=1; i<=perulangan; i++) {
				System.out.println("\nPerulangan ke-" + i );
//		input user
		System.out.print("Masukan angka 1 :  ");
		angka1 = input.nextInt();
		System.out.print("Masukan angka 2 :  ");
		angka2 = input.nextInt();
//		input perhitungan
		System.out.print("\nList perhitungan : \n"
				+ "1 Pertambahan\n"
				+ "2 Pengurangan\n"
				+ "3 Pembagian\n"
				+ "4 Perkalian\n"
				+ "Masukan Angka : ");
		perhitungan = input.nextInt();
		//PengkondisisanIF
				if(perhitungan == 1) {
					hasil = angka1 + angka2;
					System.out.println("Hasilnya adalah :  " + hasil);
				} else if (perhitungan == 2) {
					hasil = angka1 - angka2;
					System.out.println("Hasilnya adalah :  " + hasil);
				} else if (perhitungan == 3) {
					hasil = angka1 / angka2;
					System.out.println("Hasilnya adalah :  " + hasil);
				} else if (perhitungan == 4) {
					hasil = angka1 * angka2;
					System.out.println("Hasilnya adalah :  " + hasil);
				}
			}
	}

}

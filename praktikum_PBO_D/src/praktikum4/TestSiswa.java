package praktikum4;
import java.util.Scanner;

public class TestSiswa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		String nama;
		int npm;
		
		System.out.print("Masukan Nama : ");
		nama = input.next();
		System.out.print("Masukan Npm : ");
		npm = input.nextInt();
		
		Siswa anak = new Siswa();
		anak.setNama(nama);
		anak.setNpm(npm);
		
		System.out.print("\nNpm Mahasiswa  : " + anak.npm 
						+ "\nNama Mahasiswa : " + anak.nama);
	}

}

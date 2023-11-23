package Pengkondisian;
import java.util.Scanner;

public class If_Function {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// Inisialisasi
				int angka; 
				Scanner input = new Scanner(System.in);
				
				System.out.print("Masukan Angka = ");
				angka = input.nextInt();
						
				// Pengkondisian
				if (angka > 5) {
					System.out.print("Angka yang anda masukan lebih dari 5");
				} else {
					System.out.print("Angka yang anda masukan kurang dari 5");
				}
				

	}

}

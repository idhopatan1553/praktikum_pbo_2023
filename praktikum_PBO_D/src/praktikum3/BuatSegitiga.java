package praktikum3;
import java.util.Scanner;

public class BuatSegitiga {
	public static int inputdata() {
		int data;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan angka : ");
		data =input.nextInt();	
		return data;
	}
	public static void buatsegitiga(int ulang) {
		for(int i = 1; i <=ulang; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("patan ");
			}
			System.out.println(" ");
		}
				
	}
	public static void main(String[] args) {
		int ulang = inputdata();
		buatsegitiga(ulang);
		System.out.println("tinggi segitiga = " +ulang);
	}

}

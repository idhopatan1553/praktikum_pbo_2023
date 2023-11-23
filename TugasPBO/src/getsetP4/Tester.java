package getsetP4;

public class Tester {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Persegi persegi = new Persegi();
	        double sisi = 5.0;

	        persegi.setSisi(sisi);
	        double keliling1 = persegi.hitungKeliling();
	        double luas1 = persegi.hitungLuas();
	        
	        System.out.println("Luas dan Keliling Persegi");
	        System.out.println("Keliling Persegi : " + keliling1);
	        System.out.println("Luas Persegi     : " + luas1);
	     
	        PersegiPanjang persegiPanjang = new PersegiPanjang();
	        double panjang = 5.0;
	        double lebar = 3.0;

	        persegiPanjang.setPanjang(panjang);
	        persegiPanjang.setLebar(lebar);
	        double keliling2 = persegiPanjang.hitungKeliling();
	        double luas2 = persegiPanjang.hitungLuas();
	        
	        System.out.println("\nLuas dan Keliling Persegi Panjang");
	        System.out.println("Keliling Persegi Panjang : " + keliling2);
	        System.out.println("Luas Persegi Panjang     : " + luas2);
	    }
}
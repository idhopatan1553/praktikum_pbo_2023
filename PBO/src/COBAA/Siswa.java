package COBAA;

public class Siswa {
	 // Atribut
	 public String nama;
	 public String jurusan;
	 public int nrp;

	 // Konstruktor
	 public Siswa() {nama = ""; jurusan = ""; nrp = 0;}
	 public void setNama(String namasiswa) {this.nama = namasiswa;}
	 public void setJurusan(String jurusansiswa) {this.jurusan = jurusansiswa; }
	 public void setNrp(int nrpsiswa) {this.nrp = nrpsiswa;}
	 
	 public static void main(String[] args) {
	     // Buat objek
	     Siswa siswa0 = new Siswa();
	     Siswa siswa1 = new Siswa();

	     // set buat atur info
	     siswa0.setNama("Cita");
	     siswa0.setJurusan("Telkom");
	     siswa0.setNrp(7206);

	     // set buat atur info
	     siswa1.setNama("Raka");
	     siswa1.setJurusan("IT");
	     siswa1.setNrp(7306);

	     // metode info() buat nampilin info
	     siswa0.info();
	     siswa1.info();
	 }
	 //  buat menampilkan informasi mahasiswa
	 public void info() {
	     System.out.println("Nama	: " + nama);
	     System.out.println("Jurusan	: " + jurusan);
	     System.out.println("NPM	: " + nrp);
	     System.out.println();
	}
}
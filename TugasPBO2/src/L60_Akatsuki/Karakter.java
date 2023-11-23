package L60_Akatsuki;

//Kelas Manusia
public class Karakter {
 // Atribut
 private String nama;
 private String asalClan;
 private String kemampuan;
 private int umur;

 // Konstruktor
 public Karakter(String nama, String asalClan, String kemampuan, int umur) {
     this.nama = nama;
     this.asalClan = asalClan;
     this.kemampuan = kemampuan;
     this.umur = umur;
 }

//Metode get dan set untuk asalClan
public String getNama() {
   return nama;
}

public void setNama(String nama) {
   this.nama = nama;
}
 // Metode get dan set untuk asalClan
 public String getAsalClan() {
     return asalClan;
 }

 public void setAsalClan(String asalClan) {
     this.asalClan = asalClan;
 }

 // Metode get dan set untuk umur
 public int getUmur() {
     return umur;
 }

 public void setUmur(int umur) {
     this.umur = umur;
 }

 // Metode get dan set untuk kemampuan
 public String getKemampuan() {
     return kemampuan;
 }

 public void setKemampuan(String kemampuan) {
     this.kemampuan = kemampuan;
 }
}

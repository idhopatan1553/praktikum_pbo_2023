package L60_Akatsuki;

//Implementasi kelas AkatsukiMember yang merupakan pewarisan dari Manusia
public class AkatsukiMember extends Karakter {
 private String cincin;
 private String status;

 // Konstruktor dengan parameter
 public AkatsukiMember(String nama, String asalClan, String kemampuan, int umur, String cincin, String status) {
     // Memanggil konstruktor kelas induk (Manusia)
     super(nama, asalClan, kemampuan, umur);
     // Menginisialisasi atribut khusus AkatsukiMember
     this.cincin = cincin;
     this.status = status;
 }

 // Getter dan setter untuk cincin
 public String getCincin() {
     return cincin;
 }

 public void setCincin(String cincin) {
     this.cincin = cincin;
 }

 // Getter dan setter untuk status
 public String getStatus() {
     return status;
 }

 public void setStatus(String status) {
     this.status = status;
 }
}

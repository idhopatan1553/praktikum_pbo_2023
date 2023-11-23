package latihanP4;
import java.util.Scanner;

public class GajiPegawai {
    // Atribut
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    // Konstruktor
    public GajiPegawai(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getNama() { return nama; }

    public void setNama(String nama) { this.nama = nama; }

    public String getAlamat() { return alamat; }

    public void setAlamat(String alamat) { this.alamat = alamat; }

    public int getUangTransport() { return uangTransport; }
    
    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;}

    public int getUangTunjangan() { return uangTunjangan; }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() { return gajiPokok; }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Metode untuk menghitung total gaji
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok) {
        return gajiPokok + uangTunjangan + uangTransport;
    }

    // Metode untuk menampilkan data pegawai
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji) {
    	System.out.println("       ### Data Gaji PT. KAKATU ### ");
    	System.out.println("============================================");
    	System.out.println("Nama Karyawan   : " + nama);
        System.out.println("Alamat 		: " + alamat);
        System.out.println("Uang Transport  : Rp. " + uangTransport);
        System.out.println("Uang Tunjangan  : Rp. " + uangTunjangan);
        System.out.println("Gaji Pokok      : Rp. " + gajiPokok);
        System.out.println("TOTAL GAJI      : Rp. " + totalGaji);
    }

    public static void main(String[] args) {
        // Membuat objek GajiPegawai
        GajiPegawai pegawai = new GajiPegawai("Rizki Adam Kuriawan", "Jalan Semar dlm 4 No.72/66");

        // Mengisi atribut-atribut
        pegawai.setUangTunjangan(300000);
        pegawai.setUangTransport(250000);
        pegawai.setGajiPokok(4500000);

        // Menghitung total gaji
        int totalGaji = pegawai.totalGaji(pegawai.getUangTunjangan(), pegawai.getUangTransport(), pegawai.getGajiPokok());

        // Menampilkan data pegawai
        pegawai.tampilData(pegawai.getNama(), pegawai.getAlamat(), pegawai.getUangTunjangan(), pegawai.getUangTransport(), pegawai.getGajiPokok(), totalGaji);
    }
}
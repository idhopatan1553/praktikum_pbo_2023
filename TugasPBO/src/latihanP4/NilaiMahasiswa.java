package latihanP4;
import java.util.Scanner;

public class NilaiMahasiswa {
	    private double quiz;
	    private double uts;
	    private double uas;
	    private double nilaiAkhir;

	    public NilaiMahasiswa(double quiz, double uts, double uas) {
	        this.quiz = quiz;
	        this.uts = uts;
	        this.uas = uas;
	    }

	    public void hitungNilaiAkhir() {
	        nilaiAkhir = (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
	    }

	    public String tentukanIndex() {
	        if (nilaiAkhir >= 80) {
	            return "A";
	        } else if (nilaiAkhir >= 68) {
	            return "B";
	        } else if (nilaiAkhir >= 56) {
	            return "C";
	        } else if (nilaiAkhir >= 45) {
	            return "D";
	        } else {
	            return "E";
	        }
	    }

	    public String tentukanKeterangan() {
	        String index = tentukanIndex();
	        switch (index) {
	            case "A":
	                return "Sangat Baik";
	            case "B":
	                return "Baik";
	            case "C":
	                return "Cukup";
	            case "D":
	                return "Kurang";
	            case "E":
	                return "Sangat Kurang";
	            default:
	                return "Tidak Valid";
	        }
	    }

	    public static void main(String[] args) {
	        NilaiMahasiswa nilaimahasiswa = new NilaiMahasiswa (60.0, 80.0, 75.5);
	        nilaimahasiswa.hitungNilaiAkhir();

	        System.out.println("QUIZ 	 = " + nilaimahasiswa.quiz);
	        System.out.println("UTS	 = " + nilaimahasiswa.uts);
	        System.out.println("UAS	 = " + nilaimahasiswa.uas);
	        System.out.println("\nNilai Akhir = " + nilaimahasiswa.nilaiAkhir);
	        System.out.println("\nIndex	 = " + nilaimahasiswa.tentukanIndex());
	        System.out.println("Keterangan = " + nilaimahasiswa.tentukanKeterangan());
	    }
	}

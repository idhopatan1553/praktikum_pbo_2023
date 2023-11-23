package latihanP4;

public class EnergiKinetik {
    private double massa;
    private double kecepatan;

    public EnergiKinetik(double massa, double kecepatan) {
        this.massa = massa;
        this.kecepatan = kecepatan;
    }

    public double hitungEnergiKinetik() {
        return 0.5 * (massa / 1000) * (kecepatan * kecepatan);
    }

    public double hitungUsaha() {
        // Jika dimulai dari keadaan diam, usaha = energi kinetik
        return hitungEnergiKinetik();
    }

    public static void main(String[] args) {
        double massaBola = 145;
        double kecepatanBola = 25;

        EnergiKinetik bola = new EnergiKinetik(massaBola, kecepatanBola);

        double energiKinetik = bola.hitungEnergiKinetik();
        double usaha = bola.hitungUsaha();
        
        System.out.println("Sebuah Bola Diketahui \nmassa bola " + massaBola + " gram" 
        		+ "\nKecepatan Bola " + kecepatanBola + " m/s" );
        System.out.println("Energi Kinetik bola baseball: " + energiKinetik + " joule");
        System.out.println("Usaha yang dilakukan pada bola: " + usaha + " joule");
    }
}
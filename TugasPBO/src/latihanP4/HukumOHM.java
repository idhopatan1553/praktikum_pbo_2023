package latihanP4;

public class HukumOHM {
    public static void main(String[] args){
        System.out.println("=====Hukum OHM=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat \npenghantar akan berbanding lurus dengan \nbeda potensial pada ujung-ujung kawat \npenghantar tersebut asalkan suhu kawat dijaga \nkonstan.\n");

        Baterai baterai1 = new Baterai();
        Baterai baterai2 = new Baterai(3.0f, 12.0f);

        System.out.println("Kuat Arus: " + baterai2.getKuatArus() + " ampere");
        System.out.println("Hambatan: "+ baterai2.getHambatan() + " ohm" );
        System.out.println("Hasil Tegangan: "+ baterai2.hitungTegangan() + " volt");
    }
}
class Baterai{
    private float kuatArus;
    private float hambatan;

    public Baterai(){
        this.kuatArus = 0.0f;
        this.hambatan = 0.0f;
    }

    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
     
    public float getKuatArus(){
        return kuatArus;
    }

    public float getHambatan(){
        return hambatan;
    }

    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
}
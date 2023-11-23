package praktikum5;
//inheritance (pewarisan)
//dan Visibility

public abstract class Hewan {
	protected static String name;
	protected abstract void eat();
}
class Cat extends Hewan {
	String warna;
	int berat;
//	inheritance
//	menambahkan identitas
	public void identitas (String namaKucing,
			String warnaKucing,
			int beratKucing) {
		Cat.name = namaKucing;	
		warna = warnaKucing;
		berat = beratKucing;
	}
//	mengetest
	public void eat() {
		System.out.print(Cat.name + " suka Makan Whiskas");
	}
//	visibility
	String ambilNama() {
		return Cat.name;
	}
	String ambilWarna() {
		return warna;
	}
	int ambilBerat() {
		return berat;
	}
}
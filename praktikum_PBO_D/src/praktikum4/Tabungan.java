package praktikum4;

public class Tabungan {
		public int saldo;
		public Tabungan(int initSaldo) {
			saldo=initSaldo;
		}
		public void ambiluang(int jumlah) {
			saldo = saldo - jumlah;
		}

	}
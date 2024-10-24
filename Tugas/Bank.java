package Tugas;

class Tabungan {
    protected double saldo;

    public Tabungan(double saldo) {
        this.saldo = saldo;
    }
}

class PenyimpananUang extends Tabungan {
    private double tingkatBunga;

    public PenyimpananUang(int saldo, double tingkatBunga) {
        super(saldo);
        this.tingkatBunga = tingkatBunga;
    }

    public double hitungBunga() {
        return saldo * tingkatBunga;
    }

    public double cekUang() {
        return saldo;
    }
}

public class Bank {
    //disinimi mainnya, buatki objek dsni bang
    public static void main(String[] args) {
        PenyimpananUang penyimpananUang = new PenyimpananUang(1000, 0.05);
        System.out.println("Saldo: " +penyimpananUang.cekUang());
        System.out.println("Bunga: " + penyimpananUang.hitungBunga()); //tambah tambah saja untuk hitung bunga
    }
}

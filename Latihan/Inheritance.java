package Latihan;

class Orang {
    String nama;
    int usia;
    int tb;

    public Orang(String nama, int usia, int tb) {
        this.nama = nama;
        this.usia = usia;
        this.tb = tb;
    }

    public void perkenalkanDiri() {
        System.out.println(
                "Halo, nama saya " + nama + ", saya berusia " + usia + " tahun. Tingga saya yaitu " + tb + " cm");
    }
}

class Mahasiswa extends Orang {
    int nim;
    double ipkSemester;

    public Mahasiswa(String nama, int usia, int tb, int nim, double ipkSemester) {
        super(nama, usia, tb);
        this.nim = nim;
        this.ipkSemester = ipkSemester;
    }

    @Override
    public void perkenalkanDiri() {
        super.perkenalkanDiri();
        System.out.println("Saya adalah mahasiswa dengan NIM " + nim + ", dan memiliki IPK " + ipkSemester);
    }

    public void belajar() {
        System.out.println("Saya sedang belajar");
    }
}

class Pegawai extends Orang {
    String jabatanKaryawan;

    public Pegawai(String nama, int usia, int tb, String jabatanKaryawan) {
        super(nama, usia, tb);
        this.jabatanKaryawan = jabatanKaryawan;
    }

    @Override
    public void perkenalkanDiri() {
        super.perkenalkanDiri();
        System.out.println("Saya adalah pegawai dengan jabatan " + jabatanKaryawan);
    }

    public void kerja() {
        System.out.println("Saya sedang kerja");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // buatmi objeknya disini
        Mahasiswa mahasiswa = new Mahasiswa("Raffi Fadlika", 18, 165, 42623002, 3.98);
        Pegawai pegawai = new Pegawai("Raffi Fadlika", 18, 165, "Fullstack Dev.");

        System.out.println("Perkenalan Mahasiswa : ");
        mahasiswa.perkenalkanDiri();
        mahasiswa.belajar();

        System.out.println("Perkenalan Pegawai : ");
        pegawai.perkenalkanDiri();
        pegawai.kerja();
    }
}

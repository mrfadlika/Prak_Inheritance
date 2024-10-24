package Latihan;

class Orang {
    String nama;
    int usia;
    int tb;
    int bb;

    public Orang(String nama, int usia, int tb, int bb) {
        this.nama = nama;
        this.usia = usia;
        this.tb = tb;
        this.bb = bb;
    }

    public void perkenalkanDiri() {
        System.out.println(
                "Halo, nama saya " + nama + ", saya berusia " + usia + " tahun. Tingga saya yaitu " + tb + " cm dan berat saya " + bb + " kg");
    }
}

class Mahasiswa extends Orang {
    int nim;
    double ipkSemester;

    public Mahasiswa(String nama, int usia, int tb, int bb, int nim, double ipkSemester) {
        super(nama, usia, tb, bb);
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

class Dosen extends Orang {
    String jabatanDosen;

    public Dosen(String nama, int usia, int tb, int bb, String jabatanDosen) {
        super(nama, usia, tb, bb);
        this.jabatanDosen = jabatanDosen;
    }

    @Override
    public void perkenalkanDiri() {
        super.perkenalkanDiri();
        System.out.println("Saya adalah Dosen dengan jabatan " + jabatanDosen);
    }

    public void kerja() {
        System.out.println("Saya sedang kerja");
    }
}

class Staff extends Orang {
    String jabatanStaff;

    public Staff(String nama, int usia, int tb, int bb, String jabatanStaff) {
        super(nama, usia, tb, bb);
        this.jabatanStaff = jabatanStaff;
    }

    @Override
    public void perkenalkanDiri() {
        super.perkenalkanDiri();
        System.out.println("Saya adalah Staff dengan jabatan " + jabatanStaff);
    }

    public void kerja() {
        System.out.println("Saya sedang kerja");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // buatmi objeknya disini
        Mahasiswa mahasiswa = new Mahasiswa("Raffi Fadlika", 18, 165, 45, 42623002, 3.98);
        Dosen dosen = new Dosen("Andrew Sigma", 90, 165, 20, "Dosen Gado Gado");
        Staff staff = new Staff("Mayersi Putra", 101, 10, 5,  "Officer Boy");

        System.out.println("Perkenalan Mahasiswa : ");
        mahasiswa.perkenalkanDiri();
        mahasiswa.belajar();

        System.out.println("Perkenalan Dosen : ");
        dosen.perkenalkanDiri();
        dosen.kerja();

        System.out.println("Perkenalan Staff : ");
        staff.perkenalkanDiri();
        staff.kerja();
    }
}

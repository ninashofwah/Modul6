package universitas;
import java.util.ArrayList;

public class ManajemenMahasiswa {
    ArrayList<Mahasiswa> daftarMahasiswa;
    
    public ManajemenMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void tampilkanSemua() {
        System.out.println("=== Daftar Mahasiswa ===");
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanData();
        }
    }
    
    public void tampilkanIPKTertinggi() {
        Mahasiswa IPKtertinggi = daftarMahasiswa.get(0);

        for(Mahasiswa m : daftarMahasiswa) {
            if (m.getIPK() > IPKtertinggi.getIPK()) {
                IPKtertinggi = m;
            }
        }
        System.out.println("=== Mahasiswa dengan IPK Tertinggi ===");
        IPKtertinggi.tampilkanData();

    }
}
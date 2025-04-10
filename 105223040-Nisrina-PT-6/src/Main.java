import universitas.Mahasiswa;
import universitas.ManajemenMahasiswa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ManajemenMahasiswa mene = new ManajemenMahasiswa();
        
        int pilihan;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa dengan IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM : ");
                    String NIM = input.nextLine();
                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = input.nextLine();
                    System.out.print("IPK : ");
                    double IPK = input.nextDouble();
                    input.nextLine();

                    Mahasiswa mhs = new Mahasiswa(NIM, nama, prodi, IPK);
                    mene.tambahMahasiswa(mhs);
                    break;
                
                case 2:
                    mene.tampilkanSemua();
                    break;

                case 3:
                    mene.tampilkanIPKTertinggi();
                    break;

                case 4:
                    System.out.println("Terima kasih");

                default:
                    System.out.println("Pilihan tidak valid");

            }
        } while(pilihan != 4);
    }
}

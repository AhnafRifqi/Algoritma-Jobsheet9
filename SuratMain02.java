import java.util.Scanner;

public class SuratMain02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackSurat02 stackSurat = new StackSurat02(10); // Misalnya, kapasitas stack 10
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Lihat Semua Surat Izin");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data surat izin:");
                    System.out.print("ID Surat: ");
                    String idSurat = scanner.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scanner.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scanner.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = scanner.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scanner.nextInt();
                    scanner.nextLine();

                    PraktikumSurat02 surat = new PraktikumSurat02(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stackSurat.push(surat);
                    System.out.println("Surat izin berhasil ditambahkan.");
                    break;

                case 2:
                    PraktikumSurat02 suratDiproses = stackSurat.pop();
                    if (suratDiproses != null) {
                        System.out.println("Memproses surat izin dari: " + suratDiproses.namaMahasiswa);
                        // Tambah logika pemrosesan surat jika perlu
                    }
                    break;

                case 3:
                    PraktikumSurat02 suratTerakhir = stackSurat.peek();
                    if (suratTerakhir != null) {
                        System.out.println("Surat izin terakhir: " + suratTerakhir.namaMahasiswa);
                    }
                    break;

                case 4:
                    stackSurat.print();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
import java.util.Scanner;
public class MahasiswaDemo14 {
    public static void main(String[] args) {
        int pilih;
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa14 stack = new StackTugasMahasiswa14(5);

        do{
            System.out.println("\nmenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Daftar Tugas terbawah");
            System.out.println("6. Melihat jumlah Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                System.out.print("NIM: ");
                String nim = scan.nextLine();
                System.out.print("Kelas: ");
                String kelas = scan.nextLine();
                Mahasiswa14 mhs = new Mahasiswa14(nama, nim, kelas);
                stack.push(mhs);
                System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                break;
                case 2:
                Mahasiswa14 dinilai = stack.pop();
                if(dinilai != null) {
                    System.out.println("Menilai tugas dari " + dinilai.nama);
                    System.out.println("Masukkan nilai (0 - 100): ");
                    int nilai = scan.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                }
                break;
                case 3:
                Mahasiswa14 lihat = stack.peek();
                if(lihat != null) {
                    System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                }
                break;
                case 4:
                System.out.println("Daftar semua tugas");
                stack.print();
                break;
                case 5:
                Mahasiswa14 bawah = stack.bawah();
                if(bawah != null) {
                    System.out.println("Tugas pertama diKumpulkan " +bawah.nama);
                }
                break;
                case 6:
                int jumlah = stack.jumlah();
                System.out.println("Jumlah Tugas: "+jumlah);
                break;
                default:
                System.out.println("Pilihan tidak valid.");
            }
        }while (pilih >= 1 && pilih <= 6);
    }
}

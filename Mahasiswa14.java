public class Mahasiswa14 {
String nim;
String kelas;
String nama;
int nilai;
    Mahasiswa14(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }
    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
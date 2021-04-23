package UTS;
public class absensi {
    private String nama;
    private String kelas;
    private int nim;
    private String ket;
    public absensi() {
        nama = "";
        kelas = "";
        nim = 0;
        ket = "";
    }
    public absensi(absensi a) {
        nama = a.getNama();
        kelas = a.getKelas();
        nim = a.getNim();
        ket = a.getKet();
    }
    public absensi(String nama_mhs, String kelas_mhs, int nim_mhs, String kehadiran) {
        nama = nama_mhs;
        kelas = kelas_mhs;
        nim = nim_mhs;
        ket = kehadiran;
    }
    public void setNama(String nama_mhs) {
        nama = nama_mhs;
    }
    public void setKelas(String kelas_mhs) {
        kelas = kelas_mhs;
    }
    public void setNim(int nim_mhs) {
        nim = nim_mhs;
    }
    public void setKet(String kehadiran) {
        ket = kehadiran;
    }
    public String getNama() {
        return nama;
    }
    public String getKelas() {
        return kelas;
    }
    public int getNim() {
        return nim;
    }
    public String getKet() {
        return ket;
    }
    @Override
    public String toString() {
        return ("\n Nama Mahasiswa : " + nama + 
                "\n Kelas Mahasiswa : " + kelas + 
                "\n Nim Mahasiswa : " + nim + 
                "\n Keterangan Mahasiswa : " + ket);
    }
}
class absen {
    public static void main(String[] args) {
        System.out.println("-----Absensi Data Mahasiswa-----");
        absensi a1 = new absensi("Razaq","TI2C",1957301015,"Hadir");
        absensi a2 = new absensi("Razaq","TI2C",1957301015,"Alpa");
        System.out.println(a1.toString());
        System.out.println(a2.toString());

    }
}

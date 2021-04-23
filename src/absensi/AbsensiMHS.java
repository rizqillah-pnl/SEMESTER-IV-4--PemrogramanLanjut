package absensi;
import java.util.*;

class absenMHS{
    private String nama;
    private int nim;
   
    public String ambilnama(){
        return nama;
    }
    
    public int ambilnim(){
        return nim;
    }
    
    public void aturnama(String nama){
        this.nama = nama;
    }
    
    public void aturnim(int nim){
        this.nim = nim;
    }
    
    public absenMHS(String nama, int nim){
        aturnama(nama);
        aturnim(nim);
    }

    public void print() {
        System.out.println("Nama\t: " + nama + "\nNIM\t: " + nim + "\n");
    }
}

class proses{
    Scanner nisa = new Scanner(System.in);
    ArrayList MHS = new ArrayList();
    
    void tambahorang(){
        String nama = "";
        int nim;
        
        System.out.print("Nama : ");
        nama = nisa.nextLine();
        System.out.print("NIM : ");
        nim = nisa.nextInt();
        nisa.nextLine();
        absenMHS mhs = new absenMHS(nama, nim);
        this.MHS.add(mhs);
    }
        
    void tampilkanMHS(){
        System.out.println("DATA SEMUA MAHASISWA/I");
        for (int i=0; i<MHS.size(); i++){
            absenMHS m = (absenMHS) MHS.get(i);
            m.print();
        }
    }
}

public class AbsensiMHS {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        proses proses = new proses();
        int pilih;
        boolean ulang = true;
        while (ulang) {
            System.out.print("Pilihan Anda :\n1.Tambah Data\n2.Tampilkan Data\n3.Exit\nInput anda : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    proses.tambahorang();
                    break;
                case 2:
                    proses.tampilkanMHS();
                    break;
                case 3:
                    ulang = false;
                    break;
                default:
                    System.out.println("Inputan Salah!");
                    break;
            }
        }
        System.out.println("Terima Kasih Banyak!");
    }
}

package absensi;
import java.util.*;
class absensiMahasiswa {
    private String nama,nim;
    private int hadir,noAbsen;
    
    public void setNamaMhs(String nama) {
        this.nama = nama;
    }
    public void setNimMhs(String nim) {
        this.nim = nim;
    }
    public void setHadirMhs(int hadir) {
        this.hadir = hadir;
    }
    public void setNoAbsenMhs(int noAbsen) {
        this.noAbsen = noAbsen;
    }
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public int getKehadiran() {
        return hadir;
    }
    public int getNoAbsen() {
        return noAbsen;
    }
    public absensiMahasiswa(String nama,String nim,int hadir,int noAbsen) {
       setNamaMhs(nama);
       setNimMhs(nim);
       setHadirMhs(hadir);
       setNoAbsenMhs(noAbsen);
    }
    public void cetak(){
        String data;
        if (hadir == 1){
            data = "Hadir";
        }else if(hadir == 2){
            data = "Sakit";
        }else{
            data = "Tanpa Keterangan";
        }
        System.out.println("---------------------");
        System.out.println("\nNo :"+noAbsen+
                           "\nNama : "+nama+
                           "\nNim : "+nim+
                           "\nKehadiran : "+data+"\n");
        System.out.println("---------------------");
    }
}
class absen {
    LinkedList mahasiswa = new LinkedList();
    Scanner masukkan = new Scanner(System.in);
    public void addMahasiswa(int noAbsen){
        String nama,nim;
        int hadir;
        System.out.println("---------------------");
        System.out.print("Masukkan Nama Mahasiswa : ");
        nama = masukkan.nextLine();
        System.out.print("Masukkan Nim Mahasiswa : ");
        nim = masukkan.next();
        System.out.print("\n1.Hadir\n2.Sakit\n.3Tanpa Keterangan\nPilih Keterangan");
        hadir = masukkan.nextInt();
        masukkan.nextLine();
        System.out.print("---------------------");
        
        absensiMahasiswa mahasiswa = new absensiMahasiswa(nama,nim,hadir,noAbsen);
        this.mahasiswa.add(mahasiswa);
    }
        public void remove(){
            mahasiswa.removeLast();
        }
        public void tampilkan(){
            for (int i = 0;i<mahasiswa.size();i++){
                absensiMahasiswa x = (absensiMahasiswa) mahasiswa.get(i);
                x.cetak();
            }
        }
}

        

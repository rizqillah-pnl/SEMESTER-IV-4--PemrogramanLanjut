/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArgumentsCommandLine;
import java.io.*;

public class UbahFile {
    public UbahFile(String sumber, String tujuan) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(sumber);
        } catch (FileNotFoundException ex) {
            System.out.println("File Tidak Ditemukan!");
        }

        try {
            char data;
            int temp;
            FileOutputStream fos = new FileOutputStream(tujuan);
            do {
                temp = fis.read();
                data = (char) temp;
                if (temp != -1) {
                    try {
                        if ((char) temp == ' ') {
                            data = '_';
                            fos.write(data);
                        } else {
                            fos.write(data);
                        }
                    } catch (FileNotFoundException ex) {
                        System.out.println("File tidak dapat Dibuka dan Ditulis!");
                    }
                }
            } while (temp != -1);
            System.out.println("Berhasil menyimpan pada file " + tujuan);

        } catch (IOException ex) {
            System.out.println("Masalah terjadi selama proses membaca!");
        }
    }

    public static void main(String args[]) throws IOException {
        System.out.println("Nama File sumber beserta Extensi ?");
        String sumber;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sumber = br.readLine();
        System.out.println("Mencoba membaca File " + sumber + "...");
        System.out.println("Nama File tujuan yang akan disimpan ?");
        String tujuan;
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        tujuan = bd.readLine();
        System.out.println("Mencoba Menulis pada File " + tujuan + "...");
        new UbahFile(sumber, tujuan);

    }
}

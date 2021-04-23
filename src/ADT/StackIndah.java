package ADT;
import static java.time.Instant.MAX;

//kelas stack dgn 3fil
public class StackIndah {

    private String[] data;
    private int max;
    private int top;

    public StackIndah(int size) { //parameternya inputnya int size
        max = size; //inisialisasi nilai max dari class stack = size
        data = new String[max]; //insialiasi array objectnya arraynya data array = new string dgn sizenya max 
        top = -1; //mula-mula top ini bermulai dari -1 (mengindikasikan bahwa stack sedang dlm keadaan kosong)
    }

    //memasukan data ke stack dgn menggunakan method push()
    public boolean push(String value) {
        boolean result = false;
        top++; //lalukan increment pd file top
        if (top < max) { // jika top<max 
            data[top] = value; // maka data pd index data[top] = value
            result = true; // kemudian result rubah menjadi true
        }else {
            top--;
        }
        return result; // jadi dia akan menghasilkan return valuenya adalah true 
    }

    //mengeluarkan data dari stack dgn menggunakan method pop() /ada decrement setelah dia kembalikan outputnya -
    //pake decrement 
    public String pop() {
        String result = null;
        if (top >= 0) { //jika top>=0 maka set variabel result=data[top]
            /*jadi jika hanya bs mengeluarkan data ketika indexnya top nya >=0 kalo indexnya 
            bernilai -1 datanya kosong dia tdk dpt menampilkan data krna indikasinya top nya -1 dia kosong*/
            result = data[top];
            /*jika top>=0 maka kembalikan result = data[top] kemudian lakukan
            decrement pd variabel top, jadi setelah kita keluarkan nilainya kita decrement*/
            top--; //decrement
        }
        return result; //kemudian kembalikan variabel result sebagai output method pop()
    }

    //melihat data teratas di stack menggunakan method peek() /setelah dia kembalikan outputnya tidak ada 
    //decrement, index top tetap tdk berubah 
    public String peek() {
        String result = null;
        if (top >= 0) { //jika top>=0 maka set variabel result=data[top]
            result = data[top];
        }
        return result; //kembalikan variabel result sebagai output method peek()
    }

    //memeriksa apakah STACK = kosong menggunakan method isEmpty()
    public boolean isEmpty() {
        boolean result = false; //jika top>=0 maka return FALSE (kebalikan dari top<0)
        if (top < 0) {
            //jika top<0 maka return TRUE (pd saat(top<0) stack dalam kosong jika stack dalam keadaan kosong maka 
            //method ini mengembalikan nilai TRUE
            result = true;
        }
        return result;
    }

    //memeriksa apakah STACK = full menggunakan method isFull()
    public boolean isFull() {
        boolean result = false;//mula mula bernilai false
        if (top >=max-1) {
            //jika top>=MAX-1 maka return TRUE (jadi kalo top nya sudah sampai di >=MAX-1
            //knp MAX-1? karena di index pertama itu yg digunakan 0 jd index terakhirnya MAX-1
            //jika dia sudah >=MAX-1 maka return top nya akan TRUE 
            result = true;
        }
        return result; //kalau belum sampai MAX-1 dia akan else return FALSE (belum terpenuhi)
        //dia akan bernilai TRUE if top nya bernilai >=MAX-1, misal : 
        //size = 8 jd dia akan bernilai TRUE ketika top nya itu bernilai 7 krna 8-1 = 7
        //>=7 baru dia bernilai TRUE
        //jika dia sudah bernilai 7 dia dinyatakan sudah full
    }
    public void cetak() {
        System.out.print("[ ");
      if(!isEmpty()){ //&&topnya sudah diluar indexnya array >=max berarti dia tdk perlu mencetak
          //data array nya
          for (int i=0;i<=top;i++){
              System.out.print(data[i]+", ");
          }
          System.out.println("  ]");
      } 
    }

    public static void main(String[] args) {
        StackIndah stack = new StackIndah(8); //nama class stack nama object pun stack
        //stack(8) method construct, (8) ini size
        boolean result = stack.isFull();
        System.out.println("result : " + result);

        result = stack.isEmpty();
        System.out.println("result : " + result);

        result = stack.push("NURSELLA ");
        System.out.println("result : " + result);
        stack.cetak();

        result = stack.push("ALEGEBRA");
        System.out.println("result : " + result);
        stack.cetak();

        result = stack.push("INDAH");
        System.out.println("result : " + result);
        stack.cetak();

        result = stack.push("DATA STRUCTURE");
        System.out.println("result : " + result);
        stack.cetak();

        String sresult = stack.pop();
        System.out.println("result : " + sresult);
        stack.cetak();

        sresult = stack.peek();
        System.out.println("result : " + sresult);
        stack.cetak();

        result = stack.push("DATA STRUCTURE");
        System.out.println("result : " + result);
        stack.cetak();

        result = stack.push("GRAPH THEORY");
        System.out.println("result : " + result);
        stack.cetak();

        result = stack.push("REAL ANALYSIS");
        System.out.println("result : " + result);
        stack.cetak();

        result = stack.isEmpty();
        System.out.println("result : " + result);
        //stack sudah tidak dalam keadaan kosong / false

        result = stack.isFull();
        System.out.println("result : " + result);
        //masih false karna dia belum full maka dia returnnya nilai kembaliannya masih false 
        //tdk kosong tdk penuh juga dia ditengah-tengah

        result = stack.push("JAVA NETBEANS");
        System.out.println("result : " + result);
        stack.cetak();

        result = stack.push("ARMAYA");
        System.out.println("result : " + result);
        stack.cetak();

        result = stack.push("HALLO");
        System.out.println("result : " + result);
        stack.cetak();
        //dia bernilai false karna dia sudah 8 sudah full 
        //dia masuk kedalam datanya tapi dia cetak hasilnya

        result = stack.isEmpty();
        System.out.println("result : " + result);
        //stack sudah tidak dalam keadaan kosong / false

        result = stack.isFull();
        System.out.println("result : " + result);
        //true
    }
}

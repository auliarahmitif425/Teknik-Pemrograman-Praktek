import java.math.BigInteger;
import java.util.Scanner;

public class Datatypes {
    public static void main(String[]arrayString){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah angka yang ingin di uji!: ");
        int T =  sc.nextInt(); //menyimpan jumlah angka yang ingin diuji
        System.out.println("Silahkan untuk menginput angka!");

        for (int i = 0; i<T; i++){
                BigInteger n = sc.nextBigInteger(); //agar angka yang sangat besar bisa ditampung
                System.out.println(n + " can be fitted in: ");
                boolean fitted = false; //jika ada tipe data yang tidak memenuhi kriteria,
                                        // maka akan dianggap false dan diberi keterangan.
                
                //menguji angka dengan tipe byte
                if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE))>=0 &&
                    n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE))<=0) {
                    System.out.println("* Byte");
                    fitted = true;
                    }
                //menguji angka dengan tipe short
                if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE))>=0 &&
                    n.compareTo(BigInteger.valueOf(Short.MAX_VALUE))<=0){
                    System.out.println("* Short");
                    fitted = true;
                    }
                //menguji angka dengan tipe integer
                if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE))>=0 &&
                    n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))<=0){
                    System.out.println("* Integer");
                    fitted = true;
                    }
                //menguji angka dengan tipe long
                if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE))>=0 &&
                    n.compareTo(BigInteger.valueOf(Long.MAX_VALUE))<=0){
                    System.out.println("* Long");
                    fitted = true;
                    }
                    if(!fitted) { //jika tidak ada kriteria yang cocok, berikan keterangan.
                    System.out.println(n + " can't be fitted anywhere!");
                    }
                }
        sc.close();
    }   
}
    

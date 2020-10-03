package konversi;

public class main {

    public static void main(String[] args) {
        // program untuk koversi data

    int nilaiInt = 450; //32-bit
        System.out.println("nilai int = " + nilaiInt);

    // memperluas rentang ke tipe data yang besar
    long nilailong = nilaiInt;
        System.out.println("nilaiLong = " + nilailong);

    // memperluas rentang ke tipe data yang besar
    byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

    // casting pembagian
    int a = 10;
    float b = 4;

    float c = a/b;

        System.out.printf("%d / %f = %f\n",a,b,c);

    int x = 10;

   }
}


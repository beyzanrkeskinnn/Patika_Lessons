import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] dizi = new int[]{15, 2, 3, 30, 80, 6, 7, 8, 9, 10, 11};
        System.out.print("Bir değer giriniz : ");
        Scanner scan = new Scanner(System.in);
        // get index value
        int indis = scan.nextInt();

        //If an index that is not in the array is entered, the program gives an error message.
        try {
            System.out.println("İndex kontrol ediliyor. ");
            int result = getElement(dizi, indis);
            System.out.println("Tebrikler İndex değerini doğru girdiniz.");
            System.out.println("İndex elemanınız " + result);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a.getMessage());
        }
    }

    //If the index value is not in a valid range, throw ArrayIndexOutOfBoundsException and catch this exception.
    public static int getElement(int[] dizi, int indis) {
        if (indis < 0 || indis >= dizi.length) {
            throw new ArrayIndexOutOfBoundsException("Hatalı index girdiniz ! ");
        }
        return dizi[indis];
    }
}
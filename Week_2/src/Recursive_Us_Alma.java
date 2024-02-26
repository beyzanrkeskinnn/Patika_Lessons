import java.util.Scanner;

public class Recursive_Us_Alma {
    static int exponentiation(int basenumber, int us) {

        if (basenumber == 1 || us == 0) { //fonksiyonumuzun çağrılmasını durduracak şart.
            return 1;
        }

        //Taban sayıyı fonksiyon her kendini çağırdığında taban ile çarpacak ve us bir azalacak
        return basenumber * exponentiation(basenumber, us - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int basenumber, us;
        System.out.println("Tabanı gir");
        basenumber = scan.nextInt();
        System.out.println("Us'su gir :");
        us = scan.nextInt();

        System.out.println("Sonuc : " + exponentiation(basenumber, us));
    }
}

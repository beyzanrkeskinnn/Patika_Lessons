import java.util.Scanner;

public class PrimeNumberRecorsiveMetot {

    static int primeNumber(int number) {
        int sayac = 0;
        //kullanıcıdan alınan sayının i ye bölümünden kalan 0 ise  sayaç 1 artsın
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {  //sayaç 0 olduğunda asal sayısı
            System.out.println(number + " sayısı bir asal sayıdır");
        } else {
            System.out.println(number + " sayısı bir asal sayı değildir");
        }
        return sayac;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();
        primeNumber(number);


    }

}

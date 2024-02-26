import java.util.Scanner;

public class PrimeNumberRecorsiveMetot {
    static int isPrimeNumber(int number) {
        int sayac = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
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
        isPrimeNumber(number);


    }

}

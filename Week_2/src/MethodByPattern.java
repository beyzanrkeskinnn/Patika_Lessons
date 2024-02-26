import java.util.Scanner;

public class MethodByPattern {
    static int pattern(int number, boolean control, int counter) {  // Metot pattern

        // control ile girilen sayı kontrol edilir.
        if (control) {
            if (number > 0) { // number >0 olacağı için değeri true'dur.
                System.out.print(number + " ");
                counter++;
                return pattern(number - 5, true, counter);
            } else {
                return pattern(number, false, counter);
            }
        } else {
            System.out.print(number + " ");
            if (counter > 0) {
                counter--;
                return pattern(number + 5, false, counter);
            } else {
                return 0;
            }
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        System.out.println(pattern(number, true, 0));   //counter sayac değişkeni, 0'dan başlamalı
    }
}
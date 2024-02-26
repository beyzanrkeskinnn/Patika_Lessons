import java.util.Scanner;

public class MethodByPattern {

    static void pattern(int number) {
        // girilen sayı 0'dan küçük veya eşit olana kadar 5 çıkar
        System.out.print(number + " ");
        if (number <= 0) {
            return;
        }
        pattern(number - 5);
        System.out.print(number + " "); //number 0'a eşit veya küçük olduğunda ekrana yazdır

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        pattern(number);



    }
}
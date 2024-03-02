import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number;
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int min = list[0];
        int max = list[0];

        //find max values
        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        //find min values
        for (int i = 0; i < list.length; i++) {
            if (min > list[i]) {
                min = list[i];
            }
        }
        //we printed the list elements to the screen
        String liste = Arrays.toString(list);
        System.out.println("Dizi : " + liste);

        Scanner scan = new Scanner(System.in);
        System.out.println("Girilen Sayı : ");
        number = scan.nextInt();

//find the smallest and largest numbers close to the entered number
        for (int i : list) {
            if (i < number) {
                if (i >= min) {
                    min = i;
                }
            }
            if (i > number) {
                if (i <= max) {
                    max = i;
                }
            }
        }
        System.out.println("Minimum değer: " + min);
        System.out.println("Maximum değer: " + max);

    }
}

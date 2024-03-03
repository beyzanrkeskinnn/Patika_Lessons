import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin boyutu n :");
        n = scan.nextInt();
        int[] list = new int[n];
        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < n; i++) {
            int a = i + 1; //ekrana 1. elemandan başlamasını yazdık
            System.out.println(a + ". elemanı :");
            list[i] = scan.nextInt();
        }

        //Dizideki sayıları küçükten büyüğe sıraladık
        Arrays.sort(list);
        //diziyi ekrana yazdırdık
        System.out.println("Sıralama : " + Arrays.toString(list));

    }

}
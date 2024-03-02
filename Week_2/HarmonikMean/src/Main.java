//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        double sum = 0.0;
        double[] numbers = {1, 5, 7, 8, 9};
        double average;

        for (int i = 0; i < numbers.length; i++) {
            sum += 1/numbers[i];

        }
        average=numbers.length/sum;
        System.out.println("Harmonik Seri toplama : "+sum);
        System.out.println("Harmonik Seri Ortalamsı: "+average);
    }
}
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static boolean isFind(int arr[], int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {5, 7, 5, 8, 7, 9, 14, 8};
        int[] dublicate = new int[list.length];
        int startindex = 0;
        String lst2 = Arrays.toString(list);
        System.out.println("Liste: " + lst2);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] % 2 == 0 && list[i]==list[j]) {
                    if (!isFind(dublicate, list[i])) {
                        dublicate[startindex++] = list[i];
                        break;
                    }
                }
            }
        }
        for (int value : dublicate) {
            if (value != 0) {
                System.out.print(value);
            }
        }

    }
}
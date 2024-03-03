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

        int[] list = {10, 20, 20, 10, 20, 5, 20};
        int[] dublicate = new int[list.length];
        int[] repetitive = new int[list.length];
        int startindex = 0, counter = 0;

        String array = Arrays.toString(list);
        System.out.println("Dizi: " + array);
        Arrays.sort(list); //küçükten büyüğe sıraladı


        //liste elemanları buldu
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    if (!isFind(dublicate, list[i])) {
                        dublicate[startindex++] = list[i];
                        break;
                    }
                }
            }
        }
        //liste elemanlarının tekrar sayılarını buldu
        for (int k = 0; k < dublicate.length; k++) {
            for (int l : list) {
                if (dublicate[k] == l) {
                    counter++;
                }

            }
            if (dublicate[k] != 0) {
                repetitive[k] = counter;
                counter = 0;
            }
        }
        for (int z = 0; z < list.length; z++) {
            if (dublicate[z] != 0) {
                System.out.println(dublicate[z] + " sayısı " + repetitive[z] + " kere tekrar edildi.");
            }
        }

    }
}
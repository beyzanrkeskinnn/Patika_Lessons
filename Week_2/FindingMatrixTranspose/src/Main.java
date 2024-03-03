//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //find transpose of matrix element
    static void transpoze(int[][] arr) {
        int[][] trpz = new int[arr[0].length][arr.length];
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[0].length; l++) {
                trpz[l][k] = arr[k][l];
            }
        }
        System.out.println("Transpozu: ");
        for (int[] ints : trpz) {
            for (int j = 0; j < trpz[0].length; j++) {
                System.out.print(ints[j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] list = {{1, 2, 3}, {4, 5, 6,}};
        System.out.println("Matris : ");
        //We printed the list elements
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print(list[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("===============================");

        transpoze(list); //We called the transpose method
    }
}
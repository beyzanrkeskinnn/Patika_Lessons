//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //find transpose of matrix element
    static void transpoze(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] trpz = new int[cols][rows];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                trpz[col][row] = matrix[row][col];
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
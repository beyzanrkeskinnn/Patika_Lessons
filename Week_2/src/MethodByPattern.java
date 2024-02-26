import java.util.Scanner;

public class MethodByPattern {
    static int pattern(int number) {
        int result=1;

if(number>0){
    result = number - 5;
    System.out.println(result);
    if (number <= 0) {
        result = number + 5;
        System.out.println(result);
    }
}
      return number ;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scan.nextInt();
pattern(number);

    }
}

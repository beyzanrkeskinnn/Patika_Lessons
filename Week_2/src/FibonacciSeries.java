public class FibonacciSeries {
    static int fib(int n) {
        //eğer n sayısı 1 veya 2'e eşitse 1 sayısını döndür
        if (n == 1 || n == 2) {
            return 1;
        }
        //fibonacci serisinin formulünü döndürür
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        //fibonacci serisinin 3 basamağındaki sayıyı ekrana yazdırır
        System.out.println(fib(3));
    }

}

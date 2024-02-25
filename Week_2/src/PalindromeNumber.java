public class PalindromeNumber {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        //sayı O olana kadar çalışacak
        while (temp != 0) {

            //son basamaktaki sayıyı alacak
            lastNumber = (temp % 10);

            //son basamaktaki sayıyı reversenumber' ata
            reverseNumber = (reverseNumber * 10) + lastNumber;

            //temp sayısının son basamağını  çıkar
            temp /= 10;
        }
        //temp 0 olduktan sonra reverNumber' ekrana yazdır
        System.out.println("Yeni Sayı = " + reverseNumber);

        if(number==reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(578));

    }
}





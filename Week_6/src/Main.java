import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String path = "D:\\Java\\Patika_Lessons\\Week_6\\src/sayilar.txt";
        int toplam = 0;
        try {
            // Dosyayı okumak için Scanner kullanıyoruz
            File dosya = new File(path);
            Scanner scanner = new Scanner(dosya);

            // Dosyadaki her bir satırı okuyarak sayıları toplam değişkenine ekliyoruz
            while (scanner.hasNextLine()) {
                int sayi = Integer.parseInt(scanner.nextLine());
                toplam += sayi;
            }

            // Sonucu ekrana yazdırıyoruz
            System.out.println("Dosyadaki sayıların toplamı: " + toplam);

            // Scanner'ı kapatıyoruz
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: " + e.getMessage());
        }
    }
}


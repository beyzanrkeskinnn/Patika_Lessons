import java.io.*;

public class Main {

    public static void main(String[] args) {
        String path = "D:\\Java\\Patika_Lessons\\Week_6\\src/sayilar.txt";
        int toplam = 0;

        // Dosyayı okumak için Scanner kullanıyoruz
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String satir; // Dosyadan okunan satırı tutmak için değişken
            while ((satir = br.readLine()) != null) {
                int sayi = Integer.parseInt(satir); // Satırı tam sayıya dönüştürme
                toplam += sayi; // Toplama ekleme
            }
            System.out.println("Dosyadaki sayıların toplamı: " + toplam); // Toplamı ekrana yazdırma
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }


    }
}


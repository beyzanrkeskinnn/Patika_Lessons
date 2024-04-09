import java.io.*;

public class Main {
    public static void main(String[] args) {
        String dosyaYolu = "D:\\Java\\Patika_Lessons\\Week_6\\NotePad\\src/NotePad.txt";

        // Metni okumak için bir BufferedReader oluşturun
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(dosyaYolu));
            String line = reader.readLine();
            // Dosyadaki tüm satırları okuyun
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Kullanıcıdan metin girişi alın
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Metni girin:");
        String metin = scanner.nextLine();

        // Metni dosyaya yazın
        try {
            FileWriter fileWriter = new FileWriter(dosyaYolu);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(metin);
            System.out.println("Başarıyla metin girişi yapıldı");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

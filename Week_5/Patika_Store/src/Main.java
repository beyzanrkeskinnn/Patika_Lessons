import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1- Ürün Ekle");
            System.out.println("2- Ürünleri Listele");
            System.out.println("3- Ürün Sil");
            System.out.println("4- Marka Listele");
            System.out.println("5- Çıkış");
            System.out.println("Seçiniz: ");
            int secim = scan.nextInt();
            scan.nextLine();
            switch (secim) {
                case 1:
                    System.out.print(" Ürün Adı: ");
                    String productName = scan.nextLine();
                    System.out.print(" Birim Fiyatı: ");
                    double fiyat = scan.nextDouble();
                    System.out.print(" Stok Miktarı: ");
                    int stok = scan.nextInt();
                    System.out.print(" Marka ID: ");
                    int markaId = scan.nextInt();
                    System.out.println("Cep telefonu eklemek için 1'e basın: ");
                    System.out.println("NoteBook eklemek için 2'e basın ");
                    int techSecim = scan.nextInt();
                    scan.nextLine();
                    Marks marka = store.getMarkaById(markaId);
                    if (marka != null) {
                        int depolama, kamera, ram;
                        double ekranboyutu, pilGucu;
                        if (techSecim == 1) {
                            System.out.print("Depolama (GB) : ");
                            depolama = scan.nextInt();
                            System.out.print("Ekran Boyutu (inç)");
                            ekranboyutu = scan.nextDouble();
                            System.out.println("Kamera (MP) : ");
                            kamera = scan.nextInt();
                            System.out.println("Pil Gücü (mAh): ");
                            pilGucu = scan.nextDouble();
                            scan.nextLine();
                            Products phone = new Products(fiyat, stok, productName, marka, depolama, ekranboyutu, kamera, pilGucu);
                            store.AddedProduct(phone, techSecim);

                        } else {
                            System.out.print("Depolama (GB):");
                            depolama = scan.nextInt();
                            System.out.print("RAM (GB)");
                            ram = scan.nextInt();
                            System.out.print("Ekran Boyutu (inç)");
                            ekranboyutu = scan.nextDouble();
                            scan.nextLine();
                            Products notebook = new Products(fiyat, stok, productName, marka, depolama, ekranboyutu, ram);

                        }
                        System.out.println("Ürün eklendi");
                    } else {
                        System.out.println("Geçersiz Marka ID: ");
                    }
                    break;
                case 2:
                    store.ListProduct();
                    break;
                case 3:
                    System.out.println("Silmek istediğiniz ürünü seçin");
                    int deletedID = scan.nextInt();
                    System.out.println("Ürün Silindi ");
                    break;
                case 4:
                    store.ListMarka();
                    break;
                case 5:
                    System.out.println("Programdan çıkılıyor. ");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz Seçim...");
            }
        }
    }
}
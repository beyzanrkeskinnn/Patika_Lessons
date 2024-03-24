import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store {
    private List<Marks> marks;
    private List<Products> phone;
    private List<Products> noteBooks;

    public Store() {
        this.marks = new ArrayList<>();
        this.phone = new ArrayList<>();
        this.noteBooks = new ArrayList<>();
        //Marks Added
        marks.add(new Marks(1, "Apple"));
        marks.add(new Marks(1, "Asus"));
        marks.add(new Marks(1, "Casper"));
        marks.add(new Marks(1, "HP"));
        marks.add(new Marks(1, "Huawei"));
        marks.add(new Marks(1, "Lenova"));
        marks.add(new Marks(1, "Monster"));
        marks.add(new Marks(1, "Samsung"));
        marks.add(new Marks(1, "Xiaomi"));
        marks.sort(Comparator.comparing(Marks::getName)); //Alfabetik sıralama
    }

    public void AddedProduct(Products product, int techSecim) {
        if (product instanceof Products) {
            for (Marks marks1 : marks) {
                if (techSecim == 1) {
                    phone.add(product);
                } else {
                    noteBooks.add(product);
                }
                break;
            }
        }

    }

    public void DeleteProduct(int productId) {
        phone.removeIf(products -> products.getId() == productId);
        noteBooks.removeIf(products -> products.getId() == productId);
    }

    public void ListProduct() {
        System.out.println("NoteBook Listesi ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                              | Fiyat            | Marka          | Depolama        | Ekran    | RAM    |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Products product : noteBooks) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10d | %-6.1f | %-11d | \n", product.getId(), product.getUrunAdi(), product.getBirimFiyati(), product.getMarks(), product.getDeopalama(), product.getEkranBoyutu(), product.getRam());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Telefon Listesi ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                              | Fiyat            | Marka          | Depolama        | Ekran    | Kamera    | Pil     | RAM     | Renk  | ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Products product : phone) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10d | %-6.1f | %-9d | %-9.1f | %-9d | %-9s | \n", product.getId(), product.getUrunAdi(), product.getBirimFiyati(), product.getMarks(), product.getDeopalama(), product.getEkranBoyutu(), product.getKamera(), product.getPilGucu(), product.getRam(), product.getRenk());
        }
    }

    public void ListMarka() {
        System.out.println("| ID | Marka Adı | ");
        for (Marks marka : marks) {
            System.out.format(" | %-1d | %-1s | \n", marka.getId(), marka.getName());
        }
    }

    public Marks getMarkaById(int id) {
        for (Marks marka : marks) {
            if (marka.getId() == id) {
                return marka;
            }
        }
        return null;
    }


}

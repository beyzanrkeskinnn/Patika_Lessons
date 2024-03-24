public class Products {
    private static int idCounter = 1;
    private int id;
    private double birimFiyati;
    private double indirimOrani;
    private int stokMiktari;
    private String urunAdi;
    private Marks marks;
    private int deopalama;
    private double ekranBoyutu;
    private int kamera;
    private double pilGucu;
    private int ram;
    private String renk;

    public Products(double birimFiyati, int stokMiktari, String urunAdi, Marks marks, int deopalama, double ekranBoyutu, int kamera, double pilGucu) {
        this.id = idCounter++;
        this.birimFiyati = birimFiyati;
        this.stokMiktari = stokMiktari;
        this.urunAdi = urunAdi;
        this.marks = marks;
        this.deopalama = deopalama;
        this.ekranBoyutu = ekranBoyutu;
        this.kamera = kamera;
        this.pilGucu = pilGucu;
    }

    public Products(double birimFiyati, int stokMiktari, String urunAdi, Marks marks, int deopalama, double ekranBoyutu, int ram) {
        this.id = idCounter++;
        this.birimFiyati = birimFiyati;
        this.stokMiktari = stokMiktari;
        this.urunAdi = urunAdi;
        this.marks = marks;
        this.deopalama = deopalama;
        this.ekranBoyutu = ekranBoyutu;
        this.ram = ram;
    }

    public Products(double birimFiyati, double indirimOrani, int stokMiktari, String urunAdi, Marks marks, int deopalama, double ekranBoyutu, int kamera, double pilGucu, int ram, String renk) {
        this.id = idCounter++;
        this.birimFiyati = birimFiyati;
        this.indirimOrani = indirimOrani;
        this.stokMiktari = stokMiktari;
        this.urunAdi = urunAdi;
        this.marks = marks;
        this.deopalama = deopalama;
        this.ekranBoyutu = ekranBoyutu;
        this.kamera = kamera;
        this.pilGucu = pilGucu;
        this.ram = ram;
        this.renk = renk;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Products.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBirimFiyati() {
        return birimFiyati;
    }

    public void setBirimFiyati(double birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    public double getIndirimOrani() {
        return indirimOrani;
    }

    public void setIndirimOrani(double indirimOrani) {
        this.indirimOrani = indirimOrani;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public int getDeopalama() {
        return deopalama;
    }

    public void setDeopalama(int deopalama) {
        this.deopalama = deopalama;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getKamera() {
        return kamera;
    }

    public void setKamera(int kamera) {
        this.kamera = kamera;
    }

    public double getPilGucu() {
        return pilGucu;
    }

    public void setPilGucu(double pilGucu) {
        this.pilGucu = pilGucu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}

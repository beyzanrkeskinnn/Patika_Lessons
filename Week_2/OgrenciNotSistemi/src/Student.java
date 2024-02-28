public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    double courseFizikAvarage;
    double courseKimyaAvarage;
    double courseMatAvarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    public void addbulkverbalnotes(int mat, int fizik, int kimya) { //toplu sözlü not ekle

        if (mat >= 0 && mat <= 100) {
            this.mat.dictionaryNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.dictionaryNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.dictionaryNote = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.courseFizikAvarage=this.fizik.note*0.80+this.fizik.dictionaryNote*0.20;
        this.courseKimyaAvarage=this.kimya.note*0.80+this.kimya.dictionaryNote*0.20;
        this.courseMatAvarage=this.mat.note*0.80+this.mat.dictionaryNote*0.20;

        this.avarage = (this.courseFizikAvarage + this.courseMatAvarage + this.courseKimyaAvarage) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.note);
        System.out.println("Fizik Sınav Notu : " + this.fizik.note);
        System.out.println("Kimya Sınav Notu : " + this.kimya.note);
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sözlü Notu : " + this.mat.dictionaryNote);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.dictionaryNote);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.dictionaryNote);
    }

}

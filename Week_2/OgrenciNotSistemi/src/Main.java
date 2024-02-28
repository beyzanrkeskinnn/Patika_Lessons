//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Student s1 = new Student("Beyzanur", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(90,80,70,100,50,70);

        s1.isPass();

    }
}
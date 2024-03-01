//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //  We called the employe class
        Employee personel1 = new Employee("beyza", 5000, 50, 1998);
        personel1.tax();
        personel1.bonus();
        personel1.raiseSalary();
        personel1.personelToString();
        }
    }

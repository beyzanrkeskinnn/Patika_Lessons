
public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>(10);
        list.size();
        list.add(20);
        list.add(30);
        list.size();
        list.getCapacity();
    }
}

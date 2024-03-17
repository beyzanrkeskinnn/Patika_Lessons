import java.util.Arrays;

public class MyList<T> {
    private T[] array;
    private int capacity;
    private int size;


    public MyList(int capacity) {
        this.array = (T[]) new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    // Boyutu getir
    public int size() {
        System.out.println("Dizinin boyutu : " + size);
        return size;
    }

    // kapasiteyi getir
    public int getCapacity() {
        System.out.println("Dizinin kapasitesi : " + capacity);
        return capacity;
    }

    // Veriyi ekle
    public void add(T data) {
        if (size == capacity) {
            updateCapacity();
        }
        array[size] = data;
        size++;
    }

    // Kapasiteyi artır
    private void updateCapacity() {
        int newCapacity = capacity * 2;
        T[] newArray = Arrays.copyOf(array, newCapacity);
        array = newArray;
        capacity = newCapacity;
    }

    public void print() {
        getCapacity();
        size();
    }


    // Listeyi yazdırma
    @Override
    public String toString() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        return super.toString();
    }


    // Yeni bir Array oluştur
    T[] toArray() {
        return Arrays.copyOf(array, capacity);
    }


}

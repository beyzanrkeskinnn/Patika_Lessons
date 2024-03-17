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

    // Boyut
    public int size() {
        System.out.println("Dizinin boyutu : " + size);
        return size;
    }

    // Kapasite
    public int getCapacity() {
        System.out.println("Dizinin kapasitesi : " + capacity);
        return capacity;
    }

    // Veri ekle
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



}

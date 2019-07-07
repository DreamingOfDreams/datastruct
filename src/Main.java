import SimpleSort.ArrayBub;
import SimpleSort.ArraySel;

public class Main {


    public static void main(String[] args) {
        int size = 10;
        ArrayBub arrayBub = new ArrayBub(size);

        arrayBub.insert(12);
        arrayBub.insert(62);
        arrayBub.insert(32);
        arrayBub.insert(42);
        arrayBub.insert(11);
        arrayBub.insert(1);
        arrayBub.insert(28);
        arrayBub.insert(99);
        arrayBub.insert(24);

        arrayBub.disPlay();

        arrayBub.bubbleSort();
        arrayBub.disPlay();

        System.out.println("Hello World!");
    }
}

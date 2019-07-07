package SimpleSort;

public class InsertSortApp {
    public static void main(String[] args) {
        int size = 10;
        ArrayIns arrayIns = new ArrayIns(size);

        arrayIns.insert(12);
        arrayIns.insert(62);
        arrayIns.insert(32);
        arrayIns.insert(42);
        arrayIns.insert(11);
        arrayIns.insert(1);
        arrayIns.insert(28);
        arrayIns.insert(99);
        arrayIns.insert(24);

        arrayIns.display();

        arrayIns.insertSort();
        arrayIns.display();
    }

}

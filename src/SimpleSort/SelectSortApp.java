package SimpleSort;

public class SelectSortApp {
    public static void main(String[] args) {
        int size = 10;
        ArraySel arraySel = new ArraySel(size);

        arraySel.insert(12);
        arraySel.insert(62);
        arraySel.insert(32);
        arraySel.insert(42);
        arraySel.insert(11);
        arraySel.insert(1);
        arraySel.insert(28);
        arraySel.insert(99);
        arraySel.insert(24);

        arraySel.display();

        arraySel.selectSort();
        arraySel.display();
    }
}

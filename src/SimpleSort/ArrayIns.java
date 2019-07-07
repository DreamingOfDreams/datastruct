package SimpleSort;

//插入排序
//不变：每次temp插入后，i前面的数据都是局部有序的
public class ArrayIns {
    private long[] a;
    private int nElems;

    //构造
    public ArrayIns(int max){
        a = new long[max];
        nElems = 0;
    }

    //插入
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    //显示
    public void display(){
        for(int i=0;i<nElems;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public void insertSort(){
        int j;
        for(int i=1;i<nElems;i++){
            long temp = a[i];
            j = i;
            while (j>0 && a[j-1]>temp){
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;
        }
    }

    //交换
    private void swap(int one,int two){
        long temp = a[one];
        a[one]=a[two];
        a[two]=temp;
    }
}

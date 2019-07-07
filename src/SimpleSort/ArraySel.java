package SimpleSort;

//选择排序
//不变性：下标等于或小于i位置的数据是有序的
public class ArraySel {
    private long[] a;
    private int nElems;

    public ArraySel(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for(int i=0;i<nElems;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    //选择排序
    public void selectSort(){
        int min;
        for(int i=0;i<nElems-1;i++){
            min = i;
            for(int j=i+1;j<nElems;j++){
                if(a[min]>a[j]){
                    swap(min,j);
                }
            }
        }
    }

    private void swap(int one,int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}

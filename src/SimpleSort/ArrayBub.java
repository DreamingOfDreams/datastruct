package SimpleSort;

//冒泡排序(ON²)
//两两比较，进行交换，较大(较小)放在右边，
public class ArrayBub {

    private long[] a;
    private int nElems;

    //构造
    public ArrayBub(int max){
        a = new long[max];
        nElems = 0;
    }

    //插入
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    //显示
    public void disPlay(){
        for(int i=0;i<nElems;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    //不变性 i右边的所有数据项为有序
    //冒泡排序
    public void bubbleSort(){
        for(int i=nElems-1;i>1;i--){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    swap(j,j+1);
                }
            }
        }
    }

    //交换
    private void swap(int one,int two){
        long temp = a[one];
        a[one]=a[two];
        a[two]=temp;
    }
}

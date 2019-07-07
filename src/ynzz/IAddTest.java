package ynzz;

//i++ || ++i
public class IAddTest{
    //测试1
    private static void test(){
        int a=0;
        for(int j=0;j<99;j++){
            a = a++;
        }
        System.out.println("a=" + a);
    }

    //测试2
    private static void test2(){
        int a=0,b=0;
        for(int i=0;i<99;i++){
            a = a++;
            b = a++;
        }
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    //模拟i++
    private  int lastAdd(int i){
        int temp = i;
        i = i+1;
        return temp;
    }

    //模拟++i
    private int firstAdd(int i){
        i = i+1;
        return i;
    }

    public static void main(String[] args) {
       IAddTest.test();
       IAddTest.test2();

       IAddTest iAddTest = new IAddTest();
       int i = 0;

       //i=i++
       i=iAddTest.lastAdd(i);
       System.out.println("i=i++:"+i);

       i=0;
       i=iAddTest.firstAdd(i);
       System.out.println("i=++i:"+i);

       i=1;
       i=i++;
       System.out.println("i:"+i);
    }
}

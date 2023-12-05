interface TestI{
             void m1();
    abstract void m2();
    public   void m3();
}
class TestImpl implements TestI{
    public void m1(){
        System.out.println("TestImpl class - m1() method");
    }
    public void m2(){
        System.out.println("TestImpl class - m2() method");
    }
    public void m3(){
        System.out.println("TestImpl class - m3() method");
    }
    public static void main(String[] args){
        TestI t1=new TestImpl();
        t1.m1();
        t1.m2();
        t1.m3();
    }
}
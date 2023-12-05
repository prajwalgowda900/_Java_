interface TestI{
    //public and abstract
    void m1();
}
class TestImpl implements TestI{
   public void m1(){
    System.out.println("Impl Class - m1 method");
   }
   public static void main(String[] args){
            new TestImpl().m1();
   }   
}
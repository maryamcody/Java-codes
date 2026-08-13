interface methods{
    public void method1();
    public void method2();
}
class Myinterface implements methods{
        public void method1(){
            System.out.println("This is method 1");
        }
        @Override
        public void method2(){
            System.out.println("This is method 2");

        }
        public static void main(String args[]){
            Myinterface obj = new Myinterface();
            obj.method1();
            obj.method2();
        }

    }

    
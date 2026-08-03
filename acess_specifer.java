class Parent {
    protected void protect(){
        System.out.println("i'm inside protected method");
    }
}
class Child extends Parent {
    protected void privateMethod() {
        System.out.println("i'm inside private method");
    }
}

class acess_specifer {
    public static void main(String[]args){
        Child kid= new Child();
        kid.privateMethod();
        System.out.println("hello world");

    }
    }


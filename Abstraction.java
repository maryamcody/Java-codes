abstract class Objects {
    abstract void showShape();
    public void shape(){
        System.out.println("I'm form abstract class");
    }
    
}
class Sphere extends Objects{
    void showShape(){
        System.out.println("Object  type is Sphere");
    }
}
class cuboid extends Objects{
    void showShape(){
        System.out.println("Object type is Cuboid");
    }
}
class trangle extends Objects{
    void showShape(){
        System.out.println("Object type is Triangle");
    }
}
class   Abstraction{
    public static void main(String args[]){
        Objects s= new Sphere();
        Objects c= new cuboid();
        Objects t= new trangle();

        s.showShape();
        s.shape();

        c.showShape();
        c.shape();

        t.showShape();
        t.shape();
    }
}


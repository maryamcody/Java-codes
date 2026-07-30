class Animal {
    void eat(){
        System.out.println("eating...Animal class...eatmethod");
    }
}

class lion extends Animal{
    void roar(){
        System.out.println("Roar...Lion class...roar method");
    }
}
class BabyLion extends lion{
    void weep(){
        System.out.println("Weep...BabyLion class...weep method");
    }

}
class animals{
    public static void main(String[] er) {
        BabyLion obj=new BabyLion();
        obj.weep();
        obj.roar();
        obj.eat();
        

    }

}

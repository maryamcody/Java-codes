class Hillstations{
    void location(){
        System.out.println("Location is:");

    }
    void famousFor(){
        System.out.println("Famous for:");
    }
}
class Manali extends Hillstations{
    void location(){
        System.out.println("manali is located in Himachal Pradesh");

    }
    void famousFor(){
        System.out.println("It is famous for Hadimba Temple and adventure sports");
    }
}
class Mussoorie extends Hillstations{
    void location(){
        System.out.println("Mussoorie is located in Uttarakhand");

    }
    void famousFor(){
        System.out.println("It is famous for Kempty Falls and adventure sports");

    }
}
class  Gulmarg extends Hillstations{
    void location(){
        System.out.println("Gulmarg is located in Jammu and Kashmir");

    }
    void famousFor(){
        System.out.println("It is famous for skiing");
    }
}
class Polymorphism{
    public static void main(String args[]){

        Hillstations A= new Hillstations();
        Hillstations M= new Manali();
        Hillstations Mu= new Mussoorie();
        Hillstations G= new Gulmarg();

        A.location();
        A.famousFor();

        M.location();
        M.famousFor();

        Mu.location();
        Mu.famousFor();

        G.location();
        G.famousFor();


    }
}
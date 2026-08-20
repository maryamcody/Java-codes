import java.util.ArrayList;

class animal_arrary{
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        System.out.print("========Printing Current Arrary========");
        System.out.println(animals);
        animals.add("Deer");
        animals.add("Bear");
        animals.add("Zebra");
        System.out.println("The size of Array: "+animals.size());
        System.out.println("Addding more elements "+animals.add("Dog"));
        System.out.println(animals);
        animals.remove(2);
        System.out.println(animals);

        animals.clear();
        System.out.println("========Printing Current Arrary=======");
        System.out.println("Empty array"+animals);
        if (animals.isEmpty()){
            System.out.println("Array is empty");
        }
        else{
            System.out.println("Arrary is not empty");
        }

        
    
    }
}

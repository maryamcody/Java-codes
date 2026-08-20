import java.util.ArrayList;

public class array_list{
    public static void main(String[] args){
    System.out.println("========Lambas=======");
    ArrayList<Integer> numbers =new ArrayList<integer>();
    numbers.add(35);
    numbers.add(48);

    numbers.add(18);
    numbers.add(13);

    numbers.forEach( (x) -> {System.out.print(x);});
    numbers.forEach(n ->{if (n== 49) System.out.println("Found49");

    });
    }
}

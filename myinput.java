import java.util.*;
public class myinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello User Enter your Name ");
        String name =sc.nextLine();
        System.out.println("What is your lucky number?");
        int lucky=sc.nextInt();
        System.out.println("Hello "+name+",Your lucky number " +lucky+ " shows you are hardworking.keep it up!");
    }
}

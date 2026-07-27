class Employees{
    int empno;
    String name;
    Float sal;

    Employees(){
        System.out.println("*****");
        empno=101;
        name="Aashish";
        sal=5000f;
    }

    int number=1000;

    void displayDetails(){
        System.out.println(empno + " | "+name+ " | "+sal);

    }

    void increment(){
        number=number+1000;


    }
}
class Employee{
    public static void main(String[] args){
        
        Employees emp1 =new Employees();
        Employees emp2 =new Employees();


        emp1.displayDetails();

        emp1.increment();
        System.out.println(emp1.number);

        emp2.displayDetails();
        emp2.increment();
        System.out.println(emp2.number);

        String first="Cod";
        String second="ingal";
        String codingal=first+second;
        String codingalTrick="Welcome"+"to"+"Codingal";
        String codingalCapital=codingal.toUpperCase();
        String codingalSmall =codingalCapital.toLowerCase();

        int lengthOfCodingal=codingal.length();
        int lenghtOfCodingalTrick=codingalTrick.length();
        int sum=lengthOfCodingal+lenghtOfCodingalTrick;

        System.out.println(codingal);
        System.out.println(codingalTrick);
        System.out.println(codingalCapital);
        System.out.println(codingalSmall);
        System.out.println(sum);

    }
}

class Student {
private String name;
public String getName() {
    return name;
}
public void setName(String name) {
this.name = name;
}
}
class encaps {
public static void main(String[]args){
Student s=new Student();
s.setName("Aashish @Codingal");
System.out.println("Name of student is "+s.getName());
}
}

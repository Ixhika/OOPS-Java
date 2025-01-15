/*Runtime and Compile Time
 1>Method overiding
 2>Method overloading: Having same name functions but with diff paras/return type
*/
class Student{
    String name;
    int age;

    //overloading
    public void printInfo(String name){
        System.out.println("Name");
    }
    public void printInfo(int age){
        System.out.println("Age");
    }
    public void printInfo(String name , int age){
        System.out.println("name and age");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo("Ishika");
        s1.printInfo(23);
    }
}


//overidding is explained T002

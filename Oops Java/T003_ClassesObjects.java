class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write");
    }
    public void printColor(){
        System.out.println(this.color);
        //this keyword means that it is referring which object is calling the method
    }
}

class Student{
    String name;
    int age;

   //Constructors
    Student(){ //non parameter

    }

    Student(String n , int a){ //parameterised
        this.name = n;
        this.age = a;  //here this.age is object name and  a is parameter age
    }
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class T003_ClassesObjects {
    public static void main(String[] args) {
        Student s1 = new Student();  //new means creates a new memory in heap allocation
        s1.name = "Ishika";
        s1.age = 22;

        Student s2 = new Student("Ishu" , 23);
        s1.printInfo();
        s2.printInfo();
    }
}


//class collections of datas , methods  and objects. It is a blueprint

/*Constructor: Same name as class name. they are methods , no return type(not even void)
 it can be called only once when object is created
 Copy COnstructor:
 Student(String n , int a){ //parameterised
        this.name = s2.n;
        this.age =s2.a;  //here this.age is object name and  a is parameter age
    }

    we want the same thing for other student so we will write like this
*/



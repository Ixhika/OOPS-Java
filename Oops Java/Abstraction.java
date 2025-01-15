abstract class Animal{ //it is imagination, inside this class are the functions which are reuqired by end user
    abstract void walk();
    //we cannot create objects for abstract classes
}
class Horse extends Animal{
    public void walk(){
        System.out.println("4 legs");
    }

    //if we are extending the abstract class then we have to use the function mentioned in tht class otherwise it will show error
}
public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();

       // Animal a = new Animal();  //it is showing error as we cannot create object of class

    }

}
//abstract can have both abstract and non abstract methods and can have static methods also final methods

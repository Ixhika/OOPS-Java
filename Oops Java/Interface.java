interface Animal{
    void walk();

    //cannot call non abstract methods and can have public static and default methods
}

class Horse implements Animal{
    public void walk(){
        System.out.println("Walk 4");
    }
}
public class Interface {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
    }
}

//interface supports multiple inheritance
//interface is a special type of abstract class
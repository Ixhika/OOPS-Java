class Animal { // Class Animal (No public keyword here,in one class ibly)
    int a = 10;
    public void eat() {
        System.out.println("Animal eats ");
    }

    public void walk() {
        System.out.println("Animal walks ");
    }
}

public class T002_DynamicBinding extends Animal {
    int a = 5;
    @Override
    public void eat() { // This is overridden
        System.out.println("Dog eats ");
    }

    @Override
    public void walk() {
        System.out.println("Dog walks");
    }

    public static void main(String[] args) {
        T002_DynamicBinding db = new T002_DynamicBinding();
        db.eat(); // Calls overridden eat()
        db.walk(); // Calls overridden walk()

        // Dynamic binding example
        Animal a = new T002_DynamicBinding();
        a.eat(); // Calls overridden eat()
        

        //runtime m pata chalta h DB
    }
}


//overriden functions define child class functions
//when we use parent class as reference and object as child then it is called Dynamic method dispatch/Dynamic binding
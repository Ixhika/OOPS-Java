class Animal{
    public void eat(){
        System.out.println("Animal eats ");
    }
    public static void main(String[] args) {
   /*this side is reference */   Animal a = new Animal(); /* this side is object*/
        a.eat();

    }
}

//static biniding m compile time pe hi pata chal jata about reference and object
//constructor here is deafault because no constructor present

//memory of object is allocated in main memory when constructor is called
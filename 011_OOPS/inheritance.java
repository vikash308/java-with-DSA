// Inheritance is when properties & methods of base class are passed on to a derived class

public class inheritance {
    public static void main(String[] args) {
        Fish obj = new Fish();
        obj.eat();
    }
}
class Animals{
    String color;

    void eat(){
        System.out.println("eating...");
    }

    void breathe(){
        System.out.println("breathing...");
    }
}

class Fish extends Animals{
    int fins;

    void swims(){
        System.out.println("swim in water");
    }
}

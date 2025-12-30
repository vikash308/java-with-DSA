// 1. cannot create an instance of abstract class
//2. can have abstract/non-abstract methods 
// 3. can have constructors

public class AbstractClass {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();

        chicken ch1 = new chicken();
        ch1.eat();
        ch1.walk();
    }
}

abstract class Animals{
    String color;

    Animals(){
        color = "brown";
    }
    void eat(){
        System.out.println("animals eat");
    }
    abstract void walk();
}

class Horse extends Animals{
    void walk(){
        System.out.println("walks on 4 legs");
    }

    void changeColor(String clr){
        color = clr;
    }
}

class chicken extends Animals{
   void walk(){
    System.out.println("walks on 2 legs");
   }
}

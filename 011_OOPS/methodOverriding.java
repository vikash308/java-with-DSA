// parent are child classes both contain the same function with a different definition

public class methodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animals{
    void eat(){
        System.out.println("eat everything");
    }
}
class Deer extends Animals{
    void eat(){
        System.out.println("eat grass");
    }
}
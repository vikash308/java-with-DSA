class interfaceTopic{
    public static void main(String[] args) {
        queen q = new queen();
        q.moves();

        king k = new king();
        k.moves();
    }
}

public interface chess {
    void moves();
}

class king implements chess{
    public void moves(){
        System.out.println("up down left right diagonal (in all direction) ");
    }
}

class queen implements chess{
    public void moves(){
        System.out.println("up down left right diagonal (in all direction) ");
    }
}


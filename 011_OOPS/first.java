public class first {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);

        BnakAccount myAcc = new BnakAccount();
        myAcc.username = "vikash";
        myAcc.setPassword("pandey@123");
        System.out.println(myAcc.getPassword());
    }
}

class Pen{
    String color ;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip= newTip;
    }
}

class BnakAccount{
    public String username;
    private String password;

    void setPassword(String pwd){
        password = pwd;
    }
    String getPassword(){
        return this.password;
    }
}
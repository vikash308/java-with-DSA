public class staticTopic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetail("vikash", 63);
        s1.school = "KIPM";

        Student s2 = new Student();
        System.out.println(s2.school);
    }
}


class Student{
    String name;
    int roll;
    static String school;

    void setDetail(String n, int r){
        name = n;
        roll =r;
    }

    void getDetail(){
        System.out.println("name is :" + name);
        System.out.println("roll is :" + roll);
    }

}
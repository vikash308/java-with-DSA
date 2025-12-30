// Constructor is a special method which is invoked automatically at the time of object creation.

// 1. constructors have the same name as class or structure.
// 2. constructors don't have a return type.

//3. constructor are only called once at object creation.

//4. memory allocation happen when constructor is called 


public class constructor {
    public static void main(String[] args) {

        //parameterize constructor call
        Student s1 = new Student("vikash", 12);
        System.out.println(s1.name);

        // default constructor call
        Student s2 = new Student();

        // copy constructor call
        Student s3 = new Student(s1);
    }
}
class Student{
    String name;
    int roll;
        //default coonstructor 
    Student(){
        System.out.println("constructor called...");
    }

    // parameterize constructor
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    // copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
}
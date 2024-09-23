// Cat class definition
public class Student {

    // instance variables
    private String name;
    private int age;
    private double height;
 
    // constructor
    public Student(String sName, int sAge, double sHeight) {
        name = sName;
        age = sAge;
        height = sHeight;
    }
 
    // method that prints Student info
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
 }
 
 
// Cat class definition
public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;
 
    // constructor
    public Cat(String catName, int catAge, double catWeight) {
        name = catName;
        age = catAge;
        weight = catWeight;
    }
 
    // method that introduces the Cat
    public void introduce() {
        System.out.println("Hello my name is " + name + " and I am a" + (age > 7 ? "n older" : " younger")+ " cat");
    }
 
    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
 }
 
 
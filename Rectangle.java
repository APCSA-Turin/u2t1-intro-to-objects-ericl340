public class Rectangle {

    // instance variables, the object data stored with each object:
    private int length;
    private int width;
 
    // the constructor used to create Rectangle objects:
    // instance variables are set here using the values passed as arguments
    public Rectangle(int len, int wid) {
        length = len;
        width = wid;
    }
 
    // a method (object behavior) that calculates and prints area:
    public void printArea() {
        System.out.println("My area is " + calculateArea());
    }
    public void printPerimeter() {
        int perimeter = (length + width) * 2;
        System.out.println("My perimeter is " + perimeter);
    }
    public void printBoxVolume(double height) {
        System.out.println(calculateBoxVolume(height));
    }
    public int calculateArea(){
        return length * width;
    }
    public double calculateBoxVolume(double height){
        return calculateArea() * height;
    }
}
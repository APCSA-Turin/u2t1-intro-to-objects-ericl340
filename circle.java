public class circle {
    private double radius;
    public circle(double rad){
        radius = rad;
    }
    public void printArea(){
        System.out.println("A circle with radius " + radius + " has an area of " + radius * radius * Math.PI);
    }
}
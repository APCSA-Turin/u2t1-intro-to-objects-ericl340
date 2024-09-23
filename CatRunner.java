public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Muffin", 3, 25);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Cookie", 8, 30);
        cat2.printCatInfo();
        cat2.introduce();
    }
}

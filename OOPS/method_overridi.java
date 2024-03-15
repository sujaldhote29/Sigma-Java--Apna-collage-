public class method_overridi {
    public static void main(String[] args) {
        
        Horse a2 = new Horse();
        a2.eat();
}
}
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Horse extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}


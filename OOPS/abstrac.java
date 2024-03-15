public class abstrac {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // chicken c = new chicken();
        // c.eat();
        // c.walk();



        // Animal a = new Animal();

        // System.out.println(h.color);

}
abstract class Animal{
    String color;
    Animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }


    abstract void walk();
}


class Horse extends Animal{

    void changecolor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}

class chicken extends Animal{
    void changecolor(){
        color ="white";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
}

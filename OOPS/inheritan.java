public class inheritan {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();

        dog Dobby = new dog();
        Dobby.eat();
        Dobby.legs =4;
        System.out.println(Dobby.legs);
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

// Derived class 

// class Fish extends Animal{
//     int fins; 
//     void swim(){
//         System.out.println("swims in water");
//     }
// }


class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }

}

class dog extends Mammals{
    String breed;
}
class Fish extends Animal{
    int legs;
    void swim(){
        System.out.println("swims");
    }

}
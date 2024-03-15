public class super_key {
    public static void main(String args[]){
        // Horse  h = new Horse();

    }
}
class Animal{
    Animal(){
        System.out.println("Animal constructor called");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("horse constructor called");
    }
}
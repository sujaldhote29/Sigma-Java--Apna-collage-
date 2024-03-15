

public class New {
    public static void main(String[] args) {
        student s1= new student("sujal",67);
        System.out.println(s1.name);
        System.out.println(s1.roll);
    }
}
class student{
    String name;
    int roll;

    student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }

}
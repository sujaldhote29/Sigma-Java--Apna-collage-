
public class Baisc {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("yellow");
        System.out.println(p1.getcolor());
        // p1.setnewtip(4);
        // System.out.println(p1.setnewtip(4));
        // p1.setnewtip(5);
        // System.out.println(p1.tip);
        // p1.color = "red";
        // System.out.println(p1.color);
        
            
    }
}

class Pen {
    private String color;
    // private int newtip;

    void setcolor(String newColor) {
        color = newColor;
    }

    void setnewtip(int newtip) {
        // newtip = newtip;
    }


    String getcolor(){
        return this.color;
    }

        void gettip(int newtip){
            // this.newtip = newtip;

        }





}

    class student{
    int marks ;
    String  name;

}










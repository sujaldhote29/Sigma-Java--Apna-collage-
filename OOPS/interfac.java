public class interfac {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();

        Bear  b = new Bear();
        b.eat();

    }
}


interface Herbivores{
    void eat();
  
    
}

interface Carnivores{
    void eat();
}

class Bear implements Herbivores,Carnivores{
   public void eat(){
        System.out.println("eat both herbivore and carnivore");
    }
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer {
    public void moves(){
        System.out.println("up down left right  diagonal");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up down leftt right");
    }
}
package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
        
        if (from1UpTo1000 <= 500)
            System.out.println("Eagle");
        
        if (from1UpTo1000 > 500 && from1UpTo1000 <= 1000)
            System.out.println("Tail");

    }
    
    public static void main(String args[]){
     CoinFlip main = new CoinFlip();
        main.throwCoin(750);
        
    }
}

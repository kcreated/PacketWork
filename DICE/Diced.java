package DICED;

public class Diced {
    
    private int die1, die2;

    public Dice() {
        die1 = 1;
        die2 = 4;
    }
    
    public void roll(){
         die1 = (int) (Math.random()*100) + 1;
         die2 = (int) (Math.random()*100) + 1;
    }

    public int getTotal(){

        return die1 + die2;

    }
}
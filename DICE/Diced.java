package DICE;

public class Diced {

    public static void main(String[] args) {
        Dice dice = new Dice();
        int num7or11 = 0;
        int num2or3or12 = 0;
        int numOfRolls = 100;

        for (int i = 0; i < numOfRolls; i++) {
            dice.roll();
            int total = dice.getTotal();

            if (total == 7 || total == 11) {
                num7or11++;
            }
            if (total == 2 || total == 3 || total == 12) {
                num2or3or12++;
            }
        }

        double percentOf7or11 = (num7or11 / (double) numOfRolls) * 100;
        double percentOf2or3or12 = (num2or3or12 / (double) numOfRolls) * 100;

        System.out.println("You rolled a 7 or 11 \t\t" + percentOf7or11 + "% of the time.");
        System.out.println("You rolled a 2, 3, or 12 \t" + percentOf2or3or12 + "% of the time.");
    }
}
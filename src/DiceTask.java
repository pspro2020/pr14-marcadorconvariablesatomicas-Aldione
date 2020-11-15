import java.util.concurrent.ThreadLocalRandom;

public class DiceTask implements Runnable{

    private final Dice dice;

    public DiceTask(Dice dice){
        this.dice = dice;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
            int roll = ThreadLocalRandom.current().nextInt(6)+1;
            dice.increasedRoll(roll-1, 1);
        }

    }
}

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Dice {

    private final AtomicIntegerArray rolled;

    public Dice (int num){
        rolled = new AtomicIntegerArray(num);
    }

    public int getNumber(int i) {
        return rolled.get(i);
    }

    public void increasedRoll(int i, int increased){
        rolled.addAndGet(i, increased);
    }

}

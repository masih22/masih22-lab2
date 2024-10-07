import java.util.Random;
public class TypeB extends Thing {
    //important for TypeB things
    private int timeSinceLast;
    //TypeB constructor using Super
    public TypeB (int row, int col, char lab) {
        super(row, col, lab);
    }
    //maybeTurn with necessary logic from DotChaser maybe turn
    public void maybeTurn (Random t) {
        int i = rand.nextInt(3);
        timeSinceLast++;
        if (timeSinceLast == 10) {
            timeSinceLast = 0;

            if (i == 1) {
            rightTurn();
            }

            if (i == 2) {
            leftTurn();
            }
        }
    }
}
import java.util.Random;
public class TypeB extends Thing {
    //important for TypeB things
    private int timeSinceLast = 0;
    //TypeB constructor using Super
    public TypeB (int row, int col) {
        super(row, col, 'b');
    }
    //maybeTurn with necessary logic from DotChaser maybe turn
    public void maybeTurn (Random t) {
        int i = t.nextInt(3);
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
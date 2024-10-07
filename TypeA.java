import java.util.Random;
public class TypeA extends Thing {
    //typeA constructor using super constructor
    public TypeA (int row, int col) {
        super(row, col, 'r');
    }
    //maybeTurn with necessary logic from DotChaser maybe turn
    public void maybeTurn(Random t) {
        int i = t.nextInt(3);
        if (i == 1) {
            rightTurn();
        }

        if (i == 2) {
            leftTurn();
        }
    }
    
}
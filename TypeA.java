import java.util.Random;
public class TypeA extends Thing {
    public TypeA (int row, int col, char lab) {
        super(row, col, lab);
    }

    public void maybeTurn(Random t) {
        int i = rand.nextInt(3);
        if (i == 1) {
            rightTurn(t);
        }

        if (i == 2) {
            leftTurn(t);
        }
    }
    
}
import java.util.Random;
public class TypeC extends Thing {
    // will be used in our maybeTurn
    private boolean movingRight = true;
    //calling super constructor to make TypeC constructor
    public TypeC (int row, int col){
        super(row, col, 'y');
    }
    //will just have the thing turn right and then left (diagonal motion) 
    public void maybeTurn(Random t) {
        if(movingRight == true) {
            rightTurn();
            movingRight = false;
        }
        else {
            leftTurn();
            movingRight = true;
        }
    }

}
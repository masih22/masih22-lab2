import java.util.Random;

public abstract class Thing{
    //elements of node needed that are given in DotChaser
    protected int col;
    protected int dir;
    protected int timeSinceLast;
    protected char lab = 'r';
    public boolean isTypeB;

    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = 0;
    }

    public void rightTurn(){
        dir = (dir + 1) % 4;
    }   

    public void leftTurn(){
        dir = (dir + 3) % 4;
    }

    public void step() {
    final int[] dc = {
      0, 1, 0, -1
    }, dr = {
      1, 0, -1, 0
    };
    row += dr[dir];
    col += dc[dir];
  }

  //calling abstract in thing and will be defined using the specific logic given in DotChaser maybeTurn
  public abstract void maybeTurn(Random t);

}

//typeA is a thing

//public class typea 
//maybeturn different in both types
//node constructor data = thing
//public class typea extends thing 

public class Thing{

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

    public void rightTurn(Thing t){
        t.dir = (t.dir + 1) % 4;
    }   

    public void leftTurn(Thing t){
        t.dir = (t.dir + 3) % 4;
    }

    public abstract void leftTurn(Thing t);

    public void step(Thing t) {
    final int[] dc = {
      0, 1, 0, -1
    }, dr = {
      1, 0, -1, 0
    };
    t.row += dr[t.dir];
    t.col += dc[t.dir];
  }

  public abstract void leftTurn(Thing t);


}

//typeA is a thing

//public class typea 
//maybeturn different in both types
//node constructor data = thing
//public class typea extends thing 

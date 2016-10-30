
/**
 *
 * @author Ben Specniner
 */
public class GamePiece {
    public int[] pos = {0,0};
    public String name;

    public GamePiece(){
        
    }
    public GamePiece(int pos[]) {
        this.pos[0] = pos[0];
        this.pos[1] = pos[1];
    }

    public String getName() {
        return name;
    }

    public void move(int[] dir) {
        this.pos[0] += dir[0];
        this.pos[1] += dir[1];
    }
    public char toChar(){
        return '#';
    }

}


import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class upLadder extends GamePiece {

    private char charRepresentation = '<';
    private Image imgRepresentation = new Image("downladder.png");


    public upLadder(int[] pos) {
        super(pos);
    }

    @Override
    public char getCharRepresentation() {
        return charRepresentation;
    }

    @Override
    public Image getImgRepresentation() {
        return imgRepresentation;
    }

    public void setCharRepresentation(char charRepresentation) {
        this.charRepresentation = charRepresentation;
    }

    public void setImgRepresentation(Image imgRepresentation) {
        this.imgRepresentation = imgRepresentation;
    }

}

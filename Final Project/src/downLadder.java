
import javafx.scene.image.Image;

/**
 *
 * @author acnologia
 */
public class downLadder extends GamePiece {

    private char charRepresentation = '>';
    private Image imgRepresentation = new Image("downladder.png");


    public downLadder(int[] pos) {
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

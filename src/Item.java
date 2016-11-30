
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public abstract class Item extends GamePiece {

    @Override
    public abstract char getCharRepresentation();

    @Override
    public abstract Image getImgRepresentation();

}

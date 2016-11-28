
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class LeatherBoots extends Armor {

    private int armor = 1;
    private String name = "Leather Boots";
    private char charRepresentation = 'l';
    private Image imgRepresentation = new Image("leatherboots.png");

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


import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Handaxe extends Weapon {

    private int damage = 1;
    private String name = "Handaxe";
    private char charRepresentation = '{';
    private Image imgRepresentation = new Image("handaxe.png");

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

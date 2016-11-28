
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Greataxe extends Weapon {

    private int damage = 3;
    private String name = "Greataxe";
    private char charRepresentation = 'X';
    private Image imgRepresentation = new Image("greataxe.png");

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

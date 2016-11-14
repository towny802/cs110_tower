
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Dagger extends Weapon {

    private int damage = 2;
    private String name = "Dagger";
    private char charRepresentation = ',';
    private Image imgRepresentation = new Image("dagger.png");

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


import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Dagger extends Weapon {

    private int damage = 1;
    private String name = "Dagger";
    private char charRepresentation = ',';
    private Image imgRepresentation;



    @Override
    public char getCharRepresentation() {
        return charRepresentation;
    }

    @Override
    public Image getImgRepresentation() {
        if (imgRepresentation == null){
            imgRepresentation = new Image("dagger.png");
        }
        return imgRepresentation;
    }

    public void setCharRepresentation(char charRepresentation) {
        this.charRepresentation = charRepresentation;
    }

    public void setImgRepresentation(Image imgRepresentation) {
        this.imgRepresentation = imgRepresentation;
    }
}

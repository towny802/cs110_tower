
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Kogaloth extends Creature {

    private char charRepresentation = 'K';
    private Image imgRepresentation = new Image("kogaloth.png");
    private int health = 25;
    private int damage = 7;
    private int armor = 4;
    private String name = "Kogaloth";

    public Kogaloth(int[] pos) {
        super(pos);
    }

    public Kogaloth(int[] pos, int health, int damage, int armor) {
        super(pos, health, damage, armor);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    /**
     * @return the health
     */
    @Override
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the damage
     */
    @Override
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @return the armor
     */
    @Override
    public int getArmor() {
        return armor;
    }

    /**
     * @param armor the armor to set
     */
    @Override
    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public int getType() {
        return 0;
    }
}

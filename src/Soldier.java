
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Soldier extends Creature {

    private char charRepresentation = 'd';
    private Image imgRepresentation = new Image("soldier.png");
    private int health = 15;
    private int damage = 4;
    private int armor = 3;
    private String name = "Soldier";

    public Soldier(int[] pos) {
        super(pos);
    }

    public Soldier(int[] pos, int health, int damage, int armor) {
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
}

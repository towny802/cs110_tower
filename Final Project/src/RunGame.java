
import java.util.ArrayList;
import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Ben Spenciner
 */
public class RunGame extends Application {

    @Override
    public void start(Stage primaryStage) {

        Image floorImg = new Image("floor.png");
        TowerModel tower = new TowerModel();
        Player hero = new Player(new int[]{1, 1}, 20, 10, 0);
        Pane pane = new Pane();

        ImageView iv2 = new ImageView();
        pane.getChildren().add(iv2);

        iv2.setImage(floorImg);
        iv2.setFitHeight(640);
        iv2.setFitWidth(640);
        iv2.setX(0);
        iv2.setY(0);
        tower.AllocateFloor(tower.floor0, tower.occupants, pane);
        ImageView iv1 = new ImageView();

        iv1.setImage(hero.getImgRepresentation());
        iv1.setFitWidth(32);
        iv1.setFitHeight(32);
        iv1.setX(hero.pos[0] * (640 / 20));
        iv1.setY(hero.pos[1] * (640 / 20));

        pane.getChildren().add(iv1);

        Scene scene = new Scene(pane, 640, 640);
        primaryStage.setTitle("Final Project");
        primaryStage.setScene(scene);
//        primaryStage.setFullScreen(true);
        primaryStage.show();

        iv1.setOnKeyPressed((KeyEvent e) -> {
            switch (e.getCode()) {
                case UP:
                    if (tower.obstructions[hero.pos[0]][hero.pos[1] - 1] instanceof Wall) {
                    } else if (tower.obstructions[hero.pos[0]][hero.pos[1] - 1] instanceof Creature) {
                        if (hero.attack(hero, tower.obstructions[hero.pos[0]][hero.pos[1] - 1])) {
                            Creature creatureTemp = (Creature) tower.obstructions[hero.pos[0]][hero.pos[1] - 1];
                            tower.occupants.remove(creatureTemp);
                            pane.getChildren().remove(creatureTemp.view);
                            Item itemTemp = creatureTemp.dropItem(creatureTemp);
                            tower.obstructions[hero.pos[0]][hero.pos[1] - 1] = itemTemp;
                            System.out.println(tower.obstructions[hero.pos[0]][hero.pos[1] - 1]);
                            tower.occupants.add(itemTemp);
                            ImageView tempIV = new ImageView(itemTemp.getImgRepresentation());
                            tempIV.setFitHeight(32);
                            tempIV.setFitWidth(32);
                            tempIV.setX(hero.pos[0] * (640 / 20));
                            tempIV.setY((hero.pos[1] - 1) * (640 / 20));
                            pane.getChildren().add(tempIV);
                        }
                    } else {
                        int[] move = {0, -1};
                        hero.rePos(move, iv1);
                    }
                    break;
                case DOWN:
                    if (tower.obstructions[hero.pos[0]][hero.pos[1] + 1] instanceof Wall) {
                    } else if (tower.obstructions[hero.pos[0]][hero.pos[1] + 1] instanceof Creature) {
                        if (hero.attack(hero, tower.obstructions[hero.pos[0]][hero.pos[1] + 1])) {
                            Creature creatureTemp = (Creature) tower.obstructions[hero.pos[0]][hero.pos[1] + 1];
                            tower.occupants.remove(creatureTemp);
                            pane.getChildren().remove(creatureTemp.view);
                            Item itemTemp = creatureTemp.dropItem(creatureTemp);
                            tower.obstructions[hero.pos[0]][hero.pos[1] + 1] = itemTemp;
                            System.out.println(tower.obstructions[hero.pos[0]][hero.pos[1] + 1]);
                            tower.occupants.add(itemTemp);
                            ImageView tempIV = new ImageView(itemTemp.getImgRepresentation());
                            tempIV.setFitHeight(32);
                            tempIV.setFitWidth(32);
                            tempIV.setX(hero.pos[0] * (640 / 20));
                            tempIV.setY((hero.pos[1] + 1) * (640 / 20));
                            pane.getChildren().add(tempIV);
                        }
                    } else {
                        int[] move = {0, 1};
                        hero.rePos(move, iv1);
                    }
                    break;
                case LEFT:
                    if (tower.obstructions[hero.pos[0] - 1][hero.pos[1]] instanceof Wall) {
                    } else if (tower.obstructions[hero.pos[0] - 1][hero.pos[1]] instanceof Creature) {
                        if (hero.attack(hero, tower.obstructions[hero.pos[0] - 1][hero.pos[1]])) {
                            Creature creatureTemp = (Creature) tower.obstructions[hero.pos[0] - 1][hero.pos[1]];
                            tower.occupants.remove(creatureTemp);
                            pane.getChildren().remove(creatureTemp.view);
                            Item itemTemp = creatureTemp.dropItem(creatureTemp);
                            tower.obstructions[hero.pos[0] - 1][hero.pos[1]] = itemTemp;
                            System.out.println(tower.obstructions[hero.pos[0] - 1][hero.pos[1]]);
                            tower.occupants.add(itemTemp);
                            ImageView tempIV = new ImageView(itemTemp.getImgRepresentation());
                            tempIV.setFitHeight(32);
                            tempIV.setFitWidth(32);
                            tempIV.setX((hero.pos[0] - 1) * (640 / 20));
                            tempIV.setY(hero.pos[1] * (640 / 20));
                            pane.getChildren().add(tempIV);
                        }
                    } else {
                        int[] move = {-1, 0};
                        hero.rePos(move, iv1);
                    }
                    break;
                case RIGHT:
                    if (tower.obstructions[hero.pos[0] + 1][hero.pos[1]] instanceof Wall) {
                    } else if (tower.obstructions[hero.pos[0] + 1][hero.pos[1]] instanceof Creature) {
                        if (hero.attack(hero, tower.obstructions[hero.pos[0] + 1][hero.pos[1]])) {
                            Creature creatureTemp = (Creature) tower.obstructions[hero.pos[0] + 1][hero.pos[1]];
                            tower.occupants.remove(creatureTemp);
                            pane.getChildren().remove(creatureTemp.view);
                            Item itemTemp = creatureTemp.dropItem(creatureTemp);
                            tower.obstructions[hero.pos[0] + 1][hero.pos[1]] = itemTemp;
                            System.out.println(tower.obstructions[hero.pos[0] + 1][hero.pos[1]]);
                            tower.occupants.add(itemTemp);
                            ImageView tempIV = new ImageView(itemTemp.getImgRepresentation());
                            tempIV.setFitHeight(32);
                            tempIV.setFitWidth(32);
                            tempIV.setX((hero.pos[0] + 1) * (640 / 20));
                            tempIV.setY(hero.pos[1] * (640 / 20));
                            pane.getChildren().add(tempIV);
                        }
                    } else {
                        int[] move = {1, 0};
                        hero.rePos(move, iv1);
                    }
                    break;
                case Y:
                    if (tower.obstructions[hero.pos[0] - 1][hero.pos[1] - 1] instanceof Wall) {
                    } else if (tower.obstructions[hero.pos[0] - 1][hero.pos[1] - 1] instanceof Creature) {
                        if (hero.attack(hero, tower.obstructions[hero.pos[0] - 1][hero.pos[1] - 1])) {
                            Creature creatureTemp = (Creature) tower.obstructions[hero.pos[0] - 1][hero.pos[1] - 1];
                            tower.occupants.remove(creatureTemp);
                            pane.getChildren().remove(creatureTemp.view);
                            Item itemTemp = creatureTemp.dropItem(creatureTemp);
                            tower.obstructions[hero.pos[0] - 1][hero.pos[1] - 1] = itemTemp;
                            System.out.println(tower.obstructions[hero.pos[0] - 1][hero.pos[1] - 1]);
                            tower.occupants.add(itemTemp);
                            ImageView tempIV = new ImageView(itemTemp.getImgRepresentation());
                            tempIV.setFitHeight(32);
                            tempIV.setFitWidth(32);
                            tempIV.setX((hero.pos[0] - 1) * (640 / 20));
                            tempIV.setY((hero.pos[1] - 1) * (640 / 20));
                            pane.getChildren().add(tempIV);
                        }
                    } else {
                        int[] move = {-1, -1};
                        hero.rePos(move, iv1);
                    }
                    break;
                case U:
                    if (tower.obstructions[hero.pos[0] + 1][hero.pos[1] - 1] instanceof Wall) {
                    } else if (tower.obstructions[hero.pos[0] + 1][hero.pos[1] - 1] instanceof Creature) {
                        if (hero.attack(hero, tower.obstructions[hero.pos[0] + 1][hero.pos[1] - 1])) {
                            Creature creatureTemp = (Creature) tower.obstructions[hero.pos[0] + 1][hero.pos[1] - 1];
                            tower.occupants.remove(creatureTemp);
                            pane.getChildren().remove(creatureTemp.view);
                            Item itemTemp = creatureTemp.dropItem(creatureTemp);
                            tower.obstructions[hero.pos[0] + 1][hero.pos[1] - 1] = itemTemp;
                            System.out.println(tower.obstructions[hero.pos[0] + 1][hero.pos[1] - 1]);
                            tower.occupants.add(itemTemp);
                            ImageView tempIV = new ImageView(itemTemp.getImgRepresentation());
                            tempIV.setFitHeight(32);
                            tempIV.setFitWidth(32);
                            tempIV.setX((hero.pos[0] + 1) * (640 / 20));
                            tempIV.setY((hero.pos[1] - 1) * (640 / 20));
                            pane.getChildren().add(tempIV);
                        }
                    } else {
                        int[] move = {1, -1};
                        hero.rePos(move, iv1);
                    }
                    break;
                case B:
                    if (tower.obstructions[hero.pos[0] - 1][hero.pos[1] + 1] instanceof Wall) {
                    } else if (tower.obstructions[hero.pos[0] - 1][hero.pos[1] + 1] instanceof Creature) {
                        if (hero.attack(hero, tower.obstructions[hero.pos[0] - 1][hero.pos[1] + 1])) {
                            Creature creatureTemp = (Creature) tower.obstructions[hero.pos[0] - 1][hero.pos[1] + 1];
                            tower.occupants.remove(creatureTemp);
                            pane.getChildren().remove(creatureTemp.view);
                            Item itemTemp = creatureTemp.dropItem(creatureTemp);
                            tower.obstructions[hero.pos[0] - 1][hero.pos[1] + 1] = itemTemp;
                            System.out.println(tower.obstructions[hero.pos[0] - 1][hero.pos[1] + 1]);
                            tower.occupants.add(itemTemp);
                            ImageView tempIV = new ImageView(itemTemp.getImgRepresentation());
                            tempIV.setFitHeight(32);
                            tempIV.setFitWidth(32);
                            tempIV.setX((hero.pos[0] - 1) * (640 / 20));
                            tempIV.setY((hero.pos[1] + 1) * (640 / 20));
                            pane.getChildren().add(tempIV);
                        }
                    } else {
                        int[] move = {-1, 1};
                        hero.rePos(move, iv1);
                    }
                    break;
                case N:
                    if (tower.obstructions[hero.pos[0] + 1][hero.pos[1] + 1] instanceof Wall) {
                    } else if (tower.obstructions[hero.pos[0] + 1][hero.pos[1] + 1] instanceof Creature) {
                        if (hero.attack(hero, tower.obstructions[hero.pos[0] + 1][hero.pos[1] + 1])) {
                            Creature creatureTemp = (Creature) tower.obstructions[hero.pos[0] + 1][hero.pos[1] + 1];
                            tower.occupants.remove(creatureTemp);
                            pane.getChildren().remove(creatureTemp.view);
                            Item itemTemp = creatureTemp.dropItem(creatureTemp);
                            tower.obstructions[hero.pos[0] + 1][hero.pos[1] + 1] = itemTemp;
                            System.out.println(tower.obstructions[hero.pos[0] + 1][hero.pos[1] + 1]);
                            tower.occupants.add(itemTemp);
                            ImageView tempIV = new ImageView(itemTemp.getImgRepresentation());
                            tempIV.setFitHeight(32);
                            tempIV.setFitWidth(32);
                            tempIV.setX((hero.pos[0] + 1) * (640 / 20));
                            tempIV.setY((hero.pos[1] + 1) * (640 / 20));
                            pane.getChildren().add(tempIV);
                        }
                    } else {
                        int[] move = {1, 1};
                        hero.rePos(move, iv1);
                    }
                    break;
                case I:

                    break;
                case COMMA:
                    if (tower.obstructions[hero.pos[0]][hero.pos[1]] instanceof Item) {
                        Inventory.addItem((Item) tower.obstructions[hero.pos[0]][hero.pos[1]]);
                        tower.occupants.remove(tower.obstructions[hero.pos[0]][hero.pos[1]]);
                        pane.getChildren().remove(tower.obstructions[hero.pos[0]][hero.pos[1]].view);
                        tower.obstructions[hero.pos[0]][hero.pos[1]] = null;
                        System.out.println(Inventory.printInventory());
                    }
                    break;
                case ESCAPE:
                    break;
                default:
                    System.out.println("Key not mapped.");
            }
//            if ((e.getCode() == KeyCode.SHIFT) && (e.getCode() == KeyCode.COMMA)) {
//                if (tower.obstructions[hero.pos[0] + 1][hero.pos[1] + 1] instanceof downLadder){
//                    tower.travelFloor(-1, hero);
//                }
//            }
//            if ((e.getCode() == KeyCode.SHIFT) && (e.getCode() == KeyCode.PERIOD)) {
//                if (tower.obstructions[hero.pos[0] + 1][hero.pos[1] + 1] instanceof upLadder){
//                    tower.travelFloor(1, hero);
//                }
//            }
            System.out.println(Arrays.toString(hero.pos));
        });
        iv1.requestFocus();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

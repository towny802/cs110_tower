
/**
 *
 * @author Ben Spenciner
 */
public class Graph {

    Node[][] nodes = new Node[21][21]; //For some reason, this array needs to be 21 by 21. 20 by 20 is too small. 

    public Graph(GamePiece[][] obstructions) { //this should take the obstructions array

        for (int i = 0; i < obstructions.length; i++) {
            for (int j = 0; j < obstructions.length; j++) {
                if (obstructions[i][j] == null) {
                    nodes[i][j] = new Node(new int[]{i, j}, new Wall(new int[]{0,0}));
                } else {
                    nodes[i][j] = new Node(new int[]{i, j}, obstructions[i][j]);
                }
            }
        }
    }
}

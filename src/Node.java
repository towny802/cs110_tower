
/**
 *
 * @author Ben Spenciner
 */
public class Node {

    private int[] location;
    private int distance = 1000; //The max search length would be 21*21, so this is far out of reach
    private Node parent;
    private GamePiece data;

    public Node(int[] location, GamePiece data) {
        setLocation(location);
        setData(data);
    }

//    public Node[] getNeighbors() {
//        Node[] neighbors = new Node[8];
//        
//        Node node1 = new Node(new int[] {this.getLocation()[0], this.getLocation()[1] - 1});
//        neighbors[0] = node1;
//        Node node2 = new Node(new int[] {this.getLocation()[0], this.getLocation()[1] + 1});
//        neighbors[1] = node2;
//        Node node3 = new Node(new int[] {this.getLocation()[0] - 1, this.getLocation()[1]});
//        neighbors[2] = node3;
//        Node node4 = new Node(new int[] {this.getLocation()[0] + 1, this.getLocation()[1]});
//        neighbors[3] = node4;
//        Node node5 = new Node(new int[] {this.getLocation()[0] - 1, this.getLocation()[1] - 1});
//        neighbors[4] = node5;
//        Node node6 = new Node(new int[] {this.getLocation()[0] + 1, this.getLocation()[1] + 1});
//        neighbors[5] = node6;
//        Node node7 = new Node(new int[] {this.getLocation()[0] - 1, this.getLocation()[1] + 1});
//        neighbors[6] = node7;
//        Node node8 = new Node(new int[] {this.getLocation()[0] + 1, this.getLocation()[1] - 1});
//        neighbors[7] = node8;
//        
//        return neighbors;
//    }
    /**
     * @return the location
     */
    public int[] getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(int[] location) {
        this.location = location;
    }

    /**
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     * @return the parent
     */
    public Node getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(Node parent) {
        this.parent = parent;
    }

    /**
     * @return the data
     */
    public GamePiece getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(GamePiece data) {
        this.data = data;
    }

}

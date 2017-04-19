package search;

/**
 * Created by Paully on 2017/4/19.
 */
public class Node {
    public int x;
    public int y;

    public Node pre = null;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Node{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

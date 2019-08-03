package search;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Paully on 2017/4/20.
 */
public class DFSSearch {
    private static int maze[][] = {
            {0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0}
    };

    public static void main(String[] args){
        Node start = new Node(0, 0);
        Node goal = new Node(4, 4);

        int[][] visited = new int[5][5];

        Stack<Node> stack = new Stack<>();
        stack.push(start);
        while(!stack.isEmpty()){
            Node n = stack.peek();
            if(checkGoal(n, goal)){
                getNodePath(n);
                break;
            }


            Node n1 = new Node(n.x + 1, n.y);
            n1.pre = n;
            Node n2 = new Node(n.x - 1, n.y);
            n2.pre = n;
            Node n3 = new Node(n.x, n.y + 1);
            n3.pre = n;
            Node n4 = new Node(n.x, n.y - 1);
            n4.pre = n;

            List<Node> temp = new ArrayList<>();
            temp.add(n1);
            temp.add(n2);
            temp.add(n3);
            temp.add(n4);

            boolean flag = false;
            for(Node node:temp){
                if(checkNode(node, visited)){
                    stack.add(node);
                    visited[node.x][node.y] = 1;
                    flag = true;
                }
            }
            if(!flag){
                stack.pop();
            }
        }
    }

    private static void getNodePath(Node node){
        System.out.print(node);
        while(node.pre != null){
            node = node.pre;
            System.out.print(node);
        }
    }

    private static boolean checkGoal(Node n1, Node goal){
        if(goal.x == n1.x && goal.y == n1.y){
            return true;
        }
        else{
            return false;
        }
    }

    private static boolean checkNode(Node n1, int[][] visited) {
        if(n1.x >= 0 && n1.y >= 0 && n1.x <5 && n1.y < 5 && maze[n1.x][n1.y] == 0 && visited[n1.x][n1.y] == 0){
            return true;
        }
        else{
            return false;
        }
    }
}

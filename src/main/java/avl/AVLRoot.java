package avl;

import java.util.Stack;

/**
 * Created by Paully on 2017/4/2.
 */
public class AVLRoot extends AVLNode{
    public AVLNode root;

    public AVLRoot(){
        root = new AVLNode(this);
    }

    public AVLNode insertValue(int val){
        return root.insertValue(val);
    }

    public void deleteValue(int val){
        root.deleteValue(val);
    }

    public void setChild(AVLNode oldNode, AVLNode newNode){
        root = newNode;
    }

    public void firstVisit(){
        Stack<AVLNode> stack = new Stack<AVLNode>();
        stack.add(root);
        while(!stack.empty()){
            AVLNode node = stack.pop();
            System.out.print(node.value + " ");
            if(node.right != null){
                stack.add(node.right);
            }
            if(node.left != null){
                stack.add(node.left);
            }
        }
    }

    public void middleVisit(){
        Stack<AVLNode> stack = new Stack<AVLNode>();
        AVLNode node = root;
        stack.add(node);
        while(!stack.empty()){
            if(node.left != null){
                node = node.left;
                stack.add(node);
            }
            else{
                node = stack.pop();
                System.out.print(node.value + " ");
                if(node.right != null){
                    node = node.right;
                    stack.add(node);
                }
            }
        }
    }

    public void lastVisit(){
        Stack<AVLNode> stack = new Stack<AVLNode>();
        AVLNode node = root;
        stack.add(node);
        while(!stack.empty()){
            if(node.left != null){
                node = node.left;
                stack.add(node);
            }
            else if(node.right != null){
                node = node.right;
                stack.add(node);
            }
        }
    }

    @Override
    public String toString() {
//        Stack<AVLNode> stack = new Stack<AVLNode>();
//        stack.add(root);
//        while(!stack.empty()){
//            AVLNode n = stack.peek();
//            if(n.left != null){
//
//            }
//        }
        return root.toString();
    }
}

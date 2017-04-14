package avl;

/**
 * 二叉树节点
 * Created by Paully on 2017/4/2.
 */
public class AVLNode {
    public Integer value;

    public AVLNode left;

    public AVLNode right;

    public AVLNode parent;

    /**
     * 左子树深度
     */
    public int ld;

    /**
     * 右子树深度
     */
    public int rd;

    public AVLNode(){
    }

    public AVLNode (AVLNode node){
        parent = node;
    }

    /**
     * 插入值
     * @param val
     */
    public AVLNode insertValue(int val){
        AVLNode node;
        if(value == null){  //本节点为空，插入
            value = val;
            node = this;
        }
        else{
            if(val < value){    //插入值小于当前值，向左节点插入
                if(left == null){
                    left = new AVLNode(this);
                }
                node = left.insertValue(val);
                if(node != null){   //插入左子树成功，左子树深度加1
                    this.ld = (left.getDepth())+1;
                }
                keepBalance(this, node);
            }
            else if(val > value){   //插入值大于当前值，向右节点插入
                if(right == null){
                    right = new AVLNode(this);
                }
                node = right.insertValue(val);
                if(node != null){
                    this.rd = (right.getDepth())+1;
                }
                keepBalance(this, node);
            }
            else{
                node = null;
            }
        }
        return node;
    }

    private static void keepBalance(AVLNode node, AVLNode newNode){
        if(node.ld - node.rd > 1){  //左子树深度大
            if(node.left != null && node.left.value > newNode.value){   //LL的情况
                rightRotate(node);
            }
            else if(node.left != null && newNode.value > node.left.value){  //LR的情况
                leftRotate(node.left);
                rightRotate(node);
            }
        }
        else if(node.rd - node.ld > 1){ //右子树深度大
            if(node.right != null && newNode.value > node.right.value){ //RR的情况
                leftRotate(node);
            }
            else if(node.right != null && node.right.value > newNode.value){
                rightRotate(node.right);
                leftRotate(node);
            }
        }
    }

    private static void leftRotate(AVLNode node){
        AVLNode newRoot = node.right;
        newRoot.parent = node.parent;
        node.parent.setChild(node, newRoot);             //父节点变成右节点

        node.setRight(newRoot.left);
        newRoot.setLeft(node);
        newRoot.ld = node.ld + 1;
    }

    private static void rightRotate(AVLNode node){
        AVLNode newRoot = node.left;
        newRoot.parent = node.parent;
        node.parent.setChild(node, newRoot);             //父节点变成左节点

        node.setLeft(newRoot.right);
        newRoot.setRight(node);
        newRoot.rd = node.rd + 1;
    }

    /**
     * 节点深度计算
     * @return
     */
    public int getDepth(){
        return ld>rd?ld:rd;
    }

    /**
     * 删除值
     * @param val
     */
    public void deleteValue(int val){
        if(value == null){   //找不到节点
            return;
        }
        else if(val < value){   //比当前节点小，往左删除
            left.deleteValue(val);
        }
        else if(val > value){
            right.deleteValue(val);
        }
        else{  //删除当前节点
            if(left == null && right == null){

            }
            else if(left != null && right == null){
                parent.setChild(this, left);
            }
            else if(left == null && right != null){
                parent.setChild(this, right);
            }
            else{       //两个字节点都在
                AVLNode node = getMaxNode(left);
                parent.setChild(this, node);
                node.right = right;
                if(node != left){
                    node.setChild(node.left, left);
                    node.parent.setChild(node, null);
                }
            }
            parent = null;
        }
    }

    public void setLeft(AVLNode newNode){
        left = newNode;
        if(newNode != null){
            newNode.parent = this;
            this.ld = left.getDepth() + 1;
        }
        else{
            this.ld = 0;
        }
    }

    public void setRight(AVLNode newNode){
        right = newNode;
        if(newNode != null){
            newNode.parent = this;
            this.rd = right.getDepth() + 1;
        }
        else{
            this.rd = 0;
        }
    }

    public void setChild(AVLNode oldNode, AVLNode newNode){
        if(left == oldNode){
            setLeft(newNode);
        }
        else if(right == oldNode){
            setRight(newNode);
        }
    }

    public static AVLNode getMaxNode(AVLNode node){
        if(node.right == null){
            return node;
        }
        else{
            return getMaxNode(node.right);
        }
    }

    @Override
    public String toString() {
        return "{" +
                "\"value\":\"" + value + "\"" +
                ", \"left\":" + left + "" +
                ", \"right\":" + right + "" +
                ", \"ld\":" + ld + "" +
                ", \"rd\":" + rd + "" +
                '}';
    }
}

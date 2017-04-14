package avl;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Paully on 2017/4/2.
 */
public class AVLTest {
    AVLRoot visitRoot;
    @Before
    public void before(){
//        visitRoot = new AVLRoot();
//        visitRoot.insertValue(6);
//        visitRoot.insertValue(3);
//        visitRoot.insertValue(1);
//        visitRoot.insertValue(2);
//        visitRoot.insertValue(5);
//        visitRoot.insertValue(4);
//        visitRoot.insertValue(9);
//        visitRoot.insertValue(7);
//        visitRoot.insertValue(8);
    }

    @Test
    public void insertNode(){
        AVLRoot root = new AVLRoot();
        root.insertValue(9);
        System.out.println(root);
        root.insertValue(8);
        System.out.println(root);
        root.insertValue(7);
        System.out.println(root);
        root.insertValue(6);
        System.out.println(root);
        root.insertValue(5);
        System.out.println(root);
        root.insertValue(4);
        System.out.println(root);
        root.insertValue(3);
        System.out.println(root);
        root.insertValue(2);
        System.out.println(root);
        root.insertValue(1);
        System.out.println(root);
    }


    @Test
    public void insertNode2(){
        AVLRoot root = new AVLRoot();
        for(int i=1;i<20;i++){
            root.insertValue(i);
        }
        System.out.println(root);
    }

    @Test
    public void insertNode3(){
        AVLRoot root = new AVLRoot();
        for(int i=18;i>0;i=i-2){
            root.insertValue(i);
        }
        System.out.println(root);
        root.insertValue(7);
        System.out.println(root);
    }

    @Test
    public void insertNode4(){
        AVLRoot root = new AVLRoot();
        for(int i=2;i<20;i=i+2){
            root.insertValue(i);
        }
        System.out.println(root);
        root.insertValue(15);
        root.insertValue(17);
        System.out.println(root);
    }

    @Test
    public void deleteValue(){
        AVLRoot root = new AVLRoot();
        root.insertValue(5);
        root.insertValue(2);
        root.insertValue(1);
        root.insertValue(0);
        root.insertValue(3);
        root.insertValue(8);
        root.insertValue(4);
        System.out.println(root);

        root.deleteValue(2);
        System.out.println(root);
    }

    @Test
    public void firstVisit(){
        System.out.println(visitRoot);
        visitRoot.firstVisit();
    }

    @Test
    public void middleVisit(){
        System.out.println(visitRoot);
        visitRoot.middleVisit();
    }

    @Test
    public void lastVisit(){
        System.out.println(visitRoot);
        visitRoot.lastVisit();
    }
}

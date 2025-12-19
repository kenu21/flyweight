package keniu;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String colour, String texture) {
        trees.add(new Tree(x, y, Tree.TreeFactory.getTreeType(name, colour, texture)));
    }

    public void draw() {
        System.out.println(trees);
    }
}

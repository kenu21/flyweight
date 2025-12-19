package keniu;

import java.util.HashMap;
import java.util.Map;

public class Tree {
    private int x;
    private int y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    private static class TreeType {
        private String name;
        private String colour;
        private String texture;

        private TreeType(String name, String colour, String texture) {
            this.name = name;
            this.colour = colour;
            this.texture = texture;
        }

        @Override
        public String toString() {
            return "TreeType{" +
                    "name='" + name + '\'' +
                    ", colour='" + colour + '\'' +
                    ", texture='" + texture + '\'' +
                    ", objectId=" + System.identityHashCode(this) +
                    '}';
        }
    }

    public static class TreeFactory {
        private static Map<String, TreeType> treeTypes = new HashMap<>();

        public static TreeType getTreeType(String name, String colour, String texture) {
            String key = String.format("%s-%s-%s", name, colour, texture);
            if (treeTypes.containsKey(key)) {
                return treeTypes.get(key);
            } else {
                TreeType treeType = new TreeType(name, colour, texture);
                treeTypes.put(key, treeType);
                return treeType;
            }
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "x=" + x +
                ", y=" + y +
                ", treeType=" + treeType +
                '}';
    }
}

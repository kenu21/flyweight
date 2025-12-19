package keniu;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        String name = "apple";
        String colour = "green";
        String texture = "rough";
        for (int i = 0; i < 20; i++) {
            forest.plantTree(i, i + 1, name, colour, texture);
        }
        forest.draw();
    }
}

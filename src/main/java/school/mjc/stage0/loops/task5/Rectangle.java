package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        for (int a = 1; a <= height; a++) {
            for (int b = 1; b <= length; b++) {
                if (b == 1 || b == length || a == 1 || a == height)
                    System.out.print(8);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

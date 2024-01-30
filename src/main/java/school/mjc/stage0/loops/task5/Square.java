package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int a = 0; a < sideLength; a ++) {
            for (int b = 0; b < sideLength - 1; b++) {
                if (a == 0 || b == 0 || a == sideLength - 1)
                    System.out.print(8);
                else System.out.print(' ');
            }
            System.out.println(8);
        }
    }
}

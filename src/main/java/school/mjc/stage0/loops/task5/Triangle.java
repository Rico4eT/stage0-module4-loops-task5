package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int a = 1; a <= cathetusLength; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}


//public class Triangle {
//    public void printTriangle(int cathetusLength) {
//        String eight = "8";
//        int counter = 1;
//        while (counter <= cathetusLength) {              SECOND METHOD WITH ONE LOOP && WHILE
//            System.out.println(eight);
//            eight += "8";
//            counter ++;
//        }
//    }
//}
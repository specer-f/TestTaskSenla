package Task;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 0;
        for (int i = 0; i < 4; i++) {
            boolean Sub = in.nextBoolean();
            if (Sub) k++;
        }
        if (k == 2) System.out.println("True");
    }
}

package Task;

import java.awt.*;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String row = in.nextLine();
        boolean check = true;
        for(int i = 0; i < row.length()/2+1; i++){
            if(row.charAt(i) != row.charAt(row.length() - i - 1)){
                check = false;
                break;
            }
        }
        if(check) System.out.println("Палиндром");
    }
}

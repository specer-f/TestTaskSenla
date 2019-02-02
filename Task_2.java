package Task;

import java.util.Scanner;

public class Task_2 {

    public static long function(long N){
        if(N == 0) return 0;
        if(N == 1) return 1;
        return (function(N-1) + function(N-2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextInt();
        System.out.println(function(N));
    }

}

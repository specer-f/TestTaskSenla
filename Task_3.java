package Task;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < mass.length; i++){
            mass[i] = in.nextInt();
        }
        for(int i = mass.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( mass[j] < mass[j+1] ){
                    int tmp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < mass.length; i++){
            System.out.println(mass[i]);
        }
    }

}

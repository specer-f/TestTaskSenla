package Task;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean[] mass = new boolean[num];
        for(int i = 0; i < mass.length; i++){
            mass[i] = true;
        }
       //mass[1]=false;
        for(int i = 2; i*i < num; i++){
            if(mass[i]){
                for(int j = i*i; j < num ; j += i){
                    mass[j] = false;
                }
            }
        }
        for(int i = 2; i < mass.length; i++){
            if(mass[i])System.out.println(i);
        }
    }
}

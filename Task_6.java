package Task;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String row = in.nextLine();
        String result = row.replaceAll("\\d", "");//Используем регулярное выражение, заменяя все числа на пустые строки
        System.out.println(result);
    }
}

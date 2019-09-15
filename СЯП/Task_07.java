package task_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Double> testList = new ArrayList();
        boolean b;
        String[] str;
        do {
            System.out.print("Введите через пробел не менее 4-х вещественных чисел: ");
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            str = s.split(" ");
            if (str.length < 4) {
                System.out.println("Необходимо ввести не менее 4-х вещественных чисел!");
                b = true;
            } else {
                b = false;
            }
        } while (b);

        for (String st : str) {
            testList.add(Double.parseDouble(st));
        }
        Collections.sort(testList);
//        for (int i = 0; i < testList.size(); i++) {
//            System.out.println(testList.get(i));
//        }
        System.out.println("Минимальный элемент: " + testList.get(0));
        System.out.print("Три элемента, ближайших больших по величине минимального: ");
        for (int i = 1; i < 4; i++) {
            System.out.print(testList.get(i) + " ");
        }
        System.out.println();
    }
}

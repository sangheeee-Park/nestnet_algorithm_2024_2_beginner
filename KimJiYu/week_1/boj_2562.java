package nestnet_algorithm_2024_2_beginner.KimJiYu.week_1;

import java.util.Scanner;

public class boj_2562 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[9];

        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i+1;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
        scanner.close();

    }
}
package array;

import java.util.Scanner;

public class Weather_Answer {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("How many days' temperatures? ");
        int days = console.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1) + "'s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        System.out.println("Average temp = " + average);
        System.out.println();
        System.out.println(count + " days above average");
    }
}

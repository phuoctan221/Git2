package max_min;

import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu trong mang: ");
        int so = sc.nextInt();
        int max = 0;

        int[] mang = new int[so];
        float sum = 0;
        for (int i = 0; i < so; i++) {
            System.out.print("a[" + i + "]= ");
            mang[i] = sc.nextInt();

        }
        for (int i = 0; i < so; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        int min = 0;
        min = mang[0];
        for (int i = 0; i < so; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        System.out.println("So lon nhat trong mang la: " + max);
        System.out.println("So nho nhat trong mang la: " + min);
    }

}

package array;

import java.util.Scanner;

public class TinhTBC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu trong mang: ");
        int so = sc.nextInt();
        int[] mang = new int[so];
        int sum = 0;
        for (int i = 0; i < so; i++) {
            System.out.print("a[" + i + "]= ");
            mang[i] = sc.nextInt();
            sum += mang[i];
        }
        System.out.println("Tong cac so trong mang la: " + sum);
    }
}

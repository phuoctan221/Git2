
package array;

public class ArraytoString {
    public static void main(String[] args) {
        int[] e = {0,2,3,4,5};
        e[1] = e[3] + e[4];
        System.out.println("e is" + Array.toString(e));
    }
}

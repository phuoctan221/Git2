package array;

public class Array {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < 9; i++) {
            num[i] = 2 * i;
            System.out.println(num[i]);
        }

    }
}

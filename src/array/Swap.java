
package array;


public class Swap {
    public static void main(String[] args) {
        int[] num = {11 ,42, -5, 27, 0, 89};
        for(int i=0; i< num.length/2;i++)
        {
            int temp = num[i];
            num[i] = num[num.length  - 1 - i];
            num[num.length - 1 - i] = temp;
        }     
        for(int i=0; i<num.length;i++)
            
        {
            System.out.println(num[i]);
        }
    }
}

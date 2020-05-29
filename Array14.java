/* WAP to accept N integers from user and find the Second largest/Second Smallest element. */
import java.util.*;
class Main
{
    public static void main (String[] args) {
        int num=0;
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int MAX_INT = len-1;
        for (int i=MAX_INT;i>=0;i--)
        {
            if (arr[MAX_INT]>arr[i])
            {
                num = arr[i];
                break;
            }
        }
        System.out.println("Second largest number: " + num);
    }
}

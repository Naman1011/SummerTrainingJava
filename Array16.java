/* WAP to accept 10 integers in an array and display the non-repeating Array 
(eq-  1, 2 , 3, 5, 6, 7, 2, 3 , 5)--- 1,6,7 */

import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int j;
        for (int i=0;i<arr.length;i++)
        {
            int count = 0;
            for (j=i;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            if (count==1)
            {
            System.out.print(arr[i] + " ");
            }
            i=j-1;
        }
    }
}

/* 7.	WAP to accept 5 numbers in an array and search a given number. 
If the number exists display its frequency else display a suitable message. */

import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<5;i++)
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
            System.out.println(arr[i] + "--->" + count);
            i=j-1;
        }
    }
}

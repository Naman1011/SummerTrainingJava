/* WAP to accept a sentence and extract the palindrome words. */
import java.util.Scanner;
class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i,j;
        for (i=0;i<str.length();i++)
        {
            String pal = " ";
            for (j=i;j<str.length();j++)
            {
                if (str.charAt(j)==32)
                {
                    break;
                }
                pal = pal + str.charAt(j);
            }
            boolean res = palindrome(pal.trim());
            if (res==true)
            {
                System.out.print(pal.trim() + " ");
            }
            i=j;
        }
    }
    
    public static boolean palindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<=j)
        {
            if (str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

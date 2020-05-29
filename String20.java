/* WAP to accept a sentence and display the words having length is greater than 5 */
import java.util.Scanner;
class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i,j;
        for (i=0;i<str.length();i++)
        {
            int count=0;
            for (j=i;j<str.length();j++)
            {
                if (str.charAt(j)==32)
                {
                    break;
                }
                count++;
            }
            if (count>=5)
            {
                System.out.print(str.substring(i,j) + " ");
            }
            i=j;
        }
    }
}

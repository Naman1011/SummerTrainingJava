/* WAP to accept a sentence and display the words having double sequences.(eq- I Like Rabbit---- rabbit) */
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
            boolean res = occ(pal.trim());
            if (res==true)
            {
                System.out.print(pal.trim() + " ");
            }
            i=j;
        }
    }
    
    public static boolean occ(String str)
    {
        for (int i=0;i<str.length()-1;i++)
        {
            if (str.charAt(i)==str.charAt(i+1))
            {
                return true;
            }
        }
        return false;
    }
}

import java.util.Scanner;
public class XPattern
{
    static void f1(int left, int right, int len,char[] s)
    {
        
        for(int i=0; i<len; i++)
        {
            if(i==left || i==right)
            {
                //int b[i]=1;
                System.out.print(s[i]);
            }
            else
            {
                //int b[i]=0;
                System.out.print(" ");
            }

        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        char[] chars=str.toCharArray();
        int left=0;
        int len=chars.length;
        
        int right=len - 1;
        int m=right/2;
        int r=0;
        for(int i=0; i<len; i++ )
        {
            if(i==m)
            {
                r=1;
            }
            if(r==0)
            {
                f1(left, right, len, chars);
                left++;
                right--;
                System.out.println();
            }
            else
            {
                f1(left, right, len, chars);
                left--;
                right++;
                System.out.println();
            }
             
       
        }
        
        
    }
}
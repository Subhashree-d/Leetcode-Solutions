import java.util.*;
class Solution {
    boolean isPalindrome(int x) {
        int r=0,rem;
        int o=x;
        while(x>0)
        {
            rem=x%10;
            r=r*10+rem;
            x=x/10;
        }
        if(o==r)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Main{
    public static void main(String args[])
    {
    Scanner ob=new Scanner(System.in);
    int num=ob.nextInt();
    //isPalindrome(num);
    //System.out.println(isPalindrome(num));
    }
}

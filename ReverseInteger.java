class Solution {
    public int reverse(int x) {
        if(x<0)
        {
            x=x*(-1);
            return op(x)*-1;          
        }
        else
        {
            return op(x);
        }
    }
    public int op(int x)
    {
        long temp=0;
          while(x>0)
            {
                temp = temp*10 + x%10;
                x = x/10;
            }
            if(temp>=Math.pow(2,31))
            {
                return 0;
            }
            else
            {
                return (int)temp;
            }
    }
}

class Solution 
{
    public int fib(int n) 
    {
        //Common Cundition.
        if(n == 1 || n == 0) return n;

        // Using recursion 
        return fib(n-1)+fib(n-2);

        // Using iterative method
        // int last = 1, secondLast = 1;
        // n -= 2;

        // while(n-- > 0){
        //     int temp = last;
        //     last += secondLast;
        //     secondLast = temp;
        // }

        // return last;
    }
}
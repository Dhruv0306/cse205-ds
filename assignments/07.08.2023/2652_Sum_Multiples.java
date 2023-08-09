/*
Name: Dhruv Patel.
Enrollment Number: AU2240166.
 */

class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        while(n>=1){
            if(n%7 == 0 || n%5 == 0 || n%3 == 0)sum += n;
            n--;
        }
        return sum;
    }
}
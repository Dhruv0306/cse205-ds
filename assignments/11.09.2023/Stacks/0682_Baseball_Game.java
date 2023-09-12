class Solution {
    public int calPoints(String[] operations) {
        // Stack<Integer> stack = new Stack<>();
        // for(String s: operations){
        //     if(s.equals("C")){
        //         if(!stack.empty())stack.pop();
        //     }else{
        //         if(s.equals("D"))stack.push(stack.peek()*2);
        //         else if(s.equals("+")){
        //             int temp = stack.pop();
        //             int t = stack.peek()+temp;
        //             stack.push(temp);
        //             stack.push(t);
        //         }else{
        //             stack.push(Integer.parseInt(s));
        //         }
        //     }
        // }
        // int sum = 0;
        // while(!stack.empty()){
        //     sum += stack.pop();
        // }
        // System.gc();
        // return sum;

        int[] array = new int[operations.length];
        int output = 0;
        for( int i = 0, j = -1; i < operations.length; i++) {
            if (operations[i].equals("C"))
            {
                array[j] = 0;
                j--;
            } else if (operations[i].equals("D")) {
                j++;
                array[j] = 2 * (array[j-1]);
            } else if (operations[i].equals("+")) {
                j++;
                array[j] = (array[j-1] + array[j-2]);
            } else {
                j++;
                array[j] = (Integer.parseInt(operations[i]));
            }
        }
        for (int n : array) {
                output += n;
            }
        return output;
    }
}
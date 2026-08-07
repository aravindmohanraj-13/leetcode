class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int product = 1;
            int temp_n = n;
            while(temp_n != 0){
                int digit = temp_n % 10;
                product *= digit;
                temp_n /= 10; 
            }if(product % t == 0){
                return n;
            }else{
                n += 1;
            }
        }
    }
}
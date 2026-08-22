class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int duplicate = n;
        while(n != 0){
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n /= 10;
        }
        if(duplicate % (sum + product) == 0) return true;
        else return false;
    }
}
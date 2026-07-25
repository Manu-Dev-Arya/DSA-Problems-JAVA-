class Solution {
    public int maxProduct(int n) {
    int largest = Integer.MIN_VALUE+1;
    int secondLargest = Integer.MIN_VALUE;
    while(n > 0){
        int digit = n % 10;
        if(digit >= largest){
            secondLargest = largest;
            largest = digit;
        }else if( digit > secondLargest){
            secondLargest = digit;
        }
        n = n / 10;
    } 
    return largest * secondLargest;   
    }
}
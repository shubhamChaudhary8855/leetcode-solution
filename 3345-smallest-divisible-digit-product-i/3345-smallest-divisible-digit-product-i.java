class Solution {
    
    public int smallestNumber(int n, int t) {
        while(true){
            int p=prod(n);
            if(p%t==0){
                return n;
            }
            n++;
        }
        
    }
    int prod(int n){
        int prods=1;
        while(n!=0){
            int rem=n%10;
            prods=prods*rem;
            n=n/10;
        }
        return prods;

    }
}
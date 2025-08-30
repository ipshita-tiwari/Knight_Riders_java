class Solution {
    private int solve( int n,int k){
        if (n==1) return 0;
    
    int len = (int)(Math.pow(2,n-2));
    if(k<=len) return solve(n-1,k);
    else return 1 - solve(n - 1, k - len);
    
    }
    public int kthGrammar(int n, int k) {
       return solve(n,k);
    }
}
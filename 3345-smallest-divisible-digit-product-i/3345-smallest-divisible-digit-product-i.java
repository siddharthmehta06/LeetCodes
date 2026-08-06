class Solution {
    public int smallestNumber(int n, int t) {
        int ans = 1;
        while(true){
        int x = n;
        int mul =1;
        while(x!=0){
        int num =x%10;
        mul = mul*num;
        x=x/10;
        }
        if(mul%t==0){
            ans =n;
            break;
        }else{
            n++;
            
        }
        }
    return ans;
    }
}

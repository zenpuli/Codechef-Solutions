import java.util.Scanner;
class Solution {
    public String checkCoupon(int n, int x, int y, int[] prices) {
        // write your code here
        int or_cost=0;
        String a="COUPON",b="NO COUPON";
        
        for(int i=0;i<n;i++)
            or_cost+=prices[i];
    
        int coupon_discount=0;
        coupon_discount+=x;
        
        for(int i=0;i<n;i++){
            if(prices[i]>y){
                prices[i]=prices[i]-y;
                coupon_discount+=prices[i];
            }
        }
        
        if(or_cost<=coupon_discount)
            return b;
        else
            return a;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test_cases=sc.nextInt();
        while(test_cases-- > 0){
            int n=sc.nextInt();
            int prices[]=new int[n];
            
            int x=sc.nextInt();
            int y=sc.nextInt();
            
            for(int i=0;i<n;i++)
                prices[i]=sc.nextInt();
                
            Solution s1=new Solution();
            
            String result=s1.checkCoupon(n, x, y, prices);
            System.out.println("result");
        }
    }
}

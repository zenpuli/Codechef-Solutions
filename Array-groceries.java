class Solution {
    public int compute(int n, int x, int[] a, int[] b) {
        // write your code here 
        int cost=0,j=0;
        
        for(int i=0;i<n;i++){
            if(a[i]>=x){
                j=i;
                cost+=b[j];
            
            }
        }
        return cost;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        
        int x=sc.nextInt();
        
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        
        Solution s1=new Solution();
        int result=s1.compute(n, x, a, b);
        
        System.out.println(result);
        sc.close();
    }
}

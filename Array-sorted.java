public static boolean check(int[] nums) {
    /*    // write your code here
        boolean ch=false;
        int t[]=new int[nums.length];
        for(int i=0;i<t.length;i++)
            t[i]=nums[i];*/
            
        int bp=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i])
                bp++;
        }
        
        if(bp>1)
            return false;
        else
            return true;
    }
    
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int nums[]=new int[n];
        
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        
        boolean result=check(nums);
        System.out.println(result);
        
        sc.close();
    }
}
    

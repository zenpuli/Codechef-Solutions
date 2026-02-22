import java.util.*;

class Solution{
    
public static int singleNumber(int[] nums){
    int result=0;
    for(int num: nums)
        result^=num;
    return result;
}
        
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int test_cases=sc.nextInt();
        
        while(test_cases-- > 0){
            int n=sc.nextInt();
            int nums[]=new int[n];
            
            for(int num: nums)
                num=sc.nextInt();
                
            int result=singleNumber(nums);
            System.out.println(result);
        }
        sc.close();
    }
}

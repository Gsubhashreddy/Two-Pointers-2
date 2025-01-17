
//T(N)=O(N)
//S(N)=O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int co=0;
        int pr=-1;  //keep the track of where the intial count of a number>2
        int prev=nums[0];
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==prev){
                co+=1;
                if(co>2)
                {
                    //change the pr value if pr==-1
                    if(pr==-1)
                        pr=i;
                    
                }
            }
            else{
                // New element Encuntered Here
                co=1;
                
            }
            prev=nums[i];
            if((pr>0)&&(co<=2))			// Move the elements to the pr index
            {
                nums[pr]=nums[i];
                pr+=1;
            }
        }
        if(pr==-1) return nums.length;
        return pr;
        
    }
}
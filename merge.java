//T(N)=O(M+N)
//S(N)=O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ins=nums1.length-1;
        int i=m-1; // pointer to last element in nums1
        int j=n-1; // pointer to last element in nums2
        

        if(m==0)
            nums1[0]=nums2[0];
       while(j>=0)		// pointer to last element in nums1
        {
           if(i<0)		// Move all the elements from nums2 to nums1
           {
               nums1[ins]=nums2[j];
                j-=1;
               
           }
            else if(nums1[i]>=nums2[j])	// Move nums[i] to index and decrease i
            {
                nums1[ins]=nums1[i];
                i-=1;
            }
            else{
                nums1[ins]=nums2[j]; 	// Move nums[j] to index and decrease j
                j-=1;
                
            }
            ins-=1;
        }
        
     
        
        
    }
}